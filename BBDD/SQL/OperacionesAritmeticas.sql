use Northwind;

-- 1. Aumentar un 10% el precio de todos los productos

Select ProductID, ProductName, UnitPrice, round((UnitPrice*1.1),2) As NewPrice from Products;


 -- 2. Aumentar el precio un 15% de los productos con la categoría de quesos (cheeses)
 select * from categories;
 Select ProductID, ProductName, UnitPrice, (UnitPrice*1.15) As NewPrice from Products where CategoryId = 4;
 
 -- -- 3. Cómo hacer el update anterior si no supiéramos el id de la categoría
 SELECT p.ProductID, p.ProductName, p.UnitPrice, (p.UnitPrice * 1.15) AS NewPrice
FROM northwind.products p
INNER JOIN northwind.categories c ON p.CategoryID = c.CategoryID
WHERE c.Description = 'Cheeses';

-- 4. Sacar un listado con la cantidad de dinero que tenemos en stock de cada producto. (Que se vea el nombre del producto y el Dinero invertido en stock)
SELECT ProductName, (UnitPrice * UnitsInStock) AS Total FROM products;



-- 5. Sacar un informe que nos muestre un listado de pedidos con el nombre del cliente y lo que se ha gastado en el pedido (quantity * unitPrice) - Discount.
	SELECT 
    o.OrderID,
    c.ContactName AS CustomerName,
    sum(od.Quantity * od.UnitPrice * (1 - od.Discount)) AS TotalSpent
	FROM orders o
	INNER JOIN customers c ON o.CustomerID = c.CustomerID  
	INNER JOIN orderdetails od ON o.OrderID = od.OrderID
	GROUP BY o.OrderID, c.ContactName
	ORDER BY TotalSpent DESC;

    

-- 6. Sacar un informe que nos muestre un listado de pedidos con el nombre del cliente, el nombre del producto comprado y lo que se ha gastado en el pedido (quantity * unitPrice) - Discount. 
SELECT 
    c.ContactName, 
    p.ProductName, 
    SUM(od.Quantity * od.UnitPrice * (1 - od.Discount)) AS TotalGastado
		FROM customers c
		INNER JOIN orders o ON o.CustomerID = c.CustomerID
		INNER JOIN orderdetails od ON o.OrderID = od.OrderID
		INNER JOIN products p ON od.ProductID = p.ProductID
		GROUP BY c.ContactName, p.ProductName
		ORDER BY TotalGastado ASC;


-- 7. Sacar una lista de productos por encima del precio medio (nota: para calcular la media, utilizar la función AVG).
Select productName from products where unitPrice >(select avg(unitPrice)From products);
select avg(UnitPrice) from products;
select count(ProdcutName) From Name;

-- 8. Si el coste del flete (freight, coste de envío) es mayor o igual a 500$ ha de ser gravado con un 10%. Crear un informe que muestre: el orderId, el coste del flete (freight) y el coste del flete con el impuesto para todos los pedidos (orders) de 500$ o más.

Select * from orders;
select orderID, freight*(10/100) as flete_impuesto from orders where Freight