package categoria;

/**
 *
 * @author bizco
 */
public class Pelicula {

    private String codigo;
    private String nombre;
    private String categoria;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Pelicula(String codigo, String nombre, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
