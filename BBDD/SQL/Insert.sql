drop database if exists concesionario;
create database concesionario;
use concesionario;


create table coche(
matricula varchar(11) not null primary key,
marca varchar(50) default 'Seat',
modelo varchar(100) default null
); 

insert into coche values('SA-123','Bmw', 'I30');
insert into coche values('SA-122','Renault', 'Megan');
insert into coche values('ZA-001','Lexus', 'Is200');

-- Introduce 2 coches introduciendo datos en todas las columnas (con una sola sentencia)
INSERT INTO coche (matricula, marca, modelo)  VALUES ('1234ABC', 'Seat', 'Ibiza'), ('5678DEF', 'Ford', 'Fiesta');
select * from coche;
-- Introduce 2 coches introduciendo datos con algunos valores DEFAULT
insert into coche (matricula, marca) values ('5555CCC', 'Bmw'), ('3855CAC', 'Audi');

-- Introduce 2 coches dejando algunas de las columnas sin definir/usar (con dos sentencias)
insert into coche (matricula, modelo) values('6666ABZ', 'Cla');
insert into coche (matricula, marca) values('9166ABZ', 'Mercedes');

-- Introduce 2 coches dejando algunas de las columnas sin definir/usar (con una sola sentencia)
INSERT INTO coche (matricula, marca )  VALUES ('1234ZBZ', 'Seat' ), ('9632HHF', 'Ford' );

-- Crea una tabla idéntica a "coches" y llámala "coches_copia"

create table coche_copia(
matricula varchar(11) not null primary key,
marca varchar(50) default 'Seat',
modelo varchar(100) default null
); 

-- Introduce en la tabla anterior 5 coches de la tabla "coches". 
-- Utiliza, para ello, una SELECT con todos los coches ordenados por matrícula y solo introduce 5.

INSERT INTO coche_copia (matricula, marca, modelo)
SELECT matricula, marca, modelo
FROM coche
ORDER BY matricula
LIMIT 5;

-- Crea una tabla llamada "copias_copia_auto" con una sentencia CREATE TABLE AS SELECT cuya tabla origen sea "coches". 
-- Introduce solo los coches de una determinada marca.
CREATE TABLE copias_copia_auto AS SELECT * FROM coche WHERE marca = 'Seat';


show tables;
select * from coche;
select * from coche_copia;
select * from copias_copia_auto;






