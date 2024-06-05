/*1 Crea una vista que muestre los actores que han participado en mas de 20 peliculas sakila*/
CREATE OR  REPLACE VIEW actorres_participado(ID, participacion, Nombre_Completo) AS
SELECT actor_id, COUNT(film_id), CONCAT( a.first_name, a.last_name)
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id)
GROUP BY actor_id
HAVING COUNT(film_id)>20;

SELECT *
FROM actorres_participado;



SELECT actor_id, COUNT(film_id), CONCAT( a.first_name, a.last_name)
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id)
GROUP BY actor_id
HAVING COUNT(film_id)>20;


/*2 Crea una funcion almacenada que calcule y devuelva el numero de actores que hay en la base de datos de sakila*/
SELECT Ejercicio2() AS Numero_Actores;

CREATE DEFINER=`root`@`localhost` FUNCTION `Ejercicio2`() RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE contador_actores INT;

    -- Contar el número de actores en la tabla actor
    SELECT COUNT(*) INTO contador_actores
    FROM actor;

    -- Devolver el número de actores
    RETURN contador_actores;
END

/*3 Crea una funcion almacenada que recibiendo el id de una pelicula, devuelva el numero de actores que participan
 en la misma*/
 
 SELECT  Ejercicio3(1);
 
CREATE DEFINER=`root`@`localhost` FUNCTION `Ejercicio3`(pelicula_id INT) RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE numero_actores INT;
    
    SELECT COUNT(actor_id) INTO numero_actores
    FROM film_actor
    WHERE film_id = pelicula_id;
    
    RETURN numero_actores;
END
 
 /*4 Crea un cursor que recorra todas las peliculas de la base de datos de sakila y muestre el titulo y actualice
 la duracion de todas sumandole 1 minuto a cada una de ellas*/
 CALL Ejercicio4();
 
 CREATE DEFINER=`root`@`localhost` PROCEDURE `Ejercicio4`()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE v_film_id INT;
    DECLARE v_title VARCHAR(255);
    DECLARE v_length INT;

    -- Declara el cursor
    DECLARE cursor_peliculas CURSOR FOR
        SELECT film_id, title, length FROM film;

    -- Declara un manejador de salida
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    -- Abre el cursor
    OPEN cursor_peliculas;

    -- Bucle para recorrer todos los registros del cursor
    read_loop: LOOP
        FETCH cursor_peliculas INTO v_film_id, v_title, v_length;
        
        IF done THEN
            LEAVE read_loop;
        END IF;

        -- Muestra el título de la película
        SELECT v_title;

        -- Actualiza la duración de la película sumándole 1 minuto
        UPDATE film SET length = v_length + 1 WHERE film_id = v_film_id;
    END LOOP;

    -- Cierra el cursor
    CLOSE cursor_peliculas;
END;
 
 /*5 Crea un procedimiento almacenado que muestre el nombre y apellido de todos los clientes que hayan alquilado una pelicula
 en el año 2006, emplea una tabla temporal*/
 CALL Ejercicio5();
 
 CREATE DEFINER=`root`@`localhost` PROCEDURE `Ejercicio5`()
BEGIN
    -- Seleccionar los nombres y apellidos de los clientes que hayan alquilado una película en el año 2006
    SELECT DISTINCT c.first_name, c.last_name
    FROM customer c
    JOIN rental r ON c.customer_id = r.customer_id
    WHERE YEAR(r.rental_date) = 2006;
END;
 
 /*6 Crea un procedimiento que reciba el film_id y el nuevo precio de alquiler, y actualice el precio de alquiler
 de esa pelicula*/
 -- rental_rate tabla film
 
 /*7 Crea una funcion que reciba el customer_id y devuelva e total gastado en alquilers por ese cliente*/
 
 SELECT Ejercicio7(1);
 
CREATE DEFINER=`root`@`localhost` FUNCTION `Ejercicio7`(customer_id INT) RETURNS decimal(10,2)
    DETERMINISTIC
BEGIN
    DECLARE total DECIMAL(10, 2);

    SELECT SUM(p.amount) INTO total
    FROM payment p JOIN rental r USING(rental_id) 
    WHERE r.customer_id = customer_id;

    RETURN total;
END
 