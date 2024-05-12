#1. Lista los empleados que han vendido más que el promedio de ventas de todos los 
#empleados.
SELECT EmployeeID, FirstName, LastName
FROM Employees;

#2. Encuentra los productos que tienen un precio mayor al precio promedio de todos 
#los productos.
SELECT ProductName, UnitPrice
FROM Products
WHERE UnitPrice > (SELECT AVG(UnitPrice) FROM Products);

#3. Selecciona los clientes que han realizado órdenes por encima del valor promedio 
#de todas las órdenes.
SELECT CustomerID, CompanyName
FROM Customers
WHERE CustomerID IN (
    SELECT CustomerID
    FROM Orders
    WHERE Freight > (SELECT AVG(Freight) FROM Orders)
);

#4. Muestra los proveedores cuyo total de productos suministrados es mayor al 
#promedio de productos suministrados por todos los proveedores.

#5. Encuentra las órdenes que contienen el producto más vendido.

#6. Lista los empleados que no han realizado ninguna venta.

#7. Obtén los clientes que han comprado todos los productos de una categoría 
#específica.

#8. Determina los productos que nunca han sido ordenados.

#9. Selecciona las categorías de productos que solo tienen productos con precio 
#mayor a un valor específico.

#10. Encuentra los clientes que han realizado órdenes en cada cuarto del año.

#11. Muestra los productos que han sido comprados en una cantidad total mayor a un 
#valor específico.

#12. Identifica los empleados que han vendido a más clientes distintos.

#13. Selecciona las órdenes realizadas por clientes que nunca han comprado un 
#producto específico.

#14. Encuentra los proveedores cuyos productos tienen un precio promedio superior al 
#de otros proveedores.

#15. Lista las órdenes que contienen productos de más de tres categorías diferentes.

#16. Determina los clientes que han gastado más que el cliente promedio en sus 
#compras.

#17. Obtén los productos cuyo stock está por debajo del promedio de stock de todos los 
#productos.

#18. Encuentra las órdenes que se han realizado en el mismo país tanto del cliente 
#como del empleado que la gestionó.

#19. Muestra los empleados que han gestionado órdenes de un valor superior al valor 
#más alto de una orden que ellos mismos hayan realizado.

#20. Selecciona los productos que han sido ordenados en una cantidad total en un 
#rango específico