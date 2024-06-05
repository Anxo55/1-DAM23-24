-- 1.-Crear un procedimiento almacenado que reciba dos parámetros de entrada (nombre y edad) y los inserte en una tabla llamada "personas" con tres columnas (id, nombre y edad). El id es un valor autoincrementado.

-- CREATE TABLE personas (
	-- id INT AUTO_INCREMENT PRIMARY KEY,
	-- nombre VARCHAR(50),
	-- edad INT
-- );

-- DELIMITER //

-- CREATE PROCEDURE InsertarPersona(IN nombre VARCHAR(50), IN edad INT)
-- BEGIN
	-- INSERT INTO personas (nombre, edad) VALUES (nombre, edad);
-- END //

-- DELIMITER ;


-- 2.-Crear un procedimiento almacenado que reciba un parámetro de entrada (id) y devuelva el nombre de la persona correspondiente de la tabla clientes.
-- DELIMITER //

-- CREATE PROCEDURE ObtenerNombreCliente(IN id INT)
-- BEGIN
	-- SELECT nombre FROM clientes WHERE cliente_id = id;
-- END //

-- DELIMITER ;




-- 3.-Crear un procedimiento almacenado con un cursor que recorra la tabla de productos y muestre por pantalla el nombre y el precio de cada producto.
-- DELIMITER //

-- CREATE PROCEDURE ListarProductos()
-- BEGIN
	-- DECLARE done INT DEFAULT FALSE;
	-- DECLARE nombre_producto VARCHAR(50);
	-- DECLARE precio DECIMAL(10,2);
	-- DECLARE producto_cursor CURSOR FOR SELECT nombre, precio FROM productos;
	-- DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

	-- OPEN producto_cursor;

	-- read_loop: LOOP
    	-- FETCH producto_cursor INTO nombre_producto, precio;
    	-- IF done THEN
        	-- LEAVE read_loop;
    	-- END IF;
    	-- SELECT nombre_producto, precio;
	-- END LOOP;

	-- CLOSE producto_cursor;
-- END //

-- DELIMITER ;


-- 4.-Crear un procedimiento almacenado que recorra los pedidos y devuelva el total de ventas de cada mes del año actual. El procedimiento debe devolver una tabla con dos columnas (mes y total)
-- DELIMITER //

-- CREATE PROCEDURE VentasMensuales()
-- BEGIN
	-- SELECT MONTH(fecha_pedido) AS mes, SUM(total) AS total
	-- FROM pedidos
	-- WHERE YEAR(fecha_pedido) = YEAR(CURDATE())
	-- GROUP BY MONTH(fecha_pedido);
-- END //

-- DELIMITER ;




-- 5.-Crear una función que reciba un parámetro de entrada (id del producto) y devuelva el número de unidades vendidas de ese producto durante los meses de enero.
-- DELIMITER //

-- CREATE FUNCTION UnidadesVendidasEnero(id_producto INT) RETURNS INT
-- BEGIN
	-- DECLARE unidades_vendidas INT;
	-- SELECT SUM(cantidad) INTO unidades_vendidas
	-- FROM detalles_pedidos
	-- WHERE producto_id = id_producto AND MONTH(fecha_pedido) = 1;
	-- RETURN unidades_vendidas;
-- END //

-- DELIMITER ;



-- 6.-Crear un cursor que recorra una tabla de productos y actualice el precio de cada producto en un 10%.
-- DELIMITER //

-- CREATE PROCEDURE ActualizarPrecios()
-- BEGIN
	-- DECLARE done INT DEFAULT FALSE;
	-- DECLARE id_producto INT;
	-- DECLARE precio_actual DECIMAL(10,2);
	-- DECLARE producto_cursor CURSOR FOR SELECT producto_id, precio FROM productos;
	-- DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

	-- OPEN producto_cursor;

	-- read_loop: LOOP
    	-- FETCH producto_cursor INTO id_producto, precio_actual;
    	-- IF done THEN
        	-- LEAVE read_loop;
    	-- END IF;
    	-- UPDATE productos SET precio = precio_actual * 1.10 WHERE producto_id = id_producto;
	-- END LOOP;

	-- CLOSE producto_cursor;
-- END //

-- DELIMITER ;

-- 7.-Crear una función que reciba un parámetro de entrada (id del producto) y devuelva el precio promedio de ese producto en todos los pedidos.
-- ELIMITER //

-- CREATE FUNCTION PrecioPromedioProducto(id_producto INT) RETURNS DECIMAL(10,2)
-- BEGIN
	-- DECLARE precio_promedio DECIMAL(10,2);
	-- SELECT AVG(precio_unitario) INTO precio_promedio
	-- FROM detalles_pedidos
	-- WHERE producto_id = id_producto;
	-- RETURN precio_promedio;
-- END //

-- DELIMITER ;



