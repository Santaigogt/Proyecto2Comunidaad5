package categoria;

/**
 *
 * @author bizco
 */
public class Categoria {

    private String codigoCat;
    private String nombreCat;

    
    public String getCodigoCat() {
        return codigoCat;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public Categoria(String codigo, String nombre) {
        this.codigoCat = codigoCat;
        this.nombreCat = nombreCat;
    }

    @Override
    public String toString() {
        return "DefCategoria: Codigo: " + codigoCat + ", Nombre: " + nombreCat + ".";
    }

    public boolean lleno() {
        return !this.codigoCat.equals("") && !this.nombreCat.equals("");
    }
}
