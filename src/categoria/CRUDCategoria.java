package categoria;

import java.util.HashMap;

public class CRUDCategoria extends Categoria {

    private HashMap<String, Categoria> DefCategorias;

    public CRUDCategoria(String codigo, String nombre) {
        super(codigo, nombre);
        DefCategorias = new HashMap<>();
    }

    public void añadirCategoria(Categoria categoria) {
        DefCategorias.put(categoria.getCodigo(), categoria);
    }

    public Categoria buscarCategoria(String codigo) {
        return DefCategorias.get(codigo);
    }

    public void eliminarCategoria(String codigo) {
        DefCategorias.remove(codigo);
    }
}
