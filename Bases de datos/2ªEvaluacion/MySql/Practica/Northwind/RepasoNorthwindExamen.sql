/*Encuentra los clientes que han realizado pedidos en el mes actual*/
SELECT c.contactName, OrderDate
FROM customers c JOIN orders o USING(customerId)
WHERE MONTH(OrderDate) = "3";

/*Muestra los productos que tienen un precio superior al promedio de todos los productos*/
SELECT ProductName, UnitPrice
FROM Products
WHERE UnitPrice > (SELECT AVG(UnitPrice) FROM Products);

/*Encuentra los empleados que tienen un salario superior al promedio de la empresa*/
#SELECT 
#FROM employees ;





