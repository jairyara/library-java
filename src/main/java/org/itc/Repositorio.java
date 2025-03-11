package org.itc;

import java.util.List;

public interface Repositorio<T> {
    void agregar(T elemento);
    void eliminar(T elemento);
    T buscar(int id);
    List<T> obtenerTodos();
}
