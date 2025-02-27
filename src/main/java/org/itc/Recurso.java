package org.itc;

import java.time.LocalDateTime;

abstract class Recurso {
    protected String nombre;
    protected LocalDateTime fechaIngreso;
    protected boolean activo;
}
