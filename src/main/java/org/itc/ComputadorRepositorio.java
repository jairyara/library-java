package org.itc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ComputadorRepositorio implements RecursoRepositorio<Computador> {
    private final List<Computador> computadores = new ArrayList<>();

    @Override
    public void agregar(Computador computador) {
        computadores.add(computador);
    }

    @Override
    public void eliminar(Computador computador) {
        computadores.remove(computador);
    }

    @Override
    public Collection<Computador> buscar(String nombre) {
        return new ArrayList<>(computadores);
    }

    @Override
    public List<Computador> obtenerTodos() {
        return new ArrayList<>(computadores);
    }
}