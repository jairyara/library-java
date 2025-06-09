package org.itc.controller;

import org.itc.Computador;
import org.itc.Libro;
import org.itc.Periodico;
import org.itc.ServicioBiblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biblioteca")
public class BibliotecaController {

    private final ServicioBiblioteca servicioBiblioteca;

    @Autowired
    public BibliotecaController(ServicioBiblioteca servicioBiblioteca) {
        this.servicioBiblioteca = servicioBiblioteca;
    }

    // ----- LIBROS -----
    @PostMapping("/libros")
    public void agregarLibro(@RequestBody Libro libro) {
        servicioBiblioteca.agregarLibro(libro);
    }

    @GetMapping("/libros")
    public List<Libro> buscarLibros(@RequestParam(defaultValue = "") String criterio) {
        return servicioBiblioteca.buscarLibros(criterio);
    }

    @PostMapping("/libros/darDeBaja")
    public void darDeBajaLibro(@RequestBody Libro libro) {
        servicioBiblioteca.darDeBajaLibro(libro);
    }

    // ----- PERIODICOS -----
    @PostMapping("/periodicos")
    public void agregarPeriodico(@RequestBody Periodico periodico) {
        servicioBiblioteca.agregarPeriodico(periodico);
    }

    @GetMapping("/periodicos")
    public List<Periodico> buscarPeriodicos(@RequestParam(defaultValue = "") String criterio) {
        return servicioBiblioteca.buscarPeriodicos(criterio);
    }

    @PostMapping("/periodicos/darDeBaja")
    public void darDeBajaPeriodico(@RequestBody Periodico periodico) {
        servicioBiblioteca.darDeBajaPeriodico(periodico);
    }

    // ----- COMPUTADORES -----
    @PostMapping("/computadores")
    public void agregarComputador(@RequestBody Computador computador) {
        servicioBiblioteca.agregarComputador(computador);
    }

    @GetMapping("/computadores")
    public List<Computador> buscarComputadores(@RequestParam(defaultValue = "") String criterio) {
        return servicioBiblioteca.buscarComputadores(criterio);
    }

    @PostMapping("/computadores/darDeBaja")
    public void darDeBajaComputador(@RequestBody Computador computador) {
        servicioBiblioteca.darDeBajaComputador(computador);
    }
}