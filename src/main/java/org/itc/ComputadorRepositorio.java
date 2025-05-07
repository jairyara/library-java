package org.itc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ComputadorRepositorio extends CrudRepository<Computador, Integer> {
    List<Computador> findByNombreContainingIgnoreCaseOrMarcaContainingIgnoreCaseOrModeloContainingIgnoreCaseOrTipoContainingIgnoreCase(
            String nombre, String marca, String modelo, String tipo);
    
    default List<Computador> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrMarcaContainingIgnoreCaseOrModeloContainingIgnoreCaseOrTipoContainingIgnoreCase(
                criterio, criterio, criterio, criterio);
    }
}