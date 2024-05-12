/*2.1.  Muestre los nombres y apellidos de todos los actores de la tabla actor.*/
SELECT first_name, last_name 
FROM actor;

/*2.2.  Devuelva todos los actores cuyos apellidos contengan las letras LI. 
Esta vez, ordene las filas por apellido y nombre, en ese orden*/
SELECT *
FROM actor
WHERE last_name LIKE '%LI%'
ORDER BY last_name, first_name;


/*2.3.  Con IN, muestre las columnas country_id y country de los siguientes países:Afganistán, Bangladesh y China*/
SELECT country_id, country
FROM country
WHERE country IN("Afghanistan", "Bangladesh", "China");


/*2.4.  Enumere los apellidos de los actores y la cantidad de actores que tienen ese apellido, 
pero solo para los nombres que comparten al menos dos actores*/
SELECT last_name, COUNT(*)
FROM actor
GROUP BY last_name
HAVING COUNT(*)>=2;


/*2.5.  Muestre el importe total cobrado por cada trabador en agosto de 2005.*/
SELECT s.first_name, s.last_name, COUNT(*)
FROM payment p JOIN staff s USING(staff_id)
WHERE  MONTH(payment_date) = 8 AND YEAR(payment_date) = 2005
GROUP BY staff_id; 


/*2.6.  Liste todas las películas y el número de actores que aparecen en cada película*/
SELECT film_id, f.title,  COUNT(*)
FROM film f JOIN film_actor fa USING(film_id) JOIN actor a USING(actor_id)
GROUP BY film_id;


/*2.7.  Encontrar el cliente que ha generado más ingresos a la tienda*/
SELECT c.customer_id, c.first_name, c.last_name, SUM(p.amount)
FROM customer c JOIN store s USING(store_id) JOIN inventory i USING(store_id) JOIN rental r USING(inventory_id)
				JOIN payment p USING(rental_id)
GROUP BY c.customer_id
ORDER BY 4 DESC
LIMIT 1;


/*2.8.  Liste los cinco géneros principales en ingresos en orden descendente.*/
SELECT c.category_id, c.name, SUM(p.amount)
FROM category c JOIN film_category fc USING(category_id) JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id)
				JOIN payment p USING(rental_id)
GROUP BY c.category_id
ORDER BY 3 DESC
LIMIT 5;


/*2.9. Muestre el importe pagado para los clientes de Estados Unidos.*/
SELECT co.country, SUM(p.amount)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
				JOIN rental r USING(customer_id) JOIN payment p USING(rental_id)
WHERE co.country = "UNITED STATES";


/*2.10. Mostrar el top 3 de actores con más películas alquiladas en cada tienda.*/
SELECT
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id) JOIN inventory i USING(inventory_id)
			 JOIN rental r USING(inventory_id)

