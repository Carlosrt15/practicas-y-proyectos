use neptuno;


-- Crear una nueva categoría de producto. 
-- Habrá que insertar un nuevo registro. 
-- Con el id_categoria -> 9, nombre-> congelados y como descripción 'productos congelados'.

INSERT INTO `neptuno`.`categorias` (`IdCategoría`, `NombreCategoría`, `Descripción`)
VALUES (9, 'congelados', 'productos congelados');

-- Crear una nueva categoría 
-- con id_categoria->10, nombre 'Pan' 
--  con la descripción 'repostería, cereales, pan, dulces, galletas, etc…'
INSERT INTO `neptuno`.`categorias` (`IdCategorias`,`NombreCategorias`,`Descripción`)
VALUES (10,'Pan','repostería, cereales, pan, dulces, galletas, etc…');

select * from categorias;


-- Crear una copia de seguridad de la tabla productos que llamaremos productos_bck.
CREATE TABLE `neptuno`.`productos_bck` AS
SELECT * FROM `neptuno`.`productos`;

-- Actualizar la tabla productos para poner con categoría 10 (la nueva categoría que hemos creado)
--  a todos los productos que pertenezcan a la categoría 5 o 3.

UPDATE `neptuno`.`productos`
SET `IdCategoría` = 10
WHERE `IdCategoría` IN (3, 5);


-- Crear una nueva tabla ciudadpais que tenga dos campos
-- ciudad varchar(15) pk
-- país varchar(15)


CREATE TABLE `neptuno`.`ciudadpais` (
  `ciudad` VARCHAR(15) NOT NULL,
  `país` VARCHAR(15) NULL DEFAULT NULL,
  PRIMARY KEY (`ciudad`)
) ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- Insertar en la tabla ciudadpais: todas las ciudades y países distintas de la tabla proveedores
INSERT INTO `neptuno`.`ciudadpais` (`ciudad`, `país`)
SELECT DISTINCT `Ciudad`, `País`
FROM `neptuno`.`proveedores`;

-- Borrar todos los datos del país de la tabla empleados.
ALTER TABLE `neptuno`.`empleados`
MODIFY COLUMN `País` VARCHAR(15) NULL;
UPDATE `neptuno`.`empleados`
SET `País` = NULL;

-- Damos de alta a un nuevo empleado en la empresa. 
-- Inserta los datos poniendo tu nombre y apellidos más los datos que no pueden estar en blanco en esa tabla.

-- Vamos a borrar los datos del empleado con idempleado=7 ya que deja de trabajar en la empresa. 
-- Antes de darlo de baja habrá que asignar todos los pedidos que realizó este empleado al empleado 8
UPDATE `neptuno`.`pedidos`
SET `IdEmpleado` = 8
WHERE `IdEmpleado` = 7;

DELETE FROM `neptuno`.`empleados`
WHERE `IdEmpleado` = 7;





