package org.itc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LibroRepositorio extends CrudRepository<Libro, Integer> {
    List<Libro> findByNombreContainingIgnoreCaseOrAutorContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrIsbnContainingIgnoreCase(
            String nombre, String autor, String editorial, String isbn);
    
    default List<Libro> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrAutorContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrIsbnContainingIgnoreCase(
                criterio, criterio, criterio, criterio);
    }
}