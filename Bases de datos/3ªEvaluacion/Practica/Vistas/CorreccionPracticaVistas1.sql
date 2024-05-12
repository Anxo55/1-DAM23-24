/*1 */
CREATE OR REPLACE VIEW listado_pagos_clientes (nombre,telefono,ciudad,pais,feha,id,total) AS
SELECT CONCAT(nombre_contacto,' ',apellido_contacto),telefono,ciudad,pais,fecha_pago,id_transaccion,total
FROM cliente c JOIN pago p USING(codigo_cliente);

/*2 Escriba una vista que se llame listado_pedidos_clientes que muestre un listado donde aparez‐
can todos los clientes y los pedidos que ha realizado cada uno de ellos. La vista deberá tener las siguientes
columnas: código del cliente, nombre y apellidos del cliente concatendados, teléfono, ciudad, pais, códi‐
go del pedido, fecha del pedido, fecha esperada, fecha de entrega y la cantidad total del pedido, que será
la suma del producto de todas las cantidades por el precio de cada unidad, que aparecen en cada línea
de pedido.*/

CREATE OR REPLACE VIEW listado_pedidos_clientes (codigo_cliente,nombre,telefono,ciudad,pais,cod_pedido,fecha_pedido,fecha_esperada,fecha_entrega,total) AS
SELECT codigo_cliente,CONCAT(nombre_contacto,' ',apellido_contacto),telefono,ciudad,pais,
codigo_pedido,fecha_pedido,fecha_esperada,fecha_entrega,SUM(cantidad*precio_unidad)
FROM cliente c JOIN pedido p USING(codigo_cliente) JOIN detalle_pedido dp USING(codigo_pedido)
GROUP BY codigo_pedido;



/*3 */

SELECT * FROM listado_pagos_clientes WHERE ciudad='MADRID';

/*4 */
SELECT * FROM listado_pedidos_clientes WHERE fecha_entrega IS NULL;

/*5 OS DEJO EL GROUP_CONCAT CON FINES PEDAGÓGICOS */

SELECT codigo_cliente, COUNT(*),GROUP_CONCAT(cod_pedido)
FROM listado_pedidos_clientes
GROUP BY codigo_cliente;

/* 6 */

SELECT codigo_cliente, MAX(total),MIN(total)
FROM listado_pedidos_clientes
GROUP BY codigo_cliente;

/* 7 Modifique el nombre de las vistalistado_pagos_clientesy asígnele el nombrelistado_de_pagos
. Una vez que haya modificado el nombre de la vista ejecute una consulta utilizando el nuevo nombre de
la vista para comprobar que sigue funcionando correctamente.*/

RENAME TABLE listado_pagos_clientes TO listado_de_pagos;

SELECT * FROM listado_de_pagos;

/* 8 */

DROP VIEW IF EXISTS listado_de_pagos;
DROP VIEW IF EXISTS listado_pedidos_clientes;
