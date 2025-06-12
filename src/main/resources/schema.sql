-- Tabla para Libro
CREATE TABLE IF NOT EXISTS Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    fecha_ingreso DATE NOT NULL,
    activo BOOLEAN NOT NULL,
    autor VARCHAR(255),
    editorial VARCHAR(255),
    isbn VARCHAR(50)
);

-- Tabla para Periodico
CREATE TABLE IF NOT EXISTS Periodico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    fecha_ingreso DATE NOT NULL,
    activo BOOLEAN NOT NULL,
    editorial VARCHAR(255),
    fecha_publicacion DATE
);

-- Tabla para Computador
CREATE TABLE IF NOT EXISTS Computador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    fecha_ingreso DATE NOT NULL,
    activo BOOLEAN NOT NULL,
    tipo VARCHAR(20),
    marca VARCHAR(255),
    modelo VARCHAR(255)
); 