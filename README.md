# Biblioteca

Este proyecto es una implementación de un sistema de gestión de recursos de una biblioteca. Permite agregar, buscar, eliminar y listar recursos como libros y computadores.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes y clases:

- `org.itc`
  - `Main`: Clase principal que contiene el método `main` para ejecutar el programa.
  - `Recurso`: Clase abstracta que representa un recurso genérico en la biblioteca.
  - `Libro`: Subclase de `Recurso` que representa un libro.
  - `Computador`: Subclase de `Recurso` que representa un computador.
  - `ServicioBiblioteca`: Clase que gestiona los recursos de la biblioteca.

## Requisitos

- Java 8 o superior
- Maven

## Instalación

1. Clona el repositorio:
   ```sh
   git clone https://github.com/jairyara/library-java