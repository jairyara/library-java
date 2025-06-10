package org.itc;

import java.time.LocalDate;

public interface Recurso {
    String getNombre();
    LocalDate getFechaIngreso();
    boolean isActivo();
    void darDeBaja();
    String toString();
}

