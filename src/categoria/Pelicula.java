package categoria;

/**
 *
 * @author bizco
 */
public class Pelicula extends CRUDCategoria {

    private String codigoPeli;
    private String nombrePeli;
    private Categoria categoria;

    public String getCodigoPeli() {
        return codigoPeli;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public Pelicula(String codigoPel, String nombrePeli, Categoria categoria, String codigoCat, String nombreCat) {
        super(codigoCat, nombreCat);
        this.codigoPeli = codigoPeli;
        this.nombrePeli = nombrePeli;
        this.categoria = categoria;
    }
        public Pelicula(String codigoPel, String nombrePeli, String codigoCat, String nombreCat) {
        super(codigoCat, nombreCat);
        this.codigoPeli = codigoPeli;
        this.nombrePeli = nombrePeli;
        this.categoria = categoria;
    }

}
