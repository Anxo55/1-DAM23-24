#Ejercicio 117
#Selecciona los 10 actores más populares en Argentina.

SELECT actor_id AS "ID", COUNT(*) AS "Alquileres", CONCAT(ac.first_name, ' ', ac.last_name) AS "Actor"
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id) 
				JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id) JOIN film_actor USING(film_id)
				JOIN actor ac USING(actor_id)
WHERE co.country = 'ARGENTINA'
GROUP BY actor_id
ORDER BY COUNT(*) DESC
LIMIT 10;

#Ejercicio 118
#Averigua cuál es la película más alquilada de entre las que trabaja Sandra Kilmer (Aunque hay dos 
#películas, con mostrar cualquiera de las dos sería suficiente).
SELECT f.film_id, COUNT(*), f.title
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id) JOIN inventory i USING(film_id)
			 JOIN rental r USING(inventory_id)
WHERE  a.first_name = 'Sandra' AND a.last_name = 'Kilmer'
GROUP BY f.film_id
ORDER BY 2 DESC;

/* SIN SABER QUE HAY DOS, SACAR LA MAS O LAS MAS ALQUILADAS*/
SELECT f.film_id, COUNT(*), f.title
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id) JOIN inventory i USING(film_id)
			 JOIN rental r USING(inventory_id)
WHERE  a.first_name = 'Sandra' AND a.last_name = 'Kilmer'
GROUP BY f.film_id
HAVING COUNT(*)= (SELECT COUNT(*)
				 FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id) JOIN inventory i USING(film_id)
				 JOIN rental r USING(inventory_id)
				 WHERE  a.first_name = 'Sandra' AND a.last_name = 'Kilmer'
				 GROUP BY f.film_id ORDER BY 1 DESC LIMIT 1)
ORDER BY 2 DESC;

#Ejercicio 119
#Averigua cuál es la duración media de las películas que están ahora mismo alquiladas.

SELECT ROUND (AVG(length),2) AS "Media"
FROM film f JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id)
WHERE r.return_date IS NULL;

#Ejercicio 120
#¿Cómo lo has hecho? ¿Te has planteado tener en cuenta que una misma película puede estar 
#alquilada varias veces? Podrías entonces re-calcular la media contando cada película una vez,
#sabiendo que en este caso no hay dos películas con la misma duración


#Ejercicio 121
#Calcula la tienda que más alquileres de películas del género infantil (Children) realizó entre agosto 
#y septiembre de 2005.
SELECT i.store_id, COUNT(*)
FROM category c JOIN film_category fc USING(category_id) JOIN film f USING(film_id) JOIN inventory i USING(film_id)
				JOIN rental r USING(inventory_id) 
WHERE c.name = "Children" AND YEAR(r.rental_date)=2005 AND MONTH(r.rental_date) BETWEEN 8 AND 9
GROUP BY i.store_id
ORDER BY 2 DESC
LIMIT 1;

#Ejercicio 122
#Visualiza los trabajadores que trabajan en la misma ciudad donde residen.
SELECT s.staff_id, CONCAT(s.first_name, ' ', s.last_name) AS "Nombre Completo",c.city, ci2.city
FROM staff s JOIN address a USING(address_id) JOIN city c USING(city_id) JOIN store st USING(store_id) JOIN address a2 ON st.address_id = a2.address_id
			 JOIN city ci2 ON a2.city_id = ci2.city_id
#WHERE s.address_id = a.address_id;
WHERE c.city_id = ci2.city_id;

#Ejercicio 123
#Averigua los 10 clientes que más dinero han gastado.
SELECT c.customer_id AS  "ID", CONCAT(c.first_name, ' ', c.last_name) AS "Nombre", SUM(p.amount) AS "Gastado"
FROM customer c JOIN payment p USING(customer_id)
GROUP BY c.customer_id
ORDER BY Gastado DESC
LIMIT 10;


SELECT CONCAT(CONCAT(SUBSTRING(first_name,1,1),LOWER(SUBSTRING(first_name,2)), ' ', CONCAT(SUBSTRING(last_name,1,1),LOWER(SUBSTRING(last_name,2))))) Cliente, SUM(amount) total
FROM payment JOIN customer USING(customer_id)
GROUP BY customer_id
ORDER BY SUM(amount) DESC
LIMIT 10;

#Ejercicio 124
#Calcula ahora las 10 películas que más dinero han generado a la empresa.
SELECT f.film_id, f.title AS "Titulo", SUM(p.amount) AS "Dinero Generado"
FROM film f JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id)
			JOIN payment p USING(rental_id)
GROUP BY f.film_id
ORDER BY 3 DESC
LIMIT 10;

#Ejercicio 125
#Averigua el nombre completo y dirección de correo electrónico de los clientes que han alquilado 
#películas de acción.

SELECT DISTINCT(customer_id), c.first_name, c.last_name, c.email
FROM customer c JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id)
				JOIN film_category fc USING(film_id) JOIN category ca USING(category_id)
WHERE ca.name = 'ACTION';

#Ejercicio 126
#Muestra el nombre de cada película, su categoría y el número total de películas de dicha categoría. 
#(Pista: Se pueden hacer JOINS con subconsultas)

SELECT f.title, c.name, (SELECT COUNT(*) FROM film_category WHERE category_id = c.category_id)
FROM film f JOIN film_category fc USING(film_id) JOIN category c USING(category_id);

#Ejercicio 127
#Calcula el importe medio de los pagos de cada usuario. (Sin subconsulta).

SELECT customer_id, first_name, last_name, ROUND(AVG(amount),2) 
FROM payment JOIN customer USING(customer_id)
GROUP BY customer_id;

#Ejercicio 128
#Encuentra los pagos que superan la media de cada usuario, así como el total de pagos que superan la 
#media.
SELECT p.customer_id "ID", CONCAT(c.first_name, ' ', c.last_name) AS "Nombre Completo", AVG(p.amount) AS "Media"
FROM payment p JOIN customer c USING(customer_id)
GROUP BY p.customer_id;


#Ejercicio 129
#Obtén los actores que han trabajado en todas las películas en las que ha trabajado Christopher West.
SELECT *
FROM actor a JOIN film_actor fa USING(actor_id) JOIN film f USING(film_id);


#Ejercicio 130
#Como Christopher pudo haber trabajado en más de una película con el mismo actor, esto causa 
#actores repetidos en el resultado. Eso lo podemos solucionar fácilmente usando la palabra clave 
#DISTINCT. Además, la siguiente consulta también excluye al mismo Christopher.


#Ejercicio 131
#Obtén el total de lo que ha gastado cada cliente en el alquiler de películas.

SELECT c.customer_id, CONCAT(c.first_name, ' ' , c.last_name) AS "Nombre Completo", SUM(p.amount) AS "Total gastado"
FROM customer c JOIN rental r USING(customer_id) JOIN payment p USING(rental_id)
GROUP BY c.customer_id;


#Ejercicio 132
#Obtén el total de lo que ha gastado cada cliente en el alquiler de películas, siempre que éste sea 
#mayor a 100.
SELECT c.customer_id, CONCAT(c.first_name, ' ', c.last_name) AS "Nombre Completo", SUM(p.amount) AS "Total gastado"
FROM customer c JOIN rental r USING(customer_id) JOIN payment p USING(rental_id)
WHERE SUM(p.amount)>100
ORDER BY 1 DESC;


#Ejercicio 133
#Lista los alquileres cuyo importe esté por encima de la media.


#Ejercicio 134
#Clientes con más películas alquiladas de los clientes que empiezan por ‘A’.




