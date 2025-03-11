package org.itc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeriodicoRepositorio implements Repositorio<Periodico> {
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
    public Periodico buscar(int id) {
        return periodicos.stream().filter(periodico -> periodico.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Periodico> obtenerTodos() {
        return new ArrayList<>(periodicos);
    }
}