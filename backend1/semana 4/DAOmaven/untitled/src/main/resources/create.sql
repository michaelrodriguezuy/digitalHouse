CREATE TABLE IF NOT EXISTS empleado(
    idEmpleado INT PRIMARY KEY,
    nombre VARCHAR,
    apellido VARCHAR,
    edad int,
    ciudad VARCHAR
);

DELETE FROM empleado;

INSERT INTO empleado(idEmpleado, nombre, apellido, edad, ciudad) VALUES(1,'Manuel', 'Sanchez', 36, 'Cordoba');
INSERT INTO empleado(idEmpleado, nombre, apellido, edad, ciudad) VALUES(2,'Machadito', 'Escobar', 43, 'Medellin');