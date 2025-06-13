package org.itc;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

    @Autowired
    private ServicioBiblioteca servicioBiblioteca;

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Agregar al menos 3 libros
        Libro libro1 = new Libro("Historia de Java", LocalDate.now(), true, "Autor1", "Editorial1", "ISBN-001");
        Libro libro2 = new Libro("Spring en Acción", LocalDate.now(), true, "Autor2", "Editorial2", "ISBN-002");
        Libro libro3 = new Libro("Patrones de Diseño", LocalDate.now(), true, "Autor3", "Editorial3", "ISBN-003");

        servicioBiblioteca.agregarLibro(libro1);
        servicioBiblioteca.agregarLibro(libro2);
        servicioBiblioteca.agregarLibro(libro3);

        // Agregar al menos 3 computadores
        Computador comp1 = new Computador("PC Desarrollo", LocalDate.now(), true, TipoComputador.DESKTOP, "Dell",
                "XPS");
        Computador comp2 = new Computador("Laptop IT", LocalDate.now(), true, TipoComputador.LAPTOP, "HP", "Elitebook");
        Computador comp3 = new Computador("Tablet Diseño", LocalDate.now(), true, TipoComputador.TABLET, "Samsung",
                "Galaxy Tab");

        servicioBiblioteca.agregarComputador(comp1);
        servicioBiblioteca.agregarComputador(comp2);
        servicioBiblioteca.agregarComputador(comp3);

        // Agregar al menos 2 periódicos
        Periodico periodico1 = new Periodico("El Tiempo", LocalDate.now(), true, "Editorial Nacional",
                LocalDate.of(2023, 10, 15));
        Periodico periodico2 = new Periodico("El Espectador", LocalDate.now(), true, "Editorial Colombia",
                LocalDate.of(2023, 10, 16));

        servicioBiblioteca.agregarPeriodico(periodico1);
        servicioBiblioteca.agregarPeriodico(periodico2);

        // Imprimir la lista de libros
        System.out.println("Lista de libros en la biblioteca:");
        imprimirLibros(servicioBiblioteca.buscarLibros(""));

        // Imprimir la lista de computadores
        System.out.println("\nLista de computadores en la biblioteca:");
        imprimirComputadores(servicioBiblioteca.buscarComputadores(""));

        // Imprimir la lista de periódicos
        System.out.println("\nLista de periódicos en la biblioteca:");
        imprimirPeriodicos(servicioBiblioteca.buscarPeriodicos(""));

        // Buscar recursos que contengan un criterio específico
        String criterioBusqueda = "Java";
        System.out.println("\nResultados de búsqueda de libros para el criterio: " + criterioBusqueda);
        imprimirLibros(servicioBiblioteca.buscarLibros(criterioBusqueda));

        // Dar de baja un recurso
        List<Libro> librosEncontrados = servicioBiblioteca.buscarLibros(criterioBusqueda);
        if (!librosEncontrados.isEmpty()) {
            Libro libroDarBaja = librosEncontrados.get(0);
            servicioBiblioteca.darDeBajaLibro(libroDarBaja);
            System.out.println("\nLibro dado de baja: " + libroDarBaja.getNombre());
        }

        // Imprimir la lista de libros actualizada
        System.out.println("\nLista de libros actualizada:");
        imprimirLibros(servicioBiblioteca.buscarLibros(""));
    }

    private void imprimirLibros(List<Libro> libros) {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    private void imprimirComputadores(List<Computador> computadores) {
        for (Computador computador : computadores) {
            System.out.println(computador);
        }
    }

    private void imprimirPeriodicos(List<Periodico> periodicos) {
        for (Periodico periodico : periodicos) {
            System.out.println(periodico);
        }
    }
}
