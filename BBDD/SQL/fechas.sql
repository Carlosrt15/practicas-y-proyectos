-- Sacar un listado en el que se vea el número de lineas que consta cada pedido
SELECT 
    OrderID,
    COUNT(ProductID) AS NumberOfLines
FROM 
    northwind.orderdetails
GROUP BY 
    OrderID;

-- Sacar un listado con los pedidos que tengan más de 4 elementos.
SELECT 
OrderID,
 COUNT(ProductID) AS NumberOfLines
FROM 
    northwind.orderdetails
GROUP BY 
    OrderID
HAVING 
  COUNT(ProductID) > 4 ;


-- Sacar un listado con el número de pedidos por cliente con más de 10 pedidos
select customerID, count(OrderID) as numeropedidos
from orders 
group by customerid
having count(orderid) > 10 ;


-- Ordenar el anterior listado de forma descendente
select customerID, count(OrderID) as numeropedidos
from orders 
group by customerid
having count(orderid) > 10 
order by numeropedidos desc;


-- Sacar un listado con el número de pedidos por cliente con menos de 10 pedidos
select customerID, count(OrderID) as numeropedidos
from orders 
group by customerid
having count(orderid) < 10 
order by numeropedidos desc;


-- Sacar un listado de todos los nombres de los proveedores en mayúsculas
select upper(ContactName) as nombre
from suppliers;
-- Obtener el mismo listado en mínúsculas
select lower(ContactName) as nombre
from suppliers;


-- Obtener el Apellido de los empleados y una columna con el número de caracteres de dicho empleados
select firstname,lastname, length(lastname) as numeroCaracteres
from employees;

-- Obtener un listado de los nombres de todos productos junto a una columna que muestre los primeros 3 caracteres de dicho nombre
select productname, left(productName, 3) as 3primeros
from products;
-- Sacar un listado las fechas de pedidos y junto a ella una columna que se le haya añadido 10 días a esta fecha 
select orderdate, date_add(orderdate, interval 10 day) as diez_despues
from orders
order by diez_despues;




-- En NorthWind están muy preocupados por el retraso que están sufriendo los pedidos, por tanto el CEO quiere saber el tiempo que toma cada pedido y qué empleado lo ha atendido
SELECT 
    o.OrderID,
    o.OrderDate,
    o.ShippedDate,
    DATEDIFF(o.ShippedDate, o.OrderDate) AS DiasParaEnvio,
    e.FirstName
FROM orders o
INNER JOIN employees e ON o.EmployeeID = e.EmployeeID
WHERE o.ShippedDate IS NOT NULL
ORDER BY DiasParaEnvio DESC;





-- Sacar un listado de los pedidos junto con el día de la semana que se hicieron (nota si queremos que la BBDD nos de los resultados de estas funciones en español: SET lc_time_names = 'es_MX';) (ver https://dev.mysql.com/doc/refman/8.0/en/locale-support.html)
SELECT 
    OrderID, 
    OrderDate, 
    DAYNAME(OrderDate) AS DiaSemana
FROM orders
ORDER BY OrderDate;


-- -- Obtener un listado de las cantidades pedidas por mes (agruparlas por mes y año)
SELECT 
    OrderID, 
    OrderDate, 
    RequiredDate
    
FROM orders
WHERE OrderDate >= '1997-01-01' AND OrderDate <= '1997-07-15'
ORDER BY OrderDate;




-- Mostrar las órdenes de compra entre las fechas 01/01/1997 al 15/07/1997 
SELECT 
    OrderID, 
    OrderDate, 
    RequiredDate, 
    ShippedDate, 
    ShipName
FROM orders
WHERE OrderDate >= '1997-01-01' AND OrderDate <= '1997-07-15'
ORDER BY OrderDate;


-- Mostrar las órdenes de compra hechas en el año 1997, que pertenecen a los empleados con códigos 1 ,3 ,4 ,8
SELECT 
    OrderID, 
    OrderDate, 
    RequiredDate, 
    ShippedDate, 
    EmployeeID
FROM orders
WHERE YEAR(OrderDate) = 1997
AND EmployeeID IN (1, 3, 4, 8)
ORDER BY OrderDate desc;




-- El CEO quiere hacer un estudio de cómo influyen las edades de los empleados con sus ventas. Nos pide sacar un listado con los siguientes datos nombreEmpleado, edad, ventas
SELECT 
    CONCAT(e.FirstName, ' ', e.LastName) AS NombreEmpleado,
    TIMESTAMPDIFF(YEAR, e.BirthDate, CURDATE()) AS Edad,
    SUM(od.Quantity) AS Ventas
FROM employees e
INNER JOIN orders o ON e.EmployeeID = o.EmployeeID
INNER JOIN orderdetails od ON o.OrderID = od.OrderID
GROUP BY e.EmployeeID
ORDER BY Edad DESC;
