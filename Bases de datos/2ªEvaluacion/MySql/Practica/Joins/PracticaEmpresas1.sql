#1) Listar las oficinas de Galicia indicando para cada una de ellas su número, ciudad, códigos y 
#nombres de sus empleados. Hacer una versión en la que aparecen sólo las que tienen empleados, 
#y hacer otra en las que aparezcan las oficinas de Galicia que no tienen empleados.
SELECT codOficina, ciudad, codEmpleado, nombre
FROM oficinas o JOIN empleados e ON o.codOficina = e.oficina
WHERE region = 'Galicia';


#2) Listar los pedidos mostrando su número, fecha del pedido, nombre del cliente, y el límite de 
#crédito del cliente correspondiente (todos los pedidos tienen cliente y representante).
SELECT codPedido, FechaPedido, nombre, limiteCredito
FROM pedidos p JOIN clientes c USING(codRepresentante)
ORDER BY 1;


#3) Listar los datos de cada uno de los empleados, la ciudad y región en donde trabaja. 
SELECT codEmpleado, nombre, oficina, ciudad, region
FROM empleados e JOIN oficinas o ON e.oficina = o.codOficina;


#4) Listar las oficinas con objetivo superior a 3.500€ indicando para cada una de ellas el nombre de 
#su director. 
SELECT o.*, e.nombre AS "Nombre Director"
FROM oficinas o JOIN directores d USING(codOficina)	JOIN empleados e ON d.codDirector = e.codEmpleado
WHERE o.objetivo > 3500;


#5) Listar las líneas de pedido superiores a 150 €, incluyendo el nombre del empleado que tomó el 
#pedido y el nombre del cliente que lo solicitó.
SELECT lp.*, e.nombre AS "Nombre Empleado", c.nombre AS "Nombre Cliente"
FROM lineasPedido lp JOIN pedidos p USING(codPedido) JOIN empleados e ON p.codRepresentante=e.codEmpleado JOIN clientes c USING(codCliente)
WHERE (lp.cantidad * lp.precioVenta) > 150;


#6) Hallar los empleados que realizaron su primer pedido el mismo día en que fueron contratados.
SELECT *
FROM empleados e
WHERE e.fecContrato = (SELECT MIN(fechaPedido) FROM pedidos WHERE codRepresentante=e.codEmpleado);

SELECT *
FROM empleados e JOIN pedidos p ON e.codEmpleado=p.codRepresentante
WHERE e.fecContrato = p.fechaPedido;


#7) Listar los empleados con un sueldo superior al de su jefe; para cada empleado sacar sus datos y el 
#número, nombre y sueldo de su jefe.
SELECT e.*
FROM empleados e JOIN directores d ON e.oficina = d.codOficina;


#8) Listar los códigos y nombre de los empleados que tienen una línea de pedido superior a 5.000 € o 
#que tengan un objetivo inferior a 200.000 €. (El empleado deberá mostrarse una vez)
#SELECT
#FROM empleados e


#9) Listar las 5 líneas de pedido con mayor importe indicando el nombre del cliente del producto y 
#del representante.


#10) Listar las oficinas que no tienen director. 


#11) Seleccionar los clientes que no han realizado ningún pedido.


#12) Seleccionar los productos que no han sido vendidos.


#13) Seleccionar los representantes que no han realizado ninguna venta, indicando el nombre del 
#empleado

