package categoria;

import java.util.HashSet;
import java.util.Set;

public class CRUDPeliculas {

    private Set<Pelicula> peliculas;

    public CRUDPeliculas() {
        peliculas = new HashSet<>();
    }

    public boolean agregarPelicula(Pelicula pelicula) {
        if (buscarPelicula(pelicula.getCodigoPeli()) != null) {
            return false;
        }
        peliculas.add(pelicula);
        return true;
    }

    public Pelicula buscarPelicula(String codigoPeli) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getCodigoPeli().equals(codigoPeli)) {
                return pelicula;
            }
        }
        return null;
    }

    public boolean actualizarPelicula(Pelicula peliculaActualizada) {
        Pelicula peliculaExistente = buscarPelicula(peliculaActualizada.getCodigoPeli());
        if (peliculaExistente != null) {
            peliculas.remove(peliculaExistente);
            peliculas.add(peliculaActualizada);
            return true;
        }
        return false;
    }

    public boolean eliminarPelicula(String codigoPeli) {
        Pelicula pelicula = buscarPelicula(codigoPeli);
        if (pelicula != null) {
            peliculas.remove(pelicula);
            return true;
        }
        return false;
    }

    public Set<Pelicula> obtenerTodasLasPeliculas() {
        return peliculas;
    }
    
    
}
