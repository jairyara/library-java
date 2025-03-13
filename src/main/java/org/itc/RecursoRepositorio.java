package org.itc;

import java.util.Collection;
import java.util.List;

public interface RecursoRepositorio<T extends Recurso> {
    void agregar(T elemento);
    void eliminar(T elemento);
    Collection<T> buscar(String nombre);
    List<T> obtenerTodos();
}
