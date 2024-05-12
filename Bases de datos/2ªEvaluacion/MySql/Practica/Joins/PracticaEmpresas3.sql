#1) Listar los nombres de los clientes que tienen asignado el representante García Gómez, Luis 
#Antonio (suponiendo que no pueden haber representantes con el mismo nombre).
SELECT c.nombre
FROM clientes c JOIN empleados e ON c.codRepresentante = e.codEmpleado
WHERE e.nombre = "Garcia Gomez, Luis Antonio";

SELECT *
FROM clientes
WHERE codRepresentante IN (SELECT codEmpleado FROM empleados WHERE nombre = "García Gómez, Luis Antonio");


#2) Listar los vendedores (codEmpleado, nombre, y nº de oficina) que trabajan en oficinas "buenas" 
#(las que tienen ventas superiores a su objetivo).
SELECT codEmpleado, nombre, oficina
FROM empleados
WHERE oficina IN(SELECT codOficina FROM oficinas WHERE ventas>objetivo);


#3) Listar los vendedores que no trabajan en oficinas dirigidas por el empleado 108.
SELECT *
FROM empleados
WHERE oficina NOT IN(SELECT codOficina FROM Directores WHERE codDirector=108);


#4) Listar los productos (idfabricante, idproducto y descripción) para los cuales no se ha recibido 
#ningún pedido de 500 € o más.
SELECT prod.idFabricante, prod.idProducto, prod.Descripcion
FROM productos prod
WHERE( SELECT SUM(li.precioVenta*li.cantidad) AS beneficio 
		FROM lineasPedido AS li 
        WHERE li.producto = prod.idProducto
        GROUP BY li.codPedido ORDER BY beneficio DESC LIMIT 1)<500;


#5) Listar los clientes asignados a García Gómez, Luis Antonio que no han remitido un pedido 
#superior a 5.000 €.
SELECT *
FROM clientes 
WHERE codRepresentante IN (SELECT codEmpleado FROM empleados WHERE nombre ="García Gómez, Luis Antonio")
AND codCliente IN(SELECT codCliente FROM pedidos WHERE codPedido IN(SELECT codPedido
					FROM lineasPedido
					GROUP BY codPedido
					HAVING SUM(cantidad*precioVenta)<5000));
                    
SELECT p.codPedido, c.codCliente, SUM(lp.cantidad*lp.precioVenta)
FROM empleados e JOIN clientes c ON e.codEmpleado = c.codRepresentante JOIN pedidos p USING(codCliente) JOIN lineasPedido lp USING(codPedido)
WHERE e.nombre = "García Gómez, Luis Antonio"
GROUP BY p.codPedido
HAVING SUM(lp.cantidad*lp.precioVenta)< 5000;



#6) Listar las oficinas en donde haya un vendedor cuyas ventas representen más del 55% del objetivo 
#de su oficina.
SELECT o.codOficina
FROM oficinas o	JOIN empleados e ON o.codOficina = e.codEmpleado
WHERE ventas > 1.55 * objetivo;


#7) Listar las oficinas en donde todos los vendedores tienen sueldos que superan al 50% del objetivo 
#de la oficina.
SELECT *
FROM oficinas o


#8) Listar las oficinas que tengan un objetivo mayor que la suma de los objetivos de sus vendedores.


#9) Listar las oficinas que tengan un objetivo mayor que la suma de los objetivos de sus vendedores.


#10) Hallar cuántos pedidos (total de cada pedido) hay de más de 1800 €.


#11) Saber cuántas oficinas tienen empleados con ventas superiores a su objetivo, no queremos saber 
#cuáles sino cuántas hay.


#12) Listar las oficinas en donde todos los vendedores tienen ventas que superan al 50% del objetivo 
#de la oficina.


#13) Seleccionar los pedidos, entendiendo por un pedido el Código del pedido y todas sus líneas, con 
#un importe superior a 30.000€. 


#14) Listar las oficinas que no tienen director. 


#15) Seleccionar los clientes que no han realizado ningún pedido.


#16) Seleccionar los productos que no han sido vendidos.


#17) Seleccionar los representantes que no han realizado ninguna venta, indicando el nombre del 
#empleado

