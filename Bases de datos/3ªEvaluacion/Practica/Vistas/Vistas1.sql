CREATE OR REPLACE VIEW  importe_cliente (codigo_cliente, nombre_cliente, total_cliente) AS
SELECT c.customer_id, CONCAT(c.first_name,' ', c.last_name), SUM(amount)
FROM customer c JOIN payment p USING(customer_id)
GROUP BY c.customer_id;


CREATE OR REPLACE VIEW importe_cliente_ciudad AS
SELECT ic.*, ci.city AS ciudad
FROM importe_cliente ic JOIN customer c ON ic.codigo_cliente = c.customer_id 
JOIN address a ON c.address_id = a.address_id
JOIN city ci USING(city_id);

SELECT * FROM importe_cliente_ciudad;

#DROP para eliminar
DROP VIEW IF EXISTS importe_cliente_ciudad;
DROP VIEW IF EXISTS importe_cliente_neg;

SHOW FULL TABLES
WHERE table_Type='VIEW';

SHOW CREATE VIEW actor_info;
SHOW CREATE TABLE actor;
DESCRIBE actor_info;