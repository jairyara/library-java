package org.itc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioBiblioteca {
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private PeriodicoRepositorio periodicoRepositorio;
    @Autowired
    private ComputadorRepositorio computadorRepositorio;

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