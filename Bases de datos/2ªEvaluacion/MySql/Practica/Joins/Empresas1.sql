SELECT codPedido, fechaPedido, p.codCliente , c.nombre, e.nombre
FROM pedidos p JOIN clientes c USING(codCliente) JOIN empleados e ON p.codRepresentante=e.codEmpleado 
ORDER BY codPedido;

#1 empleados y codigo de sus jefes
SELECT e.codEmpleado, nombre, idDirector
FROM empleados e JOIN directores d ON e.codJefe = d.codDirector;

#2 empleados y nombre ciudad donde trabajan
SELECT e.nombre, o.ciudad # no hace falta poner el e o el o ya que no se repite en ambas tablas
FROM empleados e JOIN oficinas o ON e.oficina=o.codOficina;

SELECT codEmpleado, nombre, ciudad
FROM empleados e JOIN oficinas o ON e.codEmpleado = o.codOficina;

#3 lienaspedido y nombre producto de cada linea de pedido.
SELECT * 
FROM lineasPedido lp JOIN productos p ON lp.producto = p.idProducto;

SELECT * FROM pedidos;
SELECT * FROM clientes;

SELECT p.codPedido, p.fechaPedido, c.nombre
FROM pedidos p JOIN clientes c USING(codCliente)
ORDER BY codPedido;

#INFORMACIONC CABECERA PEDIDO
SELECT p.codPedido, lp.producto, lp.cantidad, prod.descripcion, e.nombre
FROM pedidos p JOIN lineasPedido lp USING(codPedido) JOIN productos prod ON lp.producto=prod.idProducto
JOIN empleados e ON p.codRepresentante=e.codEmpleado;


