SELECT SupplierID,ContactName
FROM Suppliers
ORDER BY ContactName ASC;

SELECT *
FROM Suppliers
WHERE SupplierID = '1';

SELECT UnitPrice AS 'Precio', ProductName AS 'Nombre producto'
FROM products
ORDER BY ProductName ASC;

## nombre apellidos y fechaNac de los empledos, empelados con mas tiempo contratados

SELECT firstName, lastName, Address, BirthDate
FROM Employees
ORDER BY hireDate DESC;

##informacion de los empleados que se llamen NANCY

SELECT *
FROM Employees
WHERE firstName = "nancy";

SELECT DISTINCT UnitPrice 
FROM products;

## Seleccionar productos de las categorias 1 2 y 4
SELECT *
FROM products
WHERE categoryID = "1" OR categoryID ="2" OR categoryID = "4";

## seleccionar todos los productos de la categoria 1 y que valgan mas de 10

SELECT *
FROM products
WHERE categoryID ="1" and UnitPrice > 10;

##Unit price multiplicado por el IVA
SELECT UnitPrice AS "Precio Unitario" , UnitPrice*1.21 AS "Precio Unitario con iva"
FROM products;

## valor del inventario por cada producto

SELECT UnitsInStock AS "Precio base", UnitsInStock * UnitPrice AS "Precio Final"
FROM products;