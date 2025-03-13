package org.itc;

    import org.springframework.stereotype.Component;

    import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

    @Component
    public class LibroRepositorio implements RecursoRepositorio<Libro> {
        private final List<Libro> libros = new ArrayList<>();

        @Override
        public void agregar(Libro libro) {
            libros.add(libro);
        }

        @Override
        public void eliminar(Libro libro) {
            libros.remove(libro);
        }

        @Override
        public Collection<Libro> buscar(String nombre) {
            return new ArrayList<>(libros);
        }

        @Override
        public List<Libro> obtenerTodos() {
            return new ArrayList<>(libros);
        }
    }