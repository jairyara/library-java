const BASE_URL = '/api';

// LIBROS
function listarLibros() {
    fetch(`${BASE_URL}/libros`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('libros').textContent = JSON.stringify(data, null, 2);
        });
}

function agregarLibro() {
    const libro = {
        nombre: document.getElementById('libroNombre').value,
        fechaIngreso: document.getElementById('libroFechaIngreso').value,
        activo: true,
        autor: document.getElementById('libroAutor').value,
        editorial: document.getElementById('libroEditorial').value,
        isbn: document.getElementById('libroIsbn').value
    };

    fetch(`${BASE_URL}/libros`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(libro)
    })
        .then(() => listarLibros());
}

function darDeBajaLibro() {
    const id = document.getElementById('libroDarDeBajaId').value;
    fetch(`${BASE_URL}/libros/${id}`, {
        method: 'DELETE'
    })
        .then(() => listarLibros());
}

// PERIODICOS
function listarPeriodicos() {
    fetch(`${BASE_URL}/periodicos`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('periodicos').textContent = JSON.stringify(data, null, 2);
        });
}

function agregarPeriodico() {
    const periodico = {
        nombre: document.getElementById('periodicoNombre').value,
        fechaIngreso: document.getElementById('periodicoFechaIngreso').value,
        activo: true,
        editorial: document.getElementById('periodicoEditorial').value,
        fechaPublicacion: document.getElementById('periodicoFechaPublicacion').value
    };

    fetch(`${BASE_URL}/periodicos`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(periodico)
    })
        .then(() => listarPeriodicos());
}

function darDeBajaPeriodico() {
    const id = document.getElementById('periodicoDarDeBajaId').value;
    fetch(`${BASE_URL}/periodicos/${id}`, {
        method: 'DELETE'
    })
        .then(() => listarPeriodicos());
}

// COMPUTADORES
function listarComputadores() {
    fetch(`${BASE_URL}/computadores`)
        .then(response => response.json())
        .then(data => {
            document.getElementById('computadores').textContent = JSON.stringify(data, null, 2);
        });
}

function agregarComputador() {
    const computador = {
        nombre: document.getElementById('computadorNombre').value,
        fechaIngreso: document.getElementById('computadorFechaIngreso').value,
        activo: true,
        tipo: document.getElementById('computadorTipo').value,
        marca: document.getElementById('computadorMarca').value,
        modelo: document.getElementById('computadorModelo').value
    };

    fetch(`${BASE_URL}/computadores`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(computador)
    })
        .then(() => listarComputadores());
}

function darDeBajaComputador() {
    const id = document.getElementById('computadorDarDeBajaId').value;
    fetch(`${BASE_URL}/computadores/${id}`, {
        method: 'DELETE'
    })
        .then(() => listarComputadores());
}
