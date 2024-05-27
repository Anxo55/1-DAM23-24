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


-- Boletín de Ejercicios de Cursores sobre la Base de Datos Sakila

-- 8. Actualizar Precio de Películas Antiguas
-- Crear un cursor que actualice el precio de las películas lanzadas hace más de 5 años.


-- 9. Listar Películas por Actor
-- Crear un cursor que liste todas las películas en las que ha participado un actor específico.


-- 10. Clientes con Mayor Gasto
-- Crear un cursor que identifique a los clientes que han gastado más de $500 en alquileres.


-- 11. Detalles de Alquileres por Mes
-- Crear un cursor que liste los detalles de los alquileres realizados cada mes.


-- 12. Inventario Bajo
-- Crear un cursor que identifique las películas con menos de 5 copias disponibles en inventario.
 
 
-- 13. Películas Más Alquiladas
-- Crear un cursor que liste las 10 películas más alquiladas en el último año.


-- 14. Clientes Sin Alquileres Recientes
-- Crear un cursor que identifique a los clientes que no han realizado ningún alquiler en el último año.


-- Boletín de Ejercicios de Cursores sobre la Base de Datos Sakila

-- 15. Actualizar Estado de Devoluciones Tardías
-- Crear un cursor que actualice el estado de las devoluciones tardías y aplique multas
-- correspondientes.

