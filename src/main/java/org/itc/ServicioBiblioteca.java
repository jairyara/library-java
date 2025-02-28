package org.itc;

import java.util.*;
import java.util.stream.Collectors;

public class ServicioBiblioteca {
    private List<Recurso> recursos;

    public ServicioBiblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void agregar(Recurso recurso) {
        if (recurso != null) {
            recursos.add(recurso);
        }
    }

    public void quitarRecurso(Recurso recurso) {
        recursos.remove(recurso);
    }

    public Collection<Recurso> buscarRecursos(String criterio) {
        return recursos.stream()
                .filter(recurso -> recurso.coincideConCriterio(criterio))
                .collect(Collectors.toList());
    }

    public Collection<Recurso> obtenerTodos() {
        return new ArrayList<>(recursos);
    }
}
