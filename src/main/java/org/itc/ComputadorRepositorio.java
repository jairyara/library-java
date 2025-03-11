package org.itc;

import org.itc.Computador;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComputadorRepositorio implements Repositorio<Computador> {
    private List<Computador> computadores = new ArrayList<>();

    @Override
    public void agregar(Computador computador) {
        computadores.add(computador);
    }

    @Override
    public void eliminar(Computador computador) {
        computadores.remove(computador);
    }

    @Override
    public Computador buscar(int id) {
        return computadores.stream().filter(computador -> computador.getNombre() == ).findFirst().orElse(null);
    }

    @Override
    public List<Computador> obtenerTodos() {
        return new ArrayList<>(computadores);
    }
}
