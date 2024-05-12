#Ejercicio 101
#Seleccione todos los campos de la tabla cliente, ordenado por nombre del contacto de la compañía, 
#alfabéticamente.
SELECT *
FROM Customers
ORDER BY ContactName ASC;


#Ejercicio 102
#Seleccione todos los campos de la tabla órdenes, ordenados por fecha de la orden, 
#descendentemente.
SELECT *
FROM Orders
ORDER BY OrderDate DESC;


#Ejercicio 103
#Seleccione todos los campos de la tabla detalle de la orden, ordenada por cantidad pedida.
#Ascendentemente.
SELECT *
FROM OrderDetails
ORDER BY Quantity ASC;


#Ejercicio 104
#Obtener todos los productos, cuyo nombre comienzan con la letra P y tienen un precio unitario 
#comprendido entre 10 y 120.
SELECT *
FROM Products
WHERE ProductName LIKE "P%" && UnitPrice BETWEEN 10 AND 120;


#Ejercicio 105
#Obtener todos los clientes de los países de: USA, Francia y UK.
SELECT *
FROM Customers
WHERE Country IN("France", "UK", "USA");

#Ejercicio 105 bis
#Contar todos los clientes de los países de: USA, Francia y UK.
SELECT COUNT(*) AS TotalClientes, Country
FROM Customers
WHERE Country IN ('USA', 'France', 'UK')
GROUP BY Country;

#Ejercicio 106
#Obtener todos los productos descontinuados y sin stock, que pertenecen a la categoria 1, 3, 4 y 7.
SELECT *
FROM Products
WHERE UnitsInStock = "0" AND CategoryId IN("1","2","3","4","7");

#Ejercicio 107
#Obtener todas las órdenes hechas por el empleado con código: 2, 5 y 7 en el año 1996
SELECT *
FROM Orders
WHERE EmployeeID IN("2","6","7") AND OrderDate LIKE "%1996%";

#Ejercicio 108
#Seleccionar todos los clientes que cuenten con Fax
SELECT *
FROM Customers
WHERE Fax != "";

#Ejercicio 109
#Seleccionar todos los clientes que no cuenten con FAX, del País de USA
SELECT *
FROM Customers
WHERE Country = 'USA' AND Fax != "";

#Ejercicio 110
#Seleccionar todos los empleados que cuentan con un jefe.
SELECT *
FROM Employees
WHERE ReportsTo IS NOT NULL;

#Ejercicio 111
#Seleccionar todos los campos del cliente, cuya compañía empiecen con letra A hasta la D y 
#pertenezcan al país USA, ordenarlos por la dirección.
SELECT *
FROM Customers
WHERE CompanyName LIKE "A%" OR CompanyName LIKE "B%" OR CompanyName LIKE "C%" OR CompanyName LIKE "D%" OR CompanyName LIKE "E" AND Country = 'USA'
ORDER BY Address;


#Ejercicio 112
#Seleccionar todos los campos del cliente, cuya compañía empiece con las letras de la B a la G, y 
#pertenezcan al país de UK, ordenarlos por nombre de la compañía.
SELECT *
FROM Customers
WHERE CompanyName LIKE "B%" OR CompanyName LIKE "C%" OR CompanyName LIKE "D%" OR CompanyName LIKE "E%" OR CompanyName LIKE "F%" OR CompanyName LIKE "G%" OR CompanyName LIKE "H%" AND Country LIKE 'UK'
ORDER BY CompanyName;


#Ejercicio 113
#Seleccionar los productos vigentes cuyos precios unitarios están entre 35 y 250, sin stock en 
#almacén, pertenecientes a las categorías 1, 3, 6, 7 y 8, que son distribuidos por los proveedores, 2, 4, 
#6, 7, 8 y 9.
SELECT *
FROM Products
WHERE UnitPrice BETWEEN 35 AND 250 AND UnitsInStock = "0" AND CategoryId IN(1,3,6,7,8) AND SupplierID IN(2,4,6,7,8,9);


#Ejercicio 114
#Seleccionar todos los campos de los productos, que pertenezcan a los proveedores con códigos: 1, 
#3, 7, 8 y 9, que tengan stock en almacén, y al mismo tiempo que sus precios unitarios estén entre
#39 y 190, ordenados por código de proveedores y precio unitario de manera ascendente.
SELECT *
FROM Products
WHERE SupplierID IN(1,3,7,8,9) AND UnitsInStock AND UnitPrice BETWEEN 39 AND 190
ORDER BY SupplierID AND UnitPrice ASC;


#Ejercicio 115
#Seleccionar los 7 productos con precio más caro, que cuenten con stock en almacén.
SELECT *
FROM Products
WHERE UnitsInStock>1
ORDER BY UnitPrice DESC
LIMIT 6;

#Ejercicio 116
#Seleccionar los 9 productos, con menos stock en almacén, que pertenezcan a la categoría 3, 5 y 8.
SELECT *
FROM Products
WHERE CategoryID IN (3, 5, 8)
ORDER BY UnitsInStock
LIMIT 9;

#Seleccionar las órdenes de compra, realizadas por el empleado con código entre el 2 y 5, además 
#de los clientes con código que comienzan con las letras de la A hasta la G, del 31 de julio de 
#cualquier año.
SELECT *
FROM Orders
WHERE EmployeeID IN(2,5) AND CustomerID LIKE '[A-G%]';


#Ejercicio 118
#Seleccionar las órdenes de compra, realizadas por el empleado con código 3, de cualquier año pero 
#solo de los úlimos 5 meses (agosto-Diciembre).
SELECT *
FROM Orders
WHERE EmployeeID LIKE "3" AND MONTH(Orderdate) BETWEEN 8 AND 12;


#Ejercicio 119
#Seleccionar los detalles de las órdenes de compra, que tengan un monto de cantidad pedida entre 10 
#y 250.
SELECT *
FROM OrderDetails
WHERE Quantity BETWEEN 10 AND 250;


#Ejercicio 120
#Selecciona las líneas de pedido cuyo importe total de la línea estén entre 10 y 100.
SELECT Quantity * UnitPrice AS 'Importe'
FROM OrderDetails
WHERE Quantity* UnitPrice BETWEEN 10 AND 100;


#Ejercicio 121
#Muestra un listado con los distintos países de los clientes.
SELECT *
FROM Customers;