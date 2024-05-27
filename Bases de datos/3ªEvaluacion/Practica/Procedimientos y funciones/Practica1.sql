#1. Crea un procedimiento que visualice todas las películas cuyo costo de reemplazo sea
#superior a un valor que se pasará como parámetro de entrada. ¿Cuántas películas
#tienen un costo de reemplazo superior a 20€?
CALL Visualizar_peliculas_por_costo(20);

SELECT COUNT(*)
FROM film
WHERE replacement_cost > 20;

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `Visualizar_peliculas_por_costo`(IN costo_limite DECIMAL(5,2))
-- BEGIN
	-- SELECT film_id, title, replacement_cost
    -- FROM film
    -- WHERE replacement_cost > costo_limite;
-- END

#2. Crea un procedimiento que visualice todas las películas cuyo costo de reemplazo
#esté comprendido entre dos cantidades que se pasarán como parámetros de entrada.
#¿Cuántas películas tienen un costo de reemplazo superior a 20€ y 21,99 €?
CALL VisualizarPeliculasPorRangoCosto(20, 21.99);

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `VisualizarPeliculasPorRangoCosto`(IN costo_min DECIMAL(5, 2),
   -- IN costo_max DECIMAL(5, 2)
    -- )
-- BEGIN
	-- SELECT film_id, title, replacement_cost
    -- FROM film
    -- WHERE replacement_cost BETWEEN costo_min AND costo_max;
-- END

#3. Crear un procedimiento almacenado que devuelva todos los actores cuyo apellido
#comience con una letra específica
CALL ActoresPorLetra('F');

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `ActoresPorLetra`( IN letra CHAR(1))
-- BEGIN
	-- SELECT actor_id, first_name, last_name
    -- FROM actor
    -- WHERE last_name LIKE CONCAT(letra, '%');
-- END

#4. Crear una función que calcule la duración total de una película en minutos dado el ID
#de la película.
SELECT duracion_peli(5) AS duracion;

-- CREATE DEFINER=`root`@`localhost` FUNCTION `duracion_peli`(id_pelicula INT(10)) RETURNS int unsigned
    -- DETERMINISTIC
-- BEGIN
	-- DECLARE duracion INT UNSIGNED;
	-- SET duracion = (SELECT length
    -- FROM film
    -- WHERE film_id LIKE id_pelicula);
    -- RETURN duracion;
-- END


#5. Crear un procedimiento almacenado que devuelva el número total de películas
#alquiladas por un cliente específico.
CALL PeliculasAlquiladasPorCliente(1, @total);
SELECT @total;

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `PeliculasAlquiladasPorCliente`(IN cliente_id INT,
    -- OUT total_peliculas_alquiladas INT)
-- BEGIN
	-- SELECT COUNT(rental_id) INTO total_peliculas_alquiladas
    -- FROM rental
    -- WHERE customer_id = cliente_id;
-- END

#6. Crear una función que devuelva la cantidad total de películas en una categoría
#específica:
SELECT cantidad_peliculas_categoria('Action');

-- CREATE DEFINER=`root`@`localhost` FUNCTION `cantidad_peliculas_categoria`(nombre_categoria VARCHAR(255)) RETURNS int
    -- DETERMINISTIC
-- BEGIN
-- DECLARE cantidad INT;
    
    -- SELECT COUNT(f.film_id) INTO cantidad
    -- FROM film f
    -- JOIN film_category fc ON f.film_id = fc.film_id
    -- JOIN category c ON fc.category_id = c.category_id
    -- WHERE c.name = nombre_categoria;
    
    -- RETURN cantidad;
-- END

#7. Crea un procedimiento almacenado que liste todos los clientes que hayan alquilado
#una película en un mes específico.
CALL ClientesQueAlquilaronEnMes(1, 2006);

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `ClientesQueAlquilaronEnMes`(IN mes INT,
    -- IN anio INT)
-- BEGIN
	-- SELECT DISTINCT c.customer_id, c.first_name, c.last_name
    -- FROM customer c, rental r, inventory i, film f
    -- WHERE c.customer_id = r.customer_id
        -- AND r.inventory_id = i.inventory_id
        -- AND i.film_id = f.film_id
        -- AND MONTH(r.rental_date) = mes
        -- AND YEAR(r.rental_date) = anio;
-- END

#8. Diseña una función que devuelva el nombre completo de un actor dado su ID.
SELECT nombre_completo_actor(1);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `nombre_completo_actor`(actor_id INT) RETURNS varchar(255) CHARSET utf8mb4
    -- DETERMINISTIC
