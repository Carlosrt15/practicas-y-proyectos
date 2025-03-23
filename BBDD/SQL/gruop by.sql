 -- Sacar un listado de los proveedores y el número de productos que nos suministra cada uno
use northwind;
select s.CompanyName , count(p.ProductID) AS NumeroProductos
From suppliers s
left join products p ON s.supplierId = P.SupplierID
group by s.CompanyName 
order by NumeroProductos desc;

 -- Sacar un listado de los nombres de los barcos y cuantas veces los hemos utilizado para llevar a cabo envíos
Select Shipname, count(OrderID) as vecesUsado
from orders
group by Shipname
order by vecesUsado desc;

 -- contar el numero de empleados que hay por ciudad 
select city , count(EmployeeID) as empleadoCiudad
from employees
group by city
order by empleadoCiudad asc;
 -- Sacar un listado de los puestos de trabajo (title) por ciudad
select city, count( distinct title) as TitulosCiudad
from employees
group by city
order by TitulosCiudad desc;

-- Nota: observad la diferencia entre agrupar por título y agrupar por título y ciudad

 -- Sacar un listado de cuantos pedidos se envían a cada país
	Select ShipCountry, count(OrderID) as OrdenPais
    from orders
    group by ShipCountry
    order by OrdenPais desc;
    
 -- Sacar un listado de cuantos pedidos se envían a cada ciudad

	Select Shipcity, count(OrderID) as Ordenciudad
    from orders
    group by Shipcity
    order by Ordenciudad desc;

 -- Sacar un listado de fechas  y cuantos pedidos se han hecho en cada fecha (orderdate)
SELECT OrderDate, COUNT(OrderID) AS TotalPedidos
FROM orders
GROUP BY OrderDate
ORDER BY OrderDate ASC;

 -- sacar un listado con el número de pedidos que se hacen a cada proveedor (supplier)
SELECT CompanyName, 
       (SELECT COUNT(*) 
        FROM products 
        WHERE products.SupplierID = suppliers.SupplierID) AS NumeroProductos
FROM suppliers
ORDER BY NumeroProductos DESC;

 -- sacar un listado con el número de pedidos que ha hecho cada empleado (sacar el listado con el formato nombre empleado - número pedidos)
Select	 e.FirstName, count(o.OrderID) as NumeroPedidos
from employees e 
inner join orders o on e.EmployeeID = o.EmployeeID
group by e.EmployeeID
order by NumeroPedidos desc;
 -- Sacar un listado del número de productos que tienen el mismo precio
SELECT Unitprice , count(ProductID) as NumeroProductos
from products 
group by UnitPrice  having count(ProductID) > 1
order by UnitPrice;


 -- Sacar un listado con el número de proveedores por país
select country, count(SupplierID) as provedorPais
from suppliers
group by country
order by provedorPais desc;
 -- Hacer un listado del número de pedidos por fecha
SELECT OrderDate, COUNT(*) AS NumberOfOrders
FROM northwind.orders
GROUP BY OrderDate
ORDER BY OrderDate;

 -- Hacer un listado de las cantidades que se han vendido de cada producto
SELECT 
    p.ProductName,
    SUM(od.Quantity) AS TotalQuantitySold
FROM 
    northwind.products p
INNER JOIN 
    northwind.orderdetails od ON p.ProductID = od.ProductID
GROUP BY 
    p.ProductName
ORDER BY 
    TotalQuantitySold DESC;


 -- Obtener un listado de la cantidad de productos que nos suministra cada proveedor diferenciando por categoría
	SELECT 
    s.CompanyName AS SupplierName,
    c.CategoryName AS CategoryName,
    COUNT(p.ProductID) AS TotalProducts
FROM 
    northwind.products p
INNER JOIN 
    northwind.suppliers s ON p.SupplierID = s.SupplierID
INNER JOIN 
    northwind.categories c ON p.CategoryID = c.CategoryID
GROUP BY 
    s.SupplierID, c.CategoryID
ORDER BY 
    s.CompanyName, c.CategoryName;


 -- Listar las categorías de productos incluyendo el número de productos en stock en cada categoría.
select c.categoryName, sum(p.unitsinstock) as totalunidades
from northwind.products p 
inner join northwind.categories c on p.categoryId = c.CategoryID
group by c.CategoryID
order by c.CategoryName;
 -- Obtener un listado de las cantidades vendidas a cada cliente especificando a su vez por categorías (más adelante)

-- Sacar un listado el la suma de los fletes (freigth) gastados en cada transportista