#1) ¿Cuál es el sueldo medio y el sueldo total de todos los empleados?


#2) Hallar el importe medio de pedidos, el importe total de pedidos y el precio medio de venta.


#3) Hallar el precio medio de los productos del fabricante ACI.


#4) Hallar el precio medio de los productos del fabricante ACI, BIC, QSA e IMM.


#5) Hallar el precio medio de los productos del fabricante ACI, BIC, QSA e IMM únicamente si el 
#precio medio supera los 13 €.


#6) ¿Cuál es el importe total de los pedidos realizados por el empleado 'Vázquez Lopez, Jose Luis'? 


#7) Hallar en qué fecha se realizó el primer pedido (suponiendo que en la tabla de pedidos tenemos 
#todos los pedidos realizados hasta la fecha). 


#8) Hallar cuántas líneas de pedido hay de más de 5.000 €.


#9) Listar cuántos empleados están asignados a cada oficina, indicar el número de oficina y cuántos 
#hay asignados. 
SELECT oficina, COUNT(*)
FROM empleados
GROUP BY oficina;


#10) Para cada empleado, obtener su número, nombre, e importe vendido por ese empleado a cada 
#cliente indicando el número y nombre del cliente. 
SELECT e.codEmpleado, e.nombre, c.codCLiente, c.nombre, SUM(lp.cantidad*lp.precioVenta)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN clientes c USING(codCliente) JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado, c.codCliente;


#11) Para cada empleado cuyos pedidos suman más de 100.000 €, hallar su importe medio de 
#pedidos. En el resultado indicar el número de empleado y su importe medio de pedidos.
#Esta solucion entiende que el importe medio de los pedidos se calcula a partir de todas las lineas.
SELECT e.codEmpleado, e.nombre, AVG(lp.cantidad * lp.precioVenta)
FROM empleados e JOIN pedidos p ON e.codEmpleado = p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado
HAVING SUM(lp.cantidad * lp.precioVenta)>100000;

SELECT e.codEmpleado, e.nombre, (SELECT SUM(lp2.cantidad * lp2.precioVenta) FROM pedidos p1 JOIN lineasPedido lp2 USING(codPedido) WHERE p1.codRepresentante=e.codEmpleado)
FROM empleados e JOIN pedidos p ON e.codEmpleado = p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado
HAVING SUM(lp.cantidad * lp.precioVenta)>100000;

 
#12) Listar de cada producto, su descripción, precio y cantidad total pedida, incluyendo sólo los 
#productos cuya cantidad total pedida sea superior al 75% del stock; y ordenado por cantidad 
#total pedida. 
SELECT p.idProducto, p.descripcion, p.precioCompra, SUM(lp.cantidad), p.existencias
FROM productos p JOIN lineasPedido lp ON p.idProducto = lp.producto
GROUP BY p.idProducto
HAVING SUM(lp.cantidad)>p.existencias*0.75
ORDER BY 4 DESC;


#13) Listar las pedidos superiores a 10.000 €, incluyendo el nombre del empleado que tomó el pedido 
#y el nombre del cliente que lo solicitó.
SELECT p.codPedido, SUM(lp.cantidad * lp.precioVenta) AS "Total Pedido", e.nombre AS "Nombre empleado", c.nombre AS "Nombre cliente"
FROM pedidos p JOIN lineasPedido lp USING(codPedido) JOIN empleados e ON p.codRepresentante=e.codEmpleado JOIN clientes c USING(codCliente)
GROUP BY p.codPedido
HAVING SUM(lp.cantidad * lp.Precioventa) > 10000;


#14) Listar los 5 pedidos con mayor importe indicando el nombre del cliente del producto y del 
#representante.
#SELECT
#FROM pedidos p


#15) Listar ordenadamente por el importe vendido por cada empleado, indicando su nombre.
SELECT e.nombre, SUM(lp.cantidad * lp.precioVenta)
FROM lineasPedido lp JOIN pedidos p USING(codPedido) JOIN empleados e ON p.codRepresentante = e.codEmpleado
GROUP BY e.nombre
HAVING SUM(lp.cantidad * lp.precioVenta);


#16) Obtener el nombre de todos los empleados cuyas ventas no han llegado a cubrir el objetivo que 
#tenían, además se deberá listar también cual es la cantidad y el porcentaje que representa.
#Repasarla para corregir.
SELECT e.nombre, e.objetivo
FROM empleados e JOIN pedidos p ON e.codEmpleado = p.codRepresentante JOIN lineasPedido lp USING(codPedido)
WHERE objetivo IS NOT NULL;


#17) Calcular el total vendido a cada cliente
SELECT c.nombre
FROM clientes c JOIN pedidos p USING(codCliente) JOIN lineasPedido lp USING(codPedido);


#18) Calcular el total vendido a cada cliente de cada producto


#19) Calcular el total de cada pedido, indicando el nombre del cliente, la fecha del pedido


#20) Calcular el total vendido cada mes


#21) Seleccionar para cada fabricante el precio medio de sus productos


#22) Indicar cuál es el producto del que se han vendidos más unidades, 


#23) Calcular para cada producto el beneficio (Ingresos – gastos), indicando el producto, el total 
#vendido y el total comprado.
SELECT p.idProducto,SUM(lp.cantidad*lp.precioVenta)-SUM(lp.cantidad*p.precioCompra) AS "Beneficios"
FROM productos p JOIN lineasPedido lp ON lp.producto = p.idProducto
GROUP BY p.idProducto;


#24) Listar ordenadamente por el importe vendido por cada empleado, indicando su nombre.
SELECT e.codEmpleado, e.nombre, SUM(precioVenta*cantidad)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado
ORDER BY 3 DESC;

#25) Obtener las ventas mensuales de los empleados. Hay que diseñar una consulta sumaria 
#calculando la suma de los importes de los pedidos agrupando por empleado y mes de la venta.
SELECT e.codEmpleado, MONTH(p.fechaPedido), e.nombre, SUM(precioVenta*cantidad)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado, MONTH(p.fechaPedido)
ORDER BY 1,2;


#26) Igual que la anterior pero sólo nos interesan los meses de febrero, mayo y diciembre.

#HAVING
SELECT e.codEmpleado, MONTH(p.fechaPedido) AS mes , e.nombre, SUM(precioVenta*cantidad)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado, MONTH(p.fechaPedido)
HAVING mes IN (2,5,12)
ORDER BY 1,2;

#WHERE
SELECT e.codEmpleado, MONTH(p.fechaPedido) AS mes , e.nombre, SUM(precioVenta*cantidad)
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
WHERE MONTH(p.fechaPedido) IN (2,5,12)
GROUP BY e.codEmpleado, MONTH(p.fechaPedido)
ORDER BY 1,2;


#27) Igual que la anterior pero sólo nos interesan los meses de febrero, mayo y diciembre y la suma de 
#los pedidos sea mayor que 60000.
SELECT e.codEmpleado, MONTH(p.fechaPedido) AS mes , e.nombre, SUM(precioVenta*cantidad) AS total
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
WHERE MONTH(p.fechaPedido) IN (2,5,12)
GROUP BY e.codEmpleado, MONTH(p.fechaPedido)
HAVING total > 60000
ORDER BY 1,2;


#28) Obtener para cada empleado cuánto ha vendido en total y cuál ha sido el importe mayor vendido 
#en un pedido
SELECT e.codEmpleado, e.nombre,lp.codPedido, SUM(precioVenta*cantidad) AS total
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante JOIN lineasPedido lp USING(codPedido)
GROUP BY e.codEmpleado, lp.codPedido;

SELECT SUM(precioVenta*cantidad)
FROM pedidos p JOIN lineasPedido lp USING(codPedido)
GROUP BY p.codPedido
ORDER BY 1 DESC
LIMIT 1;


