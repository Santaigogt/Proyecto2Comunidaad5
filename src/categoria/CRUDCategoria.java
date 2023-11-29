package categoria;

import java.util.HashMap;

public class CRUDCategoria extends Categoria {

    private HashMap<String, Categoria> DefCategorias;

    public CRUDCategoria(String codigoCat, String nombre) {
        super(codigoCat, nombre);
        DefCategorias = new HashMap<>();
    }

    public void añadirCategoria(Categoria categoria) {
        DefCategorias.put(categoria.getCodigoCat(), categoria);
    }

    public Categoria buscarCategoria(String codigoCat) {
        return DefCategorias.get(codigoCat);
    }

    public void eliminarCategoria(String codigoCat) {
        DefCategorias.remove(codigoCat);
    } 
    
}
