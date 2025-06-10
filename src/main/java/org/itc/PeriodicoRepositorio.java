package org.itc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PeriodicoRepositorio extends CrudRepository<Periodico, Integer> {
    List<Periodico> findByNombreContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrFechaPublicacionContaining(
            String nombre, String editorial, String fechaPublicacion);
    
    default List<Periodico> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrEditorialContainingIgnoreCaseOrFechaPublicacionContaining(
                criterio, criterio, criterio);
    }
}