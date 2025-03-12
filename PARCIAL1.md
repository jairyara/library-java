# Explique la diferencia entre @Component y @Configuration en Spring

## @Component

`@Component` es una anotación básica en *Spring Boot* que se usa para indicar que una clase debe ser administrada por el framework. Cuando se agrega esta anotación a una clase, *Spring* la detecta automáticamente y la incluye en su sistema interno, lo que permite usarla en otras partes del programa sin necesidad de crear manualmente sus instancias.

Básicamente, `@Component` ayuda a que *Spring Boot* reconozca y gestione las clases sin que el desarrollador tenga que hacerlo manualmente.

## @Configuration

`@Configuration` es una anotación que se usa cuando una clase necesita proporcionar configuraciones específicas para el programa. Se utiliza especialmente para definir métodos que crean y administran objetos (*Beans*) dentro del sistema.

# Ejemplo de una clase inyectada desde el constructor

- [ServicioBiblioteca.java](src/main/java/org/itc/ServicioBiblioteca.java) - Lógica de gestión de la biblioteca.
- [LibroRepositorio.java](src/main/java/org/itc/LibroRepositorio.java) - Simula el almacenamiento de libros.
- [AppConfig.java](src/main/java/org/itc/AppConfig.java) - Configuración de Spring.
- [Main.java](src/main/java/org/itc/Main.java) - Punto de entrada de la aplicación.


# Principio de Inversión de Control

## ¿Qué es?

La **inversión de control** es una manera de organizar un programa para que no tenga que encargarse directamente de crear y gestionar sus propios elementos. En su lugar, deja esa tarea a un sistema externo que los administra automáticamente cuando se necesitan.

## Aplicación en Spring Boot

En *Spring Boot*, esto significa que el framework se encarga de configurar y conectar las distintas partes del programa, lo que facilita su desarrollo y mantenimiento.

## Beneficios

- Hace que el código sea más fácil de entender y modificar.
- Permite mayor flexibilidad y control sobre cómo funciona el programa.
- Facilita la actualización o sustitución de partes del sistema sin afectar otras áreas.
- Ayuda a los desarrolladores a enfocarse en la funcionalidad principal en lugar de detalles técnicos.

## Aplicación del IoC en esta solución

En nuestro caso, tenemos un sistema para gestionar libros, periódicos y computadores. En lugar de que la clase que usa estos objetos (por ejemplo, un servicio de biblioteca) tenga que crearlos y administrarlos manualmente, Spring se encarga de hacerlo por nosotros.

- Creamos una interfaz genérica `Repositorio<T>` que define operaciones como agregar, eliminar y buscar elementos.
- Creamos implementaciones específicas para libros, periódicos y computadores.
- Spring se encarga de gestionar estas clases gracias a la anotación `@Repository`, lo que significa que no necesitamos crearlas manualmente cada vez que queramos usarlas.
- Cuando un servicio necesita un repositorio, simplemente lo pide (como cuando pides comida en un restaurante) y Spring se lo entrega.



La diferencia clave con `@Component` es que `@Configuration` garantiza que los métodos dentro de la clase que están marcados con `@Bean` solo se ejecuten una vez, evitando que se creen múltiples copias innecesarias de los mismos objetos. Además, puede combinarse con `@ComponentScan` para indicar a *Spring* en qué paquetes debe buscar automáticamente otras clases anotadas.

# Inyección de propiedades en Spring con @Value y su orden de precedencia

## ¿Qué es @Value y para qué sirve?

En un programa, a menudo se necesitan ciertos valores (como configuraciones o nombres) que pueden cambiar con el tiempo. En lugar de escribirlos directamente en el código, es mejor guardarlos en un archivo externo y hacer que el programa los tome desde allí. Esto es exactamente lo que permite `@Value` en *Spring Boot*.

`@Value` se usa para tomar valores desde un archivo de configuración y asignarlos automáticamente a ciertas partes del programa, sin que el programador tenga que hacerlo manualmente en cada lugar.

### ¿De dónde obtiene los valores?

Spring puede obtener valores desde distintas fuentes, como:

- Archivos de configuración (`application.properties` o `application.yml`).
- Variables del sistema donde corre la aplicación.
- Expresiones que permiten generar valores de manera dinámica.

De esta manera, si es necesario cambiar un valor, solo se modifica en el archivo de configuración en lugar de cambiar el código fuente.

# Ejemplo combinación de multiples repositorios

- 📖 [`RepositorioLibro`](src/main/java/org/itc/LibroRepositorio.java) para almacenar libros.
- 💻 [`RepositorioComputador`](src/main/java/org/itc/ComputadorRepositorio.java) para registrar computadores disponibles.
- 📰 [`RepositorioPeriodico`](src/main/java/org/itc/PeriodicoRepositorio.java) para administrar periódicos.
- 📚 [`ServicioBiblioteca`](src/main/java/org/itc/ServicioBiblioteca.java) combina los datos de todos los repositorios.  

