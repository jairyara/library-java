package org.itc;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LibroRepositorio extends CrudRepository<Libro, Integer> {
    List<Libro> findByNombreContainingIgnoreCaseOrAutorContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrIsbnContainingIgnoreCase(
            String nombre, String autor, String editorial, String isbn);
    
    default List<Libro> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrAutorContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrIsbnContainingIgnoreCase(
                criterio, criterio, criterio, criterio);
    }
}