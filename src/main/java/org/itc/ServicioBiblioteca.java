package org.itc;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;

    import java.util.*;
    import java.util.stream.Collectors;

    @Component
    public class ServicioBiblioteca {
        private final Repositorio<Libro> repositorioLibro;
        private final Repositorio<Computador> repositorioComputador;
        private final Repositorio<Periodico> repositorioPeriodico;

        @Autowired
        public ServicioBiblioteca(Repositorio<Libro> repositorioLibro, Repositorio<Computador> repositorioComputador, Repositorio<Periodico> repositorioPeriodico) {
            this.repositorioLibro = repositorioLibro;
            this.repositorioComputador = repositorioComputador;
            this.repositorioPeriodico = repositorioPeriodico;
        }

        public void agregar(Recurso recurso) {
            if (recurso != null) {
                if (recurso instanceof Libro) {
                    repositorioLibro.agregar((Libro) recurso);
                } else if (recurso instanceof Computador) {
                    repositorioComputador.agregar((Computador) recurso);
                }
            }
        }

        public void quitarRecurso(Recurso recurso) {
            if (recurso instanceof Libro) {
                repositorioLibro.eliminar((Libro) recurso);
            } else if (recurso instanceof Computador) {
                repositorioComputador.eliminar((Computador) recurso);
            }
        }

        public Collection<Recurso> buscarRecursos(String criterio) {
            List<Recurso> resultados = new ArrayList<>();
            resultados.addAll(repositorioLibro.obtenerTodos().stream()
                    .filter(recurso -> recurso.coincideConCriterio(criterio))
                    .collect(Collectors.toList()));
            resultados.addAll(repositorioComputador.obtenerTodos().stream()
                    .filter(recurso -> recurso.coincideConCriterio(criterio))
                    .collect(Collectors.toList()));
            return resultados;
        }

        public Collection<Recurso> obtenerTodos() {
            List<Recurso> todosRecursos = new ArrayList<>();
            todosRecursos.addAll(repositorioLibro.obtenerTodos());
            todosRecursos.addAll(repositorioComputador.obtenerTodos());
            todosRecursos.addAll(repositorioPeriodico.obtenerTodos());
            return todosRecursos;
        }
    }