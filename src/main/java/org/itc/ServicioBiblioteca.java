package org.itc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ServicioBiblioteca {
    private final RepositorioLibro repositorioLibro;
    private List<Recurso> recursos;

    @Autowired
    public ServicioBiblioteca(RepositorioLibro repositorioLibro) {
        this.repositorioLibro = repositorioLibro;
        this.recursos = new ArrayList<>();
    }

    public void agregar(Recurso recurso) {
        if (recurso != null) {
            recursos.add(recurso);
            if (recurso instanceof Libro) {
                repositorioLibro.save((Libro) recurso);
            }
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
