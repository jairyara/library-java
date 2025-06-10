package org.itc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioBiblioteca {

    private final LibroRepositorio libroRepositorio;
    private final PeriodicoRepositorio periodicoRepositorio;
    private final ComputadorRepositorio computadorRepositorio;

    // Constructor para inyección de dependencias
    public ServicioBiblioteca(LibroRepositorio libroRepositorio, 
                               PeriodicoRepositorio periodicoRepositorio, 
                               ComputadorRepositorio computadorRepositorio) {
        this.libroRepositorio = libroRepositorio;
        this.periodicoRepositorio = periodicoRepositorio;
        this.computadorRepositorio = computadorRepositorio;
    }

    public void agregarLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

    public void agregarPeriodico(Periodico periodico) {
        periodicoRepositorio.save(periodico);
    }

    public void agregarComputador(Computador computador) {
        computadorRepositorio.save(computador);
    }

    public List<Libro> buscarLibros(String criterio) {
        return libroRepositorio.findByCriteria(criterio);
    }

    public List<Periodico> buscarPeriodicos(String criterio) {
        return periodicoRepositorio.findByCriteria(criterio);
    }

    public List<Computador> buscarComputadores(String criterio) {
        return computadorRepositorio.findByCriteria(criterio);
    }

    public void darDeBajaLibro(Libro libro) {
        libro.darDeBaja();
        libroRepositorio.save(libro);
    }

    public void darDeBajaPeriodico(Periodico periodico) {
        periodico.darDeBaja();
        periodicoRepositorio.save(periodico);
    }

    public void darDeBajaComputador(Computador computador) {
        computador.darDeBaja();
        computadorRepositorio.save(computador);
    }
}