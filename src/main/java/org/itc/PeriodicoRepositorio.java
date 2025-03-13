package org.itc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class PeriodicoRepositorio implements RecursoRepositorio<Periodico> {
    private List<Periodico> periodicos = new ArrayList<>();

    @Override
    public void agregar(Periodico periodico) {
        periodicos.add(periodico);
    }

    @Override
    public void eliminar(Periodico periodico) {
        periodicos.remove(periodico);
    }

    @Override
    public Collection<Periodico> buscar(String nombre) {
        return new ArrayList<>(periodicos);
    }

    @Override
    public List<Periodico> obtenerTodos() {
        return new ArrayList<>(periodicos);
    }
}