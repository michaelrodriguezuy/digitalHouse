CREATE TABLE IF NOT EXISTS canciones(
    id VARCHAR PRIMARY KEY,
    nombre VARCHAR,
    artista VARCHAR,
    genero VARCHAR
);

DELETE FROM canciones;

INSERT INTO canciones(id, nombre, artista, genero) VALUES('a001', 'Cose della Vita', 'Eros Ramazotti ft. Tina Turner', 'Pop');
INSERT INTO canciones(id, nombre, artista, genero) VALUES('c001', 'Ritmo de la Noche', 'La Factoría', 'Ragga');