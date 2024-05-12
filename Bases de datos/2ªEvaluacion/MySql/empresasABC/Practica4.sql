/*1) ¿Cuál es el sueldo medio y el sueldo total de todos los empleados?*/

SELECT CONCAT(ROUND(AVG(sueldo),2),' €') AS "Media Sueldo",SUM(sueldo) AS "Sueldo total"
FROM empleados;

/* 2)Hallar el importe medio de pedidos, el importe total de pedidos y el precio medio de venta.*/

SELECT AVG(precioVenta*cantidad) AS "Importe medio ventas",SUM(precioVenta*cantidad) AS "Total pedidos",
        AVG(precioVenta) AS "Precio medio venta"
FROM lineasPedido;

/* IMPORTE DE CADA PEDIDO*/

SELECT codPedido,SUM(precioVenta*cantidad)
FROM lineasPedido
GROUP BY codPedido;

/*Hallar el precio medio de los productos del fabricante ACI.*/

SELECT AVG(precioCompra)
FROM productos
WHERE idFabricante='ACI';

/*4) Hallar el precio medio de los productos del fabricante ACI, BIC, QSA e IMM.*/
SELECT AVG(precioCompra)
FROM productos
WHERE idFabricante IN ('ACI','BIC','QSA','IMM');

/* VAMOS A HACERLO POR FABRICANTE*/
SELECT idFabricante,AVG(precioCompra)
FROM productos
WHERE idFabricante IN ('ACI','BIC','QSA','IMM')
GROUP BY idFabricante;

/*5 Hallar el precio medio de los productos del fabricante ACI, BIC, QSA e IMM únicamente si el
precio medio supera los 13 €.*/

SELECT idFabricante,AVG(precioCompra)
FROM productos
WHERE idFabricante IN ('ACI','BIC','QSA','IMM')
GROUP BY idFabricante
HAVING AVG(precioCompra)>13;

/*6) ¿Cuál es el importe total de los pedidos realizados por el empleado 'Vázquez Lopez, Jose Luis'?*/

SELECT SUM(PrecioVenta*Cantidad) AS "TOTAL JOSE LUIS" FROM lineasPedido WHERE codPedido IN
(SELECT codPedido FROM Pedidos WHERE codRepresentante=
(SELECT codEmpleado
FROM empleados
WHERE nombre='Vázquez Lopez, Jose Luis'));

SELECT SUM(lp.cantidad*lp.precioVenta)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp ON p.codPedido=lp.codPedido
WHERE e.nombre='Vázquez Lopez, Jose Luis';

/* 7 Hallar en qué fecha se realizó el primer pedido (suponiendo que en la tabla de pedidos tenemos
todos los pedidos realizados hasta la fecha).*/

SELECT MIN(fechaPedido)
FROM pedidos;

SELECT * FROM pedidos ORDER BY fechaPedido LIMIT 1;

/*8 Hallar cuántas líneas de pedido hay de más de 5.000 €.*/

SELECT COUNT(*)
FROM lineasPedido
WHERE (precioVenta*Cantidad)>5000;
#9) Listar cuántos empleados están asignados a cada oficina, indicar el número de oficina y cuántos 
#hay asignados. 
SELECT Oficina, COUNT(*), GROUP_CONCAT(codEmpleado), GROUP_CONCAT(Nombre) 
FROM Empleados
GROUP BY Oficina;

#10) Para cada empleado, obtener su número, nombre, e importe vendido por ese empleado a cada 
#cliente indicando el número y nombre del cliente. 

#11) Para cada empleado cuyos pedidos suman más de 100.000 €, hallar su importe medio de 
#pedidos. En el resultado indicar el número de empleado y su importe medio de pedidos. 
#12) Listar de cada producto, su descripción, precio y cantidad total pedida, incluyendo sólo los 
#productos cuya cantidad total pedida sea superior al 75% del stock; y ordenado por cantidad 
#total pedida. 
#13) Listar las pedidos superiores a 10.000 €, incluyendo el nombre del empleado que tomó el pedido 
#y el nombre del cliente que lo solicitó.
#14) Listar los 5 pedidos con mayor importe indicando el nombre del cliente del producto y del 
#representante.
#15) Listar ordenadamente por el importe vendido por cada empleado, indicando su nombre.
#16) Obtener el nombre de todos los empleados cuyas ventas no han llegado a cubrir el objetivo que 
#tenían, además se deberá listar también cual es la cantidad y el porcentaje que representa.
#17) Calcular el total vendido a cada cliente
#18) Calcular el total vendido a cada cliente de cada producto
#19) Calcular el total de cada pedido, indicando el nombre del cliente, la fecha del pedido
#20) Calcular el total vendido cada mes
#21) Seleccionar para cada fabricante el precio medio de sus productos
SELECT  idFabricante, ROUND(AVG(precioCompra),2)
FROM productos
GROUP BY (idFabricante);

#22) Indicar cuál es el producto del que se han vendidos más unidades, 
SELECT producto, SUM(cantidad)
FROM LineasPedido
GROUP BY producto;

#23) Calcular para cada producto el beneficio (Ingresos – gastos), indicando el producto, el total 
#vendido y el total comprado.
#24) Listar ordenadamente por el importe vendido por cada empleado, indicando su nombre.
#25) Obtener las ventas mensuales de los empleados. Hay que diseñar una consulta sumaria 
#calculando la suma de los importes de los pedidos agrupando por empleado y mes de la venta.
#26) Igual que la anterior pero sólo nos interesan los meses de febrero, mayo y diciembre.
#2
# 27) Igual que la anterior pero sólo nos interesan los meses de febrero, mayo y diciembre y la suma de 
#los pedidos sea mayor que 60000.
#28) Obtener para cada empleado cuánto ha vendido en total y cuál ha sido el importe mayor vendido 
#en un pedido