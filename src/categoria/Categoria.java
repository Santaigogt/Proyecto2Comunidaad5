package categoria;

/**
 *
 * @author bizco
 */
public class Categoria {

    private String codigo;
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DefCategoria: Codigo: " + codigo + ", Nombre: " + nombre + ".";
    }

    public boolean lleno() {
        return !this.codigo.equals("") && !this.nombre.equals("");
    }
}
