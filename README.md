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

## Compilación y Ejecución

### Pasos para compilar

1. Navega al directorio del proyecto:

````
cd library-java
````

2. Compila el proyecto usando Maven:

```aiignore
mvn clean install

```

### Uso

Para ejecutar el programa, usa el siguiente comando:

```
mvn exec:java -Dexec.mainClass="org.itc.Main"
```


## Funcionalidades

### Agregar Recursos
Permite agregar libros y computadores a la biblioteca.

### Listar Recursos
Imprime la lista de todos los recursos en la biblioteca.

### Buscar Recursos
Busca recursos que coincidan con un criterio de búsqueda parcial.

### Eliminar Recursos
Elimina un recurso específico de la biblioteca.

## Ejemplo de Uso

El método `main` en la clase `Main` realiza las siguientes operaciones:

1. Crea una instancia de `ServicioBiblioteca`.
2. Agrega al menos 3 libros y 3 computadores.
3. Imprime la lista de recursos actual en la biblioteca.
4. Busca recursos que coincidan con un criterio de búsqueda parcial e imprime los resultados.
5. Elimina el primer resultado de la búsqueda.
6. Vuelve a imprimir la lista de recursos actualizada.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o un pull request para discutir cualquier cambio que desees realizar.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

