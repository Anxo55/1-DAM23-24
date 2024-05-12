#1. Escriba una vista que se llame listado_pagos_clientes que muestre un listado donde aparezcan
#todos los clientes y los pagos que ha realizado cada uno de ellos. La vista deberá tener las siguientes co‑
#lumnas: nombre y apellidos del cliente concatenados, teléfono, ciudad, pais, fecha_pago, total del pago,
##id de la transacción
CREATE OR REPLACE VIEW listado_pagos_clientes (Nombre_completo, Telefono, Ciudad, Fecha_de_pago, Total, ID) AS
SELECT CONCAT(c.nombre_contacto, ' ', c.apellido_contacto), c.telefono, c.ciudad, p.fecha_pago, p.total, p.id_transaccion
FROM cliente c JOIN pago p USING(codigo_cliente);

SELECT *
FROM listado_pagos_clientes;

#2. Escriba una vista que se llame listado_pedidos_clientes que muestre un listado donde aparez‑
#can todos los clientes y los pedidos que ha realizado cada uno de ellos. La vista deberá tener las siguientes
#columnas: código del cliente, nombre y apellidos del cliente concatendados, teléfono, ciudad, pais, códi‑
#go del pedido, fecha del pedido, fecha esperada, fecha de entrega y la cantidad total del pedido, que será
#la suma del producto de todas las cantidades por el precio de cada unidad, que aparecen en cada línea
#de pedido.

#CON LA BASE DE DATOS DE JARDINERIA
CREATE OR REPLACE VIEW listado_pedidos_clientes (ID, Nombre_completo, Telefono, Ciudad, Total) AS
SELECT c.codigo_cliente, CONCAT(c.nombre_contacto, ' ', c.apellido_contacto), c.telefono, c.ciudad, SUM(precio_venta * precio_unidad)
FROM cliente c JOIN pedido p USING(codigo_cliente) 
			   JOIN detalle_pedido USING(codigo_pedido)
			   JOIN producto pr USING(codigo_producto)
GROUP BY c.codigo_cliente;

SELECT *
FROM listado_pedidos_clientes;



#CON LAS BASE DE DATOS DE SAKILA
CREATE OR REPLACE VIEW listado_pedidos_clientes (ID, Nombre_completo, telefono, ciudad, total) AS
SELECT c.customer_id, CONCAT(c.first_name, ' ', c.last_name), a.phone, ci.city, SUM(p.amount)
FROM city ci JOIN address a USING(city_id) JOIN customer c  USING(address_id) 
			 JOIN payment p USING(customer_id) JOIN rental r USING(rental_id) 
             JOIN inventory i USING(inventory_id)
GROUP BY c.customer_id;

SELECT *
FROM listado_pedidos_clientes;


#3. Utilice las vistas que ha creado en los pasos anteriores para devolver un listado de los clientes de la ciudad
#de Madrid que han realizado pagos.
SELECT * FROM listado_pagos_clientes WHERE ciudad='MADRID';

#4. Utilice las vistas que ha creado en los pasos anteriores para devolver un listado de los clientes que todavía
#no han recibido su pedido.
SELECT * FROM listado_pedidos_clientes WHERE fecha_entrega IS NULL;

#5. Utilice las vistas que ha creado en los pasos anteriores para calcular el número de pedidos que se ha
#realizado cada uno de los clientes.
SELECT codigo_cliente, COUNT(*),GROUP_CONCAT(cod_pedido)
FROM listado_pedidos_clientes
GROUP BY codigo_cliente;

#6. Utilice las vistas que ha creado en los pasos anteriores para calcular el valor del pedido máximo y mínimo
#que ha realizado cada cliente.
SELECT codigo_cliente, MAX(total),MIN(total)
FROM listado_pedidos_clientes
GROUP BY codigo_cliente;

#7. Modifique el nombre de las vistalistado_pagos_clientesy asígnele el nombrelistado_de_pagos
#. Una vez que haya modificado el nombre de la vista ejecute una consulta utilizando el nuevo nombre de
#la vista para comprobar que sigue funcionando correctamente.
RENAME TABLE listado_pagos_clientes TO listado_de_pagos;

SELECT * FROM listado_de_pagos;

#8. Elimine las vistas que ha creado en los pasos anteriores
DROP VIEW IF EXISTS listado_de_pagos;
DROP VIEW IF EXISTS listado_pedidos_clientes;