-- BEGIN
-- DECLARE nombre_completo VARCHAR(255);
    
    -- SELECT CONCAT(first_name, ' ', last_name) INTO nombre_completo
    -- FROM actor
    -- WHERE actor_id = actor_id;
    
    -- RETURN nombre_completo;
-- END

#9. Crea una función que calcule el total de ingresos generados por alquileres de películas
#en una sucursal específica.
SELECT ingresos_por_sucursal(1);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `ingresos_por_sucursal`(sucursal_id INT) RETURNS decimal(10,2)
    -- DETERMINISTIC
-- BEGIN
-- DECLARE total_ingresos DECIMAL(10, 2);
    
    -- SELECT SUM(p.amount) INTO total_ingresos
    -- FROM payment p
    -- JOIN rental r ON p.rental_id = r.rental_id
    -- JOIN inventory i ON r.inventory_id = i.inventory_id
    -- JOIN store s ON i.store_id = s.store_id
    -- WHERE s.store_id = sucursal_id;
    
    -- RETURN total_ingresos;
-- END

#10. Escribe una función que devuelva el número de actores que han aparecido en una
#película dada su ID.
SELECT numero_actores_por_pelicula(1);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `numero_actores_por_pelicula`(pelicula_id INT) RETURNS int
    -- DETERMINISTIC
-- BEGIN
    -- DECLARE num_actores INT;
    
    -- SELECT COUNT(actor_id) INTO num_actores
    -- FROM film_actor
    -- WHERE film_id = pelicula_id;
    
    -- RETURN num_actores;
-- END

#11. Crea un procedimiento almacenado que liste todas las películas que aún no han sido
#alquiladas.
CALL PeliculasNoAlquiladas();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `PeliculasNoAlquiladas`()
-- BEGIN
	-- SELECT f.film_id, f.title
    -- FROM film f
    -- LEFT JOIN inventory i ON f.film_id = i.film_id
    -- LEFT JOIN rental r ON i.inventory_id = r.inventory_id
    -- WHERE r.rental_id IS NULL;
-- END

#Otra opcion para hacerla


#12. Diseña una función que devuelva la cantidad total de películas alquiladas por un
#cliente dado su ID.
SELECT cantidad_peliculas_alquiladas_por_cliente(1);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `cantidad_peliculas_alquiladas_por_cliente`(cliente_id INT) RETURNS int
    -- DETERMINISTIC
-- BEGIN
    -- DECLARE cantidad_peliculas INT;
    
    -- SELECT COUNT(rental_id) INTO cantidad_peliculas
    -- FROM rental
    -- WHERE customer_id = cliente_id;
    
    -- RETURN cantidad_peliculas;
-- END

#corregirlo
SELECT CONCAT(first_name,' ', last_name), cantidad_peliculas_alquiladas_por_cliente() AS "Total"
FROM customer
ORDER BY customer_id;


#13. Diseña un procedimiento almacenado que actualice la clasificación de una película
#dada su ID.
CALL ActualizarClasificacionPelicula(1, 'PG-13');

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarClasificacionPelicula`(IN pelicula_id INT,
    -- IN nueva_clasificacion VARCHAR(10))
-- BEGIN
	-- UPDATE film
    -- SET rating = nueva_clasificacion
    -- WHERE film_id = pelicula_id;
-- END

#14. Escribe una función que devuelva la cantidad de películas alquiladas en un mes
#específico.
SELECT cantidad_peliculas_alquiladas_en_mes(2005, 5);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `cantidad_peliculas_alquiladas_en_mes`(anio INT, mes INT) RETURNS int
    -- DETERMINISTIC
-- BEGIN
    -- DECLARE cantidad INT;
    
    -- SELECT COUNT(rental_id) INTO cantidad
    -- FROM rental
    -- WHERE YEAR(rental_date) = anio AND MONTH(rental_date) = mes;
    
    -- RETURN cantidad;
-- END

#15. Diseña una función que calcule la duración promedio de todas las películas en una
#categoría específica.
SELECT duracion_promedio_por_categoria('Action');

-- CREATE DEFINER=`root`@`localhost` FUNCTION `duracion_promedio_por_categoria`(nombre_categoria VARCHAR(255)) RETURNS decimal(10,2)
    -- DETERMINISTIC
-- BEGIN
    -- DECLARE duracion_promedio DECIMAL(10, 2);
    
    -- SELECT AVG(length) INTO duracion_promedio
    -- FROM film
    -- WHERE film_id IN (
        -- SELECT film_id
        -- FROM film_category
        -- WHERE category_id = (
            -- SELECT category_id
            -- FROM category
            -- WHERE name = nombre_categoria
        -- )
    -- );
    
    -- RETURN duracion_promedio;
-- END

