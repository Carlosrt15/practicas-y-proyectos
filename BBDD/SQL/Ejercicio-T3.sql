use instituto;
INSERT INTO tipo_asignatura (tipo, descripcion) VALUES
(1, 'troncal'),
(2, 'optativa'),
(3, 'obligatoria'),
(4, 'libre_configuración');

select * from tipo_asignatura;

-- En la tabla asignaturas introduciremos las siguientes (todas tendrán como tipo troncal)
insert into asignaturas (nombre, tipo)  values
('Gestión de bases de datos', 1),
('Programación', 1),
('Redes 1', 1),
('Redes 2', 1),
(' Desarrollo en entorno servidor', 1);

select * from asignaturas;

-- Inserta en la tabla alumnos los datos de la tabla per1. Solo los datos que puedas
select * from alumnos;
 insert into alumnos (dni_alumno, nombre, direccion, sexo ) select dni, nombre, direccion , sexo from per1;

-- Crea una copia de seguridad de la tabla alumnos y llámala alumnos seguido de un _ y
-- la fecha actual
create table alumnos_250325 as select * from alumnos;
select * from alumnos_250325;

-- Inserta estos nuevos alumnos.