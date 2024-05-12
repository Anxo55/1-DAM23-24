#1-    Realizar una consulta que me muestre toda las
#columnas de la tabla de productos
SELECT *
FROM products;


#2-    Realizar una consulta que me muestre el código, el
#nombre y el precio del producto
SELECT ProductID, ProductName, UnitPrice
FROM products;

SELECT CURDATE(),SYSDATE()
FROM dual;


#3-    Realizar una consulta que me muestre el código,
#nombre y la categoría de los productos que estén entre 18.00 y 20.00
SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice BETWEEN 18 AND 20;


#9-Realiza una consulta que permita presentar el nombre
# y apellidos de los empleados que tengan más de 40 años

SELECT FirstName, LastName
FROM Employees
WHERE DATEDIFF(CURDATE(), BirthDate) > 40;
#corregir, está mal, usar CURDATE.

SELECT FirstName Nombre, LastName Apellido, birthdate, YEAR(curDate())-YEAR(birthDate) , ROUND(DATEDIFF(curdate(),birthdate)/365)
FROM employees
WHERE ROUND(DATEDIFF(curdate(),birthdate)/365) > 40;
#Con las funciones de arriba vemos comos sacar la edad de las personas.


#10- Realiza una consulta que permita presentar el número
#de fax que tiene cada país


#11- Realiza una consulta que permita presentar el
#máximo, mínimo y el promedio de años que llevan en la empresa los empleados
SELECT  MAX(DATEDIFF(NOW(), HireDate)) AS maximo,
       MIN(DATEDIFF(NOW(), HireDate)) AS minimo,
       AVG(DATEDIFF(NOW(), HireDate)) AS promedio
FROM employees;


#14- Realiza
#una consulta que muestre la mayor edad, la menor edad y la edad promedio de los
#empleados. Recuerde que para eso tiene que buscar la diferencia entre la fecha
#actual y la fecha de nacimiento.

SELECT  
       MAX(ROUND((DATEDIFF(BirthDate, CURDATE())/365),1)) AS max_age,
       MIN(ROUND((DATEDIFF(BirthDate, CURDATE())/365),1)) AS min_age,
       AVG(ROUND((DATEDIFF(BirthDate, CURDATE())/365),1)) AS avg_age
FROM Employees;
#Round es para redondear los valores


#16- Realiza
#una consulta que me permita mostrar el número de la factura y el valor por
#concepto de envío
SELECT OrderID AS NumeroFactura,
    ShipName AS ProveedorEnvio,
    Freight AS ValorEnvio
FROM Orders;
#JOIN Shippers  ON ShipVia = ShipperID;

#17- Realiza
#una consulta que me permita mostrar el número de la factura y el valor por
#concepto de envío pero de aquellos que superen a los 10.
SELECT OrderID AS NumeroFactura,
		Freight As ConceptoEnvio
FROM orders
WHERE Freight > 10;

#18
SELECT MIN(UnitPrice), MAX(UnitPrice), AVG(UnitPrice), SUM(UnitPrice)/COUNT(*)
FROM products;
