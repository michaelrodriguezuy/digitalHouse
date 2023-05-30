CREATE TABLE IF NOT EXISTS odontologo(
    numero_matricula INT PRIMARY KEY,
    nombre VARCHAR,
    apellido VARCHAR
);

DELETE FROM odontologo;


INSERT INTO odontologo(numero_matricula, nombre, apellido) VALUES(1, 'Manuel', 'Sanchez');
INSERT INTO odontologo(numero_matricula, nombre, apellido) VALUES(2, 'Michael', 'Fernandez');


