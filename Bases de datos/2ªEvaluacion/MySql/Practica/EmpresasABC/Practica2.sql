#La lista de selección
#1) Obtener una lista de todos los productos indicando para cada uno su idfabricante, idproducto, 
#descripción, precio de compra, IVA y precio con I.V.A. incluido (es el precio anterior aumentado en 
#un 21%). 
SELECT idFabricante, idProducto, descripcion, precioCompra, existencias, precioCompra*0.21 AS 'IMPUESTO', precioCompra*1.21 'PRECIO CON IVA'
FROM Productos;


#2) De cada lineapedido queremos saber su número de pedido, fabricante, producto, cantidad, precio 
#de venta y el importe. 
SELECT CodPedido, Fabricante, Producto, Cantidad, PrecioVenta, PrecioVenta * Cantidad AS 'Importe'
FROM LineasPedido;


#3) Listar de cada empleado su nombre, nº de días que lleva trabajando en la empresa y su edad 
#(suponiendo que este año ya ha cumplido años).
SELECT nombre, YEAR(curDate())-YEAR(fecNacimiento) AS 'Edad', DATEDIFF(curdate(),fecContrato) AS 'Dias Trabajando'
FROM Empleados;

#Ordenación de filas.
#4) Obtener la lista de los clientes agrupados por código de representante asignado, visualizar todas 
#las columnas de la tabla. 
SELECT *
FROM Clientes
ORDER BY codRepresentante ASC;


#5) Obtener las oficinas ordenadas por orden alfabético de región y dentro de cada región por ciudad, 
#si hay más de una oficina en la misma ciudad, aparecerá primero la que tenga el número de oficina 
#mayor. 
SELECT codOficina, ciudad , region, objetivo, ventas
FROM Oficinas
ORDER BY region ASC, ciudad ASC, codOficina DESC;

#6) Obtener los pedidos ordenados por fecha de pedido.
#Selección de filas.
SELECT *
FROM Pedidos
ORDER BY fechaPedido;


#7) Listar las ocho líneas de pedido más caras (las de mayor importe). 
SELECT *
FROM lineasPedido
ORDER BY precioVenta DESC
LIMIT 8;

#8) Obtener las mismas columnas que en el ejercicio anterior pero sacando únicamente las 5 líneas de 
#pedido de menor precio unitario. 


SELECT codPedido, producto, precioVenta
FROM lineasPedido
ORDER BY precioVenta ASC
LIMIT 5;


#9) Listar toda la información de los pedidos de marzo del último año. 
SELECT *
FROM Pedidos
WHERE fechaPedido >= '2022-03-01' AND FechaPedido <='2022-03-31';
#WHERE fechaPedido BETWEEN 2022-03-01 AND 2022-03-31;

#10) Listar los pedidos del mes pasado.
SELECT * 
FROM Pedidos
WHERE fechaPedido >= DATEADD(month, -1, GETDATE()) AND fechaPedido < GETDATE();
#Corregir que está mal.


#11) Listar los números de los empleados que tienen una oficina asignada. 
SELECT COUNT(Oficina)
FROM empleados
WHERE Oficina IS 
NOT NULL;

#12) Listar los nombres de los empleados que no tienen asignada una oficina. 
SELECT nombre AS 'Nombre Empleados'
FROM Empleados
WHERE Oficina IS NULL;
#13) Listar los datos de las oficinas de las regiones del Galicia y Euzkadi (tienen que aparecer primero las 
#del Euzkadi y después las de Galicia).
SELECT *
FROM Oficinas 
WHERE Region = 'Galicia' OR region = 'Euzkadi';

#14) .Listar los clientes de nombre Julia. 
SELECT *
FROM Clientes
WHERE nombre LIKE "julia%"; 

#15) Listar los productos cuyo idproducto acabe en x.
SELECT *
FROM productos
WHERE idProducto LIKE '%x';

#16) Obtener toda la información de los empleados cuya edad este comprendida entre 40 y 60 años.
SELECT nombre,FecNacimiento,TRUNCATE(DATEDIFF(curDate(),FecNacimiento)/365,0) edad
FROM empleados
WHERE TRUNCATE(DATEDIFF(curDate(),FecNacimiento)/365,0)>=40 AND TRUNCATE(DATEDIFF(curDate(),FecNacimiento)/365,0)<=60;

#17) Obtener todos los clientes cuyos representantes tengan los códigos 102, 104 y 109.
SELECT *
FROM clientes
WHERE codRepresentante IN (102,104,109);

#18) Obtener un listado de todos los productos ordenados alfabéticamente por fabricante y después de 
#mayor a menor precio.
SELECT *
FROM productos
ORDER BY idFabricante,PrecioCompra DESC;

#19) Listar todos los empleados que lleven trabajando más de 25 años en la empresa.
SELECT codEmpleado,Nombre,FecContrato,ROUND(DATEDIFF(curdate(),FecContrato)/365) AS antiguedad
FROM empleados
WHERE ROUND(DATEDIFF(curdate(),FecContrato)/365)>=25;

#20) Listar todas las oficinas que no tengan marcado ningún objetivo.
SELECT *
FROM oficinas
WHERE objetivo IS NULL OR objetivo=0;

#21) Obtener el nombre de todos los empleados cuyo salario acumulado hasta la fecha actual no han 
#llegado a cubrir el objetivo que tenían, además se deberá calcular el importe que les falta.

SELECT objetivo,sueldo,
TIMESTAMPDIFF(MONTH,fecContrato,curDate()) AS meses,
TIMESTAMPDIFF(MONTH,fecContrato,curDate())*sueldo AS acumulado,
objetivo-(TIMESTAMPDIFF(MONTH,fecContrato,curDate())*sueldo) AS Diferencia
FROM empleados
WHERE (TIMESTAMPDIFF(MONTH,fecContrato,curDate())*sueldo)<objetivo;

#22) Obtener el nombre del empleado, sueldo, comisión, sueldo bruto (sueldo + comisión), el importe 
#de las retenciones tanto del IRPF como de la S.S., y el sueldo neto (sueldo bruto – las retenciones)
SELECT nombre,sueldo,comision,(sueldo+comision) 
AS "Sueldo bruto",retencionesIRPF,retencionesSS,
ROUND((sueldo+comision)*(1-(retencionesIRPF+retencionesSS)),2) 
AS "Sueldo neto"