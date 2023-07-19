CREATE TABLE IF NOT EXISTS domicilio(
    id INT PRIMARY KEY,
    calle VARCHAR,
    numero VARCHAR
);

CREATE TABLE IF NOT EXISTS paciente(
    id INT PRIMARY KEY,
    nombre VARCHAR,
    id_domicilio INT
);

DELETE FROM domicilio;
DELETE FROM paciente;

INSERT INTO domicilio(id, calle, numero) VALUES(1, 'Dean Funes', '611');
INSERT INTO paciente(id, nombre, id_domicilio) VALUES(1, 'Nero', 1);