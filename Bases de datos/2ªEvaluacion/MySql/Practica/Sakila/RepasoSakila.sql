/*2.1 Muestre los nombre y apellidos de todos los actores de la tabla actor*/
SELECT CONCAT(first_name, ' ', last_name) AS "Nombre Completo"
FROM actor;

/*2.2 Devuelva todos los actores cuyos apellidos contengan las letras LI.
Esta vez, ordene las filas por apellido y nombre, en ese orden*/
SELECT *
FROM actor
WHERE last_name LIKE '%LI%'
ORDER BY last_name, first_name;

/*2.3 Con IN, muestre las columnnas country_id y country de los siguientes países:
Afganistán, Bangladesh y China*/

SELECT country_id, country
FROM country
WHERE country IN("Afghanistan", "Bangladesh", "China");

/*2.4 Enumere los apellidos de los actores y la cantidad de actores que tienen ese apellidos, 
pero solo para los nombres que comparten al menos dos actores*/

SELECT last_name, COUNT(*)
FROM actor
GROUP BY last_name
HAVING COUNT(*)>=2;

/*2.5 Muestre el importe total cobrado por cada trabajador en Agosto de 2005*/
SELECT first_name, last_name, SUM(amount)
FROM payment JOIN staff USING(staff_id)
WHERE YEAR(payment_date) = 2005 AND MONTH(payment_date) = 8
GROUP BY staff_id;

/*2.6 Liste todas las peliculas y el numero de actores que aparecen en cada película*/
SELECT film_id, title, COUNT(*)
FROM film f JOIN film_actor USING(film_id) 
GROUP BY film_id;

/*2.7 Cuantas copias de la pelicula Hunchback impossible existen en el inventario?*/
SELECT COUNT(*)
FROM film f JOIN inventory i USING(film_id)
WHERE title = "Hunchback Impossible";

/*2.8 Liste los 5 generos principales en ingresos en orden descendente. (Es posible
que necesite utilizar las siguiente tablas: category, film_category,
inventory, payment y rental*/
SELECT c.category_id, c.name, SUM(p.amount)
FROM category c JOIN film_category fc USING(category_id) JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id)
				JOIN payment p USING(rental_id)
GROUP BY c.category_id
ORDER BY 3 DESC
LIMIT 5;

/*2.9 Muestre el importe pagado para aquellos clientes de Estados Unidos*/
SELECT co.country, SUM(p.amount)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
				JOIN rental r USING(customer_id) JOIN payment p USING(rental_id)
WHERE co.country = "UNITED STATES";

/*2.10La musica Queen y KrisTofferson ha visto un resurgimiento impensable. Como consecuencia inesperada, las peliculas que comienzan con
las letras "k" y "Q" tambien se han disparado en cuanto a alquileres. Use subconsultas para mostrar los titulos de */
SELECT *
FROM film f 
WHERE title LIKE "Q%" OR title LIKE "K%" AND language_id=(SELECT language_id FROM language WHERE name = "English");



