package org.itc;

import java.time.LocalDate;
import java.util.Collection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = "org.itc")
@PropertySource("classpath:application.properties")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner run(ServicioBiblioteca servicioBiblioteca) {
        return args -> {
            // Agregar al menos 3 recursos de cada tipo definido en el diagrama UML
            servicioBiblioteca.agregar(new Libro("Libro1", "Autor1", "Editorial1", 2001));
            servicioBiblioteca.agregar(new Libro("Libro2", "Autor2", "Editorial2", 2002));
            servicioBiblioteca.agregar(new Libro("Libro3", "Autor3", "Editorial3", 2003));

            servicioBiblioteca.agregar(new Computador("Marca1", "Modelo1", "SO1"));
            servicioBiblioteca.agregar(new Computador("Marca2", "Modelo2", "SO2"));
            servicioBiblioteca.agregar(new Computador("Marca3", "Modelo3", "SO3"));

            servicioBiblioteca.agregar(new Periodico(LocalDate.of(2021, 1, 1), "Editorial1", 1));
            servicioBiblioteca.agregar(new Periodico(LocalDate.of(2022, 2, 2), "Editorial2", 2));

            // Imprimir la lista de recursos actual en la biblioteca
            System.out.println("Lista de recursos en la biblioteca:");
            imprimirRecursos(servicioBiblioteca.obtenerTodos());

            // Buscar los recursos que coincidan con un criterio de búsqueda parcial e imprimir los resultados
            String criterioBusqueda = "Libro";
            System.out.println("\nResultados de la búsqueda para el criterio: " + criterioBusqueda);
            Collection<Recurso> resultadosBusqueda = servicioBiblioteca.buscarRecursos(criterioBusqueda);
            imprimirRecursos(resultadosBusqueda);

            // Tomar el primer resultado de la búsqueda y eliminarlo de la biblioteca
            if (!resultadosBusqueda.isEmpty()) {
                Recurso recursoAEliminar = resultadosBusqueda.iterator().next();
                servicioBiblioteca.quitarRecurso(recursoAEliminar);
                System.out.println("\nRecurso eliminado: " + recursoAEliminar);
            }

            // Volver a imprimir la lista de recursos actualizados
            System.out.println("\nLista de recursos actualizada en la biblioteca:");
            imprimirRecursos(servicioBiblioteca.obtenerTodos());
        };
    }

    private static void imprimirRecursos(Collection<Recurso> recursos) {
        for (Recurso recurso : recursos) {
            System.out.println(recurso);
        }
    }
}