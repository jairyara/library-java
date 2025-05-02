package org.itc;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ComputadorRepositorio extends CrudRepository<Computador, Integer> {
    List<Computador> findByNombreContainingIgnoreCaseOrMarcaContainingIgnoreCaseOrModeloContainingIgnoreCaseOrTipoContainingIgnoreCase(
            String nombre, String marca, String modelo, String tipo);
    
    default List<Computador> findByCriteria(String criterio) {
        return findByNombreContainingIgnoreCaseOrMarcaContainingIgnoreCaseOrModeloContainingIgnoreCaseOrTipoContainingIgnoreCase(
                criterio, criterio, criterio, criterio);
    }
}