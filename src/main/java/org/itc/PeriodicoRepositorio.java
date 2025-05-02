package org.itc;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PeriodicoRepositorio extends CrudRepository<Periodico, Integer> {
    List<Periodico> findByNombreContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrFechaPublicacionContaining(
            String nombre, String editorial, String fechaPublicacion);
    
    default List<Periodico> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrFechaPublicacionContaining(
                criterio, criterio, criterio);
    }
}