#Ejercicio de ejemplo subido en el classroom
CALL EjemploCursor1();

-- 1. Listar Películas por Categoría
-- Crear un cursor que liste todas las películas de una categoría específica.
CREATE TABLE IF NOT EXISTS categorias (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS peliculas (
    id INT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

INSERT INTO categorias (id, nombre) VALUES
(1, 'Acción'),
(2, 'Comedia'),
(3, 'Drama');

INSERT INTO peliculas (id, titulo, categoria_id) VALUES
(1, 'Película de Acción 1', 1),
(2, 'Película de Comedia 1', 2),
(3, 'Película de Drama 1', 3),
(4, 'Película de Acción 2', 1);

CALL ListarPeliculasPorCategoria('Acción');

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarPeliculasPorCategoria`(IN categoriaNombre VARCHAR(100))
-- BEGIN
    -- DECLARE done INT DEFAULT 0;
    -- DECLARE peliculaTitulo VARCHAR(255);

    -- DECLARE peliculaCursor CURSOR FOR
        -- SELECT p.titulo
        -- FROM peliculas p
        -- JOIN categorias c ON p.categoria_id = c.id
        -- WHERE c.nombre = categoriaNombre;

    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- OPEN peliculaCursor;

    -- pelicula_loop: LOOP
        -- FETCH peliculaCursor INTO peliculaTitulo;
        -- IF done THEN
            -- LEAVE pelicula_loop;
        -- END IF;
        -- SELECT peliculaTitulo;
    -- END LOOP;

    -- CLOSE peliculaCursor;
-- END


-- 2. Actualizar Stock de Inventario
-- Crear un cursor que recorra todos los inventarios y actualice el stock basado en ciertas condiciones.
-- Este ejercicio no se puede hacer


-- 3. Calcular Ingresos por Tienda
-- Crear un cursor que calcule los ingresos totales generados por cada tienda.
CALL CalcularIngresosPorTienda();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `CalcularIngresosPorTienda`()
-- BEGIN
    -- DECLARE done INT DEFAULT 0;
    -- DECLARE storeId INT;
    -- DECLARE ingresosTotales DECIMAL(10, 2);
    
    -- Declarar el cursor para seleccionar todas las tiendas
    -- DECLARE tiendaCursor CURSOR FOR
        -- SELECT store_id FROM store;
    
    -- Manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
    -- Abrir el cursor
    -- OPEN tiendaCursor;
    
    -- Bucle del cursor
    -- tienda_loop: LOOP
        -- FETCH tiendaCursor INTO storeId;
        -- IF done THEN
            -- LEAVE tienda_loop;
        -- END IF;
        
        -- Calcular los ingresos totales para la tienda actual
        -- SELECT SUM(p.amount) INTO ingresosTotales
        -- FROM payment p
        -- JOIN staff s ON p.staff_id = s.staff_id
        -- WHERE s.store_id = storeId;
        
        -- Mostrar los ingresos totales por tienda
        -- SELECT storeId AS 'ID de Tienda', ingresosTotales AS 'Ingresos Totales';
    -- END LOOP;
    
    -- Cerrar el cursor
    -- CLOSE tiendaCursor;
-- END


-- 4. Clientes con Más de 10 Alquileres
-- Crear un cursor que liste los clientes que han realizado más de 10 alquileres.
CALL ListarClientesFrecuentes();

/* CREATE PROCEDURE ListarClientesFrecuentes()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE customerId INT;
    DECLARE rentalCount INT;
    DECLARE customerName VARCHAR(255);

    -- Declarar el cursor para seleccionar todos los clientes
    DECLARE clienteCursor CURSOR FOR
        SELECT customer_id, first_name, last_name
        FROM customer;
    
    -- Manejador para el final del cursor
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
    -- Abrir el cursor
    OPEN clienteCursor;
    
    -- Bucle del cursor
    cliente_loop: LOOP
        FETCH clienteCursor INTO customerId, customerName;
        IF done THEN
            LEAVE cliente_loop;
        END IF;
        
        -- Contar el número de alquileres para el cliente actual
        SELECT COUNT(*) INTO rentalCount
        FROM rental
        WHERE customer_id = customerId;
        
        -- Si el cliente ha realizado más de 10 alquileres, mostrar la información
        IF rentalCount > 10 THEN
            SELECT customerId AS 'ID de Cliente', customerName AS 'Nombre del Cliente', rentalCount AS 'Número de Alquileres';
        END IF;
    END LOOP;
    
    -- Cerrar el cursor
    CLOSE clienteCursor;
END*/


-- 5. Películas no Alquiladas
-- Crear un cursor que identifique las películas que no han sido alquiladas en los últimos 6 meses.


-- 6. Empleados con Ventas Mayores a $1000
-- Crear un cursor que liste a los empleados que han generado ventas superiores a $1000.
CALL ListarEmpleadosVentasSuperiores1000();

/*CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarEmpleadosVentasSuperiores1000`()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE staffId INT;
    DECLARE staffName VARCHAR(255);
    DECLARE totalVentas DECIMAL(10, 2);

    -- Declarar el cursor para seleccionar todos los empleados
    DECLARE empleadoCursor CURSOR FOR
        SELECT staff_id, CONCAT(first_name, ' ', last_name) AS full_name
        FROM staff;

    -- Manejador para el final del cursor
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- Abrir el cursor
    OPEN empleadoCursor;

    -- Bucle del cursor
    empleado_loop: LOOP
        FETCH empleadoCursor INTO staffId, staffName;
        IF done THEN
            LEAVE empleado_loop;
        END IF;

        -- Calcular el total de ventas para el empleado actual
        SELECT SUM(amount) INTO totalVentas
        FROM payment
        WHERE staff_id = staffId;

        -- Si el total de ventas supera $1000, mostrar la información del empleado
        IF totalVentas > 1000 THEN
            SELECT staffId AS 'ID de Empleado', staffName AS 'Nombre de Empleado', totalVentas AS 'Total de Ventas';
        END IF;
    END LOOP;

    -- Cerrar el cursor
    CLOSE empleadoCursor;
END*/


-- 7. Promedio de Duración de Películas por Categoría
-- Crear un cursor que calcule el promedio de duración de las películas en cada categoría.

CALL PromedioDuracionPorCategoria();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `PromedioDuracionPorCategoria`()
-- BEGIN
    -- DECLARE done INT DEFAULT 0;
    -- DECLARE cat_id INT;
    -- DECLARE cat_name VARCHAR(25);
    -- DECLARE avg_length DECIMAL(10, 2);

    -- Declara un cursor para iterar sobre todas las categorías
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT category_id, name FROM category;

    -- Declara un handler para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- Crea una tabla temporal para almacenar los resultados
    -- CREATE TEMPORARY TABLE IF NOT EXISTS AvgLengthByCategory (
        -- category_id INT,
        -- category_name VARCHAR(25),
        -- average_length DECIMAL(10, 2)
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada categoría
    -- read_loop: LOOP
        -- FETCH cur1 INTO cat_id, cat_name;
        -- IF done THEN
            -- LEAVE read_loop;
        -- END IF;

        -- Calcula el promedio de duración de las películas en la categoría actual
        -- SELECT AVG(f.length)
        -- INTO avg_length
        -- FROM film f
        -- JOIN film_category fc ON f.film_id = fc.film_id
        -- WHERE fc.category_id = cat_id;

        -- Inserta el resultado en la tabla temporal
        -- INSERT INTO AvgLengthByCategory (category_id, category_name, average_length)
        -- VALUES (cat_id, cat_name, avg_length);
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales
    -- SELECT * FROM AvgLengthByCategory;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE AvgLengthByCategory;
-- END


-- Boletín de Ejercicios de Cursores sobre la Base de Datos Sakila

-- 8. Actualizar Precio de Películas Antiguas
-- Crear un cursor que actualice el precio de las películas lanzadas hace más de 5 años.





-- 9. Listar Películas por Actor
-- Crear un cursor que liste todas las películas en las que ha participado un actor específico.

CALL ListarPeliculasPorActor('NOMBRE_DEL_ACTOR', 'APELLIDO_DEL_ACTOR');

-- CREATE PROCEDURE ListarPeliculasPorActor(IN nombre_actor VARCHAR(45), IN apellido_actor VARCHAR(45))
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_pelicula INT;
    -- DECLARE titulo_pelicula VARCHAR(255);

    -- Declara un cursor para seleccionar las películas en las que ha participado el actor específico
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT f.film_id, f.title
    -- FROM film f
    -- JOIN film_actor fa ON f.film_id = fa.film_id
    -- JOIN actor a ON fa.actor_id = a.actor_id
    -- WHERE a.first_name = nombre_actor AND a.last_name = apellido_actor;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada película del actor
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_pelicula, titulo_pelicula;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Selecciona el título de la película (puedes hacer cualquier otra operación aquí)
        -- SELECT titulo_pelicula;
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;
-- END


-- 10. Clientes con Mayor Gasto
-- Crear un cursor que identifique a los clientes que han gastado más de $500 en alquileres.

CALL ClientesConMayorGasto();

-- CREATE PROCEDURE ClientesConMayorGasto()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_cliente INT;
    -- DECLARE nombre_cliente VARCHAR(45);
    -- DECLARE apellido_cliente VARCHAR(45);
    -- DECLARE gasto_total DECIMAL(10, 2);

    -- Declara un cursor para seleccionar los clientes que han gastado más de $500 en alquileres
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT c.customer_id, c.first_name, c.last_name, SUM(p.amount) AS total_gasto
    -- FROM customer c
    -- JOIN payment p ON c.customer_id = p.customer_id
    -- GROUP BY c.customer_id
    -- HAVING total_gasto > 500;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada cliente
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_cliente, nombre_cliente, apellido_cliente, gasto_total;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Selecciona los detalles del cliente (puedes hacer cualquier otra operación aquí)
        -- SELECT id_cliente AS "ID Cliente", nombre_cliente AS "Nombre", apellido_cliente AS "Apellido", gasto_total AS "Total Gastado";
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;
-- END

-- 11. Detalles de Alquileres por Mes
-- Crear un cursor que liste los detalles de los alquileres realizados cada mes.

CALL DetallesAlquileresPorMes();

-- CREATE PROCEDURE DetallesAlquileresPorMes()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE fecha_mes DATE;
    -- DECLARE id_cliente INT;
    -- DECLARE nombre_cliente VARCHAR(45);
    -- DECLARE apellido_cliente VARCHAR(45);
    -- DECLARE titulo_pelicula VARCHAR(255);
    -- DECLARE fecha_alquiler DATE;

    -- Declara un cursor para seleccionar los detalles de los alquileres agrupados por mes
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT 
        -- DATE_FORMAT(r.rental_date, '%Y-%m-01') AS mes,
        -- c.customer_id,
        -- c.first_name,
        -- c.last_name,
        -- f.title,
        -- r.rental_date
    -- FROM rental r
    -- JOIN customer c ON r.customer_id = c.customer_id
    -- JOIN inventory i ON r.inventory_id = i.inventory_id
    -- JOIN film f ON i.film_id = f.film_id
    -- ORDER BY mes, r.rental_date;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Crea una tabla temporal para almacenar los resultados
    -- CREATE TEMPORARY TABLE IF NOT EXISTS DetallesAlquileres (
        -- mes DATE,
        -- id_cliente INT,
        -- nombre_cliente VARCHAR(45),
        -- apellido_cliente VARCHAR(45),
        -- titulo_pelicula VARCHAR(255),
        -- fecha_alquiler DATE
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada alquiler
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO fecha_mes, id_cliente, nombre_cliente, apellido_cliente, titulo_pelicula, fecha_alquiler;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Inserta el detalle del alquiler en la tabla temporal
        -- INSERT INTO DetallesAlquileres (mes, id_cliente, nombre_cliente, apellido_cliente, titulo_pelicula, fecha_alquiler)
        -- VALUES (fecha_mes, id_cliente, nombre_cliente, apellido_cliente, titulo_pelicula, fecha_alquiler);
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales
    -- SELECT * FROM DetallesAlquileres;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE DetallesAlquileres;
-- END


-- 12. Inventario Bajo
-- Crear un cursor que identifique las películas con menos de 5 copias disponibles en inventario.

CALL PeliculasConInventarioBajo();

-- CREATE PROCEDURE PeliculasConInventarioBajo()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_pelicula INT;
    -- DECLARE titulo_pelicula VARCHAR(255);
    -- DECLARE cantidad_copias INT;

    -- Declara un cursor para seleccionar las películas con menos de 5 copias disponibles
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT f.film_id, f.title, COUNT(i.inventory_id) AS copias_disponibles
    -- FROM film f
    -- JOIN inventory i ON f.film_id = i.film_id
    -- LEFT JOIN rental r ON i.inventory_id = r.inventory_id AND r.return_date IS NULL
    -- GROUP BY f.film_id, f.title
    -- HAVING copias_disponibles < 5;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Crea una tabla temporal para almacenar los resultados
    -- CREATE TEMPORARY TABLE IF NOT EXISTS InventarioBajo (
        -- id_pelicula INT,
        -- titulo_pelicula VARCHAR(255),
        -- cantidad_copias INT
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada película con bajo inventario
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_pelicula, titulo_pelicula, cantidad_copias;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Inserta el detalle de la película con bajo inventario en la tabla temporal
        -- INSERT INTO InventarioBajo (id_pelicula, titulo_pelicula, cantidad_copias)
        -- VALUES (id_pelicula, titulo_pelicula, cantidad_copias);
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales
    -- SELECT * FROM InventarioBajo;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE InventarioBajo;
-- END
 
 
-- 13. Películas Más Alquiladas
-- Crear un cursor que liste las 10 películas más alquiladas en el último año.

CALL PeliculasMasAlquiladasUltimoAno();

-- CREATE PROCEDURE PeliculasMasAlquiladasUltimoAno()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_pelicula INT;
    -- DECLARE titulo_pelicula VARCHAR(255);
    -- DECLARE cantidad_alquileres INT;

    -- Declara un cursor para seleccionar las 10 películas más alquiladas en el último año
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT f.film_id, f.title, COUNT(r.rental_id) AS num_alquileres
    -- FROM rental r
    -- JOIN inventory i ON r.inventory_id = i.inventory_id
    -- JOIN film f ON i.film_id = f.film_id
    -- WHERE r.rental_date >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
    -- GROUP BY f.film_id, f.title
    -- ORDER BY num_alquileres DESC
    -- LIMIT 10;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Crea una tabla temporal para almacenar los resultados
    -- CREATE TEMPORARY TABLE IF NOT EXISTS PeliculasMasAlquiladas (
        -- id_pelicula INT,
        -- titulo_pelicula VARCHAR(255),
        -- cantidad_alquileres INT
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada película más alquilada
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_pelicula, titulo_pelicula, cantidad_alquileres;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Inserta el detalle de la película más alquilada en la tabla temporal
        -- INSERT INTO PeliculasMasAlquiladas (id_pelicula, titulo_pelicula, cantidad_alquileres)
        -- VALUES (id_pelicula, titulo_pelicula, cantidad_alquileres);
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales
    -- SELECT * FROM PeliculasMasAlquiladas;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE PeliculasMasAlquiladas;
-- END


-- 14. Clientes Sin Alquileres Recientes
-- Crear un cursor que identifique a los clientes que no han realizado ningún alquiler en el último año.

CALL ClientesSinAlquileresRecientes();

-- CREATE PROCEDURE ClientesSinAlquileresRecientes()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_cliente INT;
    -- DECLARE nombre_cliente VARCHAR(45);
    -- DECLARE apellido_cliente VARCHAR(45);

    -- Declara un cursor para seleccionar los clientes que no han realizado ningún alquiler en el último año
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT c.customer_id, c.first_name, c.last_name
    -- FROM customer c
    -- LEFT JOIN rental r ON c.customer_id = r.customer_id 
      -- AND r.rental_date >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
    -- WHERE r.rental_id IS NULL;

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Crea una tabla temporal para almacenar los resultados
    -- CREATE TEMPORARY TABLE IF NOT EXISTS ClientesSinAlquileres (
        -- id_cliente INT,
        -- nombre_cliente VARCHAR(45),
        -- apellido_cliente VARCHAR(45)
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada cliente sin alquiler reciente
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_cliente, nombre_cliente, apellido_cliente;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Inserta el detalle del cliente sin alquiler reciente en la tabla temporal
        -- INSERT INTO ClientesSinAlquileres (id_cliente, nombre_cliente, apellido_cliente)
        -- VALUES (id_cliente, nombre_cliente, apellido_cliente);
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales
    -- SELECT * FROM ClientesSinAlquileres;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE ClientesSinAlquileres;
-- END


-- Boletín de Ejercicios de Cursores sobre la Base de Datos Sakila

-- 15. Actualizar Estado de Devoluciones Tardías
-- Crear un cursor que actualice el estado de las devoluciones tardías y aplique multas
-- correspondientes.

CALL ActualizarEstadoDevolucionesTardias();

-- CREATE PROCEDURE ActualizarEstadoDevolucionesTardias()
-- BEGIN
    -- DECLARE terminado INT DEFAULT 0;
    -- DECLARE id_rental INT;
    -- DECLARE id_cliente INT;
    -- DECLARE fecha_retorno DATE;
    -- DECLARE fecha_devolucion DATE;
    -- DECLARE multa DECIMAL(5,2);

    -- Define la multa por día de retraso (puedes ajustar este valor según sea necesario)
    -- SET multa = 1.00;

    -- Declara un cursor para seleccionar las devoluciones tardías
    -- DECLARE cur1 CURSOR FOR 
    -- SELECT rental_id, customer_id, rental_date, return_date
    -- FROM rental
    -- WHERE return_date IS NULL AND rental_date < DATE_SUB(CURDATE(), INTERVAL 30 DAY);

    -- Declara un manejador para el final del cursor
    -- DECLARE CONTINUE HANDLER FOR NOT FOUND SET terminado = 1;

    -- Crea una tabla temporal para almacenar las multas aplicadas
    -- CREATE TEMPORARY TABLE IF NOT EXISTS MultasAplicadas (
        -- rental_id INT,
        -- customer_id INT,
        -- monto_multa DECIMAL(5,2),
        -- fecha_multa DATE
    -- );

    -- Abre el cursor
    -- OPEN cur1;

    -- Bucle para iterar sobre cada devolución tardía
    -- bucle_lectura: LOOP
        -- FETCH cur1 INTO id_rental, id_cliente, fecha_retorno, fecha_devolucion;
        -- IF terminado THEN
            -- LEAVE bucle_lectura;
        -- END IF;

        -- Calcula los días de retraso
        -- SET @dias_retraso = DATEDIFF(CURDATE(), fecha_retorno);

        -- Actualiza el estado de la devolución
        -- UPDATE rental
        -- SET return_date = CURDATE()
        -- WHERE rental_id = id_rental;

        -- Inserta la multa en la tabla temporal
        -- INSERT INTO MultasAplicadas (rental_id, customer_id, monto_multa, fecha_multa)
        -- VALUES (id_rental, id_cliente, @dias_retraso * multa, CURDATE());

        -- Inserta la multa en la tabla de pagos
        -- INSERT INTO payment (customer_id, staff_id, rental_id, amount, payment_date)
        -- VALUES (id_cliente, 1, id_rental, @dias_retraso * multa, CURDATE());
    -- END LOOP;

    -- Cierra el cursor
    -- CLOSE cur1;

    -- Selecciona los resultados finales de las multas aplicadas
    -- SELECT * FROM MultasAplicadas;

    -- Limpia la tabla temporal
    -- DROP TEMPORARY TABLE MultasAplicadas;
-- END

