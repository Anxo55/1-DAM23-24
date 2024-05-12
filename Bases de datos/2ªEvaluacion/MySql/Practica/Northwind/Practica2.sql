#1. Una lista de
#todos los detalles de la tabla de empleados.
SELECT *
FROM employees;

#2. Una lista de los nombres y apellidos de todos
#los empleados.

SELECT firstName, lastName
FROM employees;

#3. Una lista de todos los nombres de las
#ciudades que aparecen en la tabla de empleados.
SELECT DISTINCT city
FROM employees;

#4. Una lista de los
#nombres de productos y precios unitarios.
SELECT productName, UnitPrice
FROM products;

#5. En la tabla de empleados: una lista de los
#detalles completos de los empleados que viven en EE.UU.
SELECT *
FROM employees
WHERE city = 'london';


#6. A partir de la tabla Pedidos, listar todos
#los pedidos que tienen un gasto de envio > 50.
SELECT *
FROM orders
WHERE Freight > 50;

#7. De la tabla de clientes: listar nombre de la
#empresa de todos los clientes donde el cargo es igual a Propietario.
SELECT companyName, contactName
FROM customers
WHERE ContactTitle = 'owner';

#8. A partir de los clientes una lista de todos
#donde el nombre del cliente comienza con la letra "A”. (CONSULTAR COMANDO
#“LIKE”)
SELECT *
FROM customers
WHERE ContactName LIKE 'A%';

#9. Una lista de los nombres de clientes donde la
#región no está en blanco.
SELECT ContactName, region
FROM customers
WHERE Region != '';

#10. Una lista de todos los productos, ordenado
#por precio unitario (el más barato primero).
SELECT ProductName, UnitPrice
FROM products
ORDER BY UnitPrice ASC;

#11. Una lista de todos los productos, ordenado
#por precio unitario (el más caro primero).
SELECT ProductName, UnitPrice
FROM products
ORDER BY UnitPrice DESC;

#12. El número total de empleados. Nombre de la
#columna de salida "TotalEmpleados".
SELECT COUNT(firstName) AS TotalEmpleados
FROM employees;

SELECT COUNT(DISTINCT firstName) AS TotalEmpleados
FROM employees;

#13. De la tabla de Pedidos, el pedido con el
#menor gasto de envió, el gasto de envió promedio y el máximo gasto de envió
#(puede estar separado en 3 consultas distintas).
SELECT MIN(freight), MAX(freight), AVG(freight)
FROM orders;


#14. Utilizando la tabla de clientes una lista de
#los nombres de ciudades y el número de clientes en cada ciudad.
SELECT city, COUNT(*)
FROM customers
GROUP BY city;

#15. Utilizando la tabla de clientes una lista de
#los nombres de ciudades y el número de clientes en cada ciudad. Solo las
#ciudades con al menos 2 clientes deben aparecer en la lista.
SELECT city, COUNT(*) 
FROM customers
GROUP BY city
HAVING COUNT(*)>=2;

#productos unitprice >100 y <500

SELECT UnitPrice
FROM products
WHERE UnitPrice BETWEEN 100 AND 500;

#procutos, categorias 1 2 y 5
SELECT *
FROM products
WHERE CategoryID IN(1,2,5);

#clientes que vivan en usa y españa
SELECT *
FROM customers
WHERE country IN("spain", "usa");
