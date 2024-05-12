#Ejercicio 101
#¿Dónde vive 'JUDY GRAY'?
SELECT c.first_name, c.last_name
FROM customer c JOIN addres a USING(addres_id) JOIN city ci USING(city_id) JOIN country co USING(country_id);

#Ejercicio 102
#¿En cuántos países viven nuestros clientes? (países distintos)
SELECT COUNT(*)
FROM country;

#Ejercicio 103
#¿Cuántos clientes viven en Egipto?
SELECT COUNT(*)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
WHERE co.country='EGYPT';

#Ejercicio 104
#¿En qué ciudades de Egipto viven nuestros clientes?
SELECT DISTINCT(city)
FROM country JOIN city USING(country_id) JOIN address a USING(city_id) JOIN customer c USING(address_id)
WHERE country = 'EGYPT';

/*modificacion, mostrar el numero de ckientes por ciudad para las ciudades de Egipto*/
SELECT city_id, city, COUNT(*)
FROM country JOIN city USING(country_id) JOIN address a USING(city_id) JOIN customer c USING(address_id)
WHERE country = 'EGYPT'
GROUP BY city_id;

#Ejercicio 105
#¿Cuántos clientes viven fuera de Estados Unidos? (UNITED STATES)
SELECT COUNT(*)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
WHERE country <> 'UNITED STATES';

#Ejercicio 106
#¿Cuántas películas duran 90 o menos minutos?
SELECT *
FROM film
WHERE length<=90;

#Ejercicio 107
#¿Cuántas películas van de astronautas?
SELECT COUNT(*)
FROM film
WHERE description LIKE '%ASTRONAUT%';

#Ejercicio 108
#Lista todas las películas que duren como mucho 90 minutos y sean de astronautas.
SELECT COUNT(*)
FROM film
WHERE description LIKE '%ASTRONAUT%' and length<=90;

#Ejercicio 109
#Lista los títulos de todas las películas, ordenadas por duración, de forma descendente.
SELECT title
FROM film
ORDER BY length DESC;

#Ejercicio 110
#Visualiza los 10 actores que han participado en más películas.
SELECT actor_id, first_name, last_name, COUNT(*)
FROM actor JOIN film_actor USING(actor_id)
GROUP BY actor_id
ORDER BY 4 DESC
LIMIT 10;

#Ejercicio 111
#Visualiza los clientes de países que empiezan por S.
SELECT *
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
WHERE country LIKE 'S%';

#Ejercicio 112
#Visualiza el top-10 de países con más clientes.
SELECT country_id, country, COUNT(*) NumClientes
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id)
GROUP BY country_id
ORDER BY NumClientes DESC
LIMIT 10;

#Ejercicio 113
#Saca las 10 primeras películas alfabéticamente y el número de copias que se disponen de cada una
#de ellas.
SELECT f.film_id,f.title, COUNT(rental_id)
FROM film f JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id)
GROUP BY film_id
ORDER BY 2 ASC
LIMIT 10;

#Ejercicio 114
#Saca todas las películas que ha alquilado el cliente Deborah Walker.
SELECT DISTINCT first_name, last_name, f.title, COUNT(*)
FROM customer c JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id) JOIN film f USING(film_id)
WHERE c.first_name = 'DEBORAH' AND c.last_name = 'WALKER'
GROUP BY f.title;

#Ejercicio 115
#Visualiza los 10 mejores clientes.

#PRIMERA VERSION POR NUMERO DE ALQUILERES
SELECT c.customer_id, CONCAT(c.first_name,' ',c.last_name), COUNT(*) AS Alquileres
FROM customer c JOIN rental r USING(customer_id)
GROUP BY c.customer_id
ORDER BY 3 DESC
LIMIT 10;

#SEGUNDA VERSION
SELECT c.customer_id, CONCAT(c.first_name,' ',c.last_name), SUM(p.amount) AS Alquileres
FROM customer c JOIN rental r USING(customer_id) JOIN payment p USING(rental_id)
GROUP BY c.customer_id
ORDER BY 3 DESC
LIMIT 10;


#Ejercicio 116
#Averigua la popularidad de las categorías cinematográficas entre los clientes españoles.
SELECT  ca.category_id, ca.name, COUNT(*)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id) JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id) JOIN film_category USING(film_id) JOIN category ca USING(category_id)
WHERE co.country = 'SPAIN'
GROUP BY ca.category_id
ORDER BY 3 DESC;


#Ejercicio 117
#Selecciona los 10 actores más populares en Argentina.
SELECT CONCAT(ac.first_name, ' ' ,ac.last_name) AS "Nombre Completo", COUNT(*)
FROM customer c JOIN address a USING(address_id) JOIN city ci USING(city_id) JOIN country co USING(country_id) 
				JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id) JOIN film f USING(film_id)
                JOIN film_actor fi USING(film_id) JOIN actor ac USING(actor_id)
WHERE co.country = 'ARGENTINA'
GROUP BY actor_id
ORDER BY 2 DESC
LIMIT 10;


#Ejercicio 118
#Averigua cuál es la película más alquilada de entre las que trabaja Sandra Kilmer (Aunque hay dos 
#películas, con mostrar cualquiera de las dos sería suficiente).
SELECT CONCAT(a.first_name, ' ', a.last_name) AS "Nombre Completo", f.title,COUNT(*)
FROM actor a JOIN film_actor fi USING(actor_id) JOIN film f USING(film_id) JOIN inventory i USING(film_id) 
			 JOIN rental r USING(inventory_id)
WHERE a.first_name = 'SANDRA' AND a.last_name = 'KILMER'
GROUP BY f.film_id
ORDER BY 3 DESC
LIMIT 2;


#Ejercicio 119
#Averigua cuál es la duración media de las películas que están ahora mismo alquiladas.
SELECT AVG(F.length) AS "Media duración"
FROM rental R JOIN inventory I USING(inventory_id) JOIN film f USING(film_id)
WHERE return_date IS NULL
ORDER BY `I`
.`film_id` ASC;



#Ejercicio 120
#¿Cómo lo has hecho? ¿Te has planteado tener en cuenta que una misma película puede estar 
#alquilada varias veces? Podrías entonces re-calcular la media contando cada película una vez,
#sabiendo que en este caso no hay dos películas con la misma duración?


#Ejercicio 121
#Calcula la tienda que más alquileres de películas del género infantil (Children) realizó entre agosto 
#y septiembre de 2005.
SELECT s.store_id, COUNT(r.rental_id) AS rentals_count
FROM rental r
JOIN inventory i USING(inventory_id) JOIN film_category fc USING(film_id)
JOIN category c USING(category_id) JOIN store s USING(store_id)
JOIN film f USING(film_id)
WHERE c.name = 'Children' AND r.rental_date >= '2005-08-01' AND r.rental_date <= '2005-09-30'
GROUP BY s.store_id
ORDER BY rentals_count DESC
LIMIT 1;


#Ejercicio 122
#Visualiza los trabajadores que trabajan en la misma ciudad donde residen.
SELECT CONCAT(s.first_name, ' ', s.last_name) AS "Nombre Completo", ci.city AS "Ciudad de Residencia"
FROM staff s JOIN store st USING(store_id) JOIN address a ON s.address_id = a.address_id JOIN city ci USING(city_id)
WHERE st.city_id = a.city_id;

select st.first_name, st.last_name, st.address_id as dirEmpleado, s.address_id as dirTienda, city.city_id 
from staff st join store s using (store_id) join address a on s.address_id = a.address_id 
			  join city using (city_id) 
			where city_id in (select city.city_id 
from staff join store s using (store_id) join address a on s.address_id = a.address_id
           join city using (city_id) );



#Ejercicio 123
#Averigua los 10 clientes que más dinero han gastado.
SELECT p.customer_id ,CONCAT(first_name, ' ', last_name) AS "Nombre Completo", SUM(p.amount)
FROM customer c JOIN payment p USING(customer_id)
GROUP BY p.customer_id
ORDER BY 3 DESC
LIMIT 10;



#Ejercicio 124
#Calcula ahora las 10 películas que más dinero han generado a la empresa.
SELECT f.title, SUM(p.amount)
FROM film f JOIN inventory i USING(film_id) JOIN rental r USING(inventory_id) JOIN payment p USING(rental_id)
GROUP BY f.film_id
ORDER BY 2 DESC
LIMIT 10;


#Ejercicio 125
#Averigua el nombre completo y dirección de correo electrónico de los clientes que han alquilado 
#películas de acción.
SELECT CONCAT(c.first_name, ' ', c.last_name) AS "Nombre Completo", c.email, ca.name
FROM customer c JOIN rental r USING(customer_id) JOIN inventory i USING(inventory_id) JOIN film f USING(film_id)
				JOIN film_category fc USING(film_id) JOIN category ca USING(category_id)
WHERE ca.name = "Action";



#Ejercicio 126
#Muestra el nombre de cada película, su categoría y el número total de películas de dicha categoría. 
#(Pista: Se pueden hacer JOINS con subconsultas).
SELECT f.title, c.name, COUNT(*)
FROM film f JOIN film_category fc USING(film_id) JOIN category c USING(category_id)
GROUP BY c.name;

SELECT c.name AS category_name, f.title AS film_title, 
(SELECT COUNT(*) FROM film_category fc WHERE fc.category_id = c.category_id) AS total_movies_in_category
FROM category c
JOIN film_category fc ON c.category_id = fc.category_id
JOIN film f ON fc.film_id = f.film_id
ORDER BY c.name DESC;

#Ejercicio 127
#Calcula el importe medio de los pagos de cada usuario. (Sin subconsulta).
SELECT customer_id, AVG(amount) AS "Medio de los pagos"
FROM payment
GROUP BY customer_id;

#Ejercicio 128
#Encuentra los pagos que superan la media de cada usuario, así como el total de pagos que superan la 
#media.
SELECT p1.customer_id, p1.amount
FROM payment p1
JOIN (
    SELECT customer_id, AVG(amount) AS avg_amount
    FROM payment
    GROUP BY customer_id
) p2 ON p1.customer_id = p2.customer_id
WHERE p1.amount > p2.avg_amount;


#Ejercicio 129
#Obtén los actores que han trabajado en todas las películas en las que ha trabajado Christopher West.
SELECT a.actor_id, a.first_name, a.last_name
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
WHERE fa.film_id IN (
    SELECT film_id
    FROM film_actor
    WHERE actor_id = (
        SELECT actor_id
        FROM actor
        WHERE first_name = 'Christopher' AND last_name = 'West'
    )
)
GROUP BY a.actor_id, a.first_name, a.last_name
HAVING COUNT(DISTINCT fa.film_id) = (
    SELECT COUNT(DISTINCT film_id)
    FROM film_actor
    WHERE actor_id = (
        SELECT actor_id
        FROM actor
        WHERE first_name = 'Christopher' AND last_name = 'West'
    )
);



#Ejercicio 130
#Como Christopher pudo haber trabajado en más de una película con el mismo actor, esto causa 
#actores repetidos en el resultado. Eso lo podemos solucionar fácilmente usando la palabra clave 
#DISTINCT. Además, la siguiente consulta también excluye al mismo Christopher.

#Ejercicio 131
#Obtén el total de lo que ha gastado cada cliente en el alquiler de películas.

#Ejercicio 132
#Obtén el total de lo que ha gastado cada cliente en el alquiler de películas, siempre que éste sea 
#mayor a 100.

#Ejercicio 133
#Lista los alquileres cuyo importe esté por encima de la media.

#Ejercicio 134
#Clientes con más películas alquiladas de los clientes que empiezan por ‘A’.

#Ejercicio 135
#Clientes con más películas alquiladas que alguno de los clientes que empiezan por ‘A’


#Ejercicio 136
#Clientes con más películas alquiladas que todos los clientes que empiezan por ‘A’.
#Ejercicio 137
#Actores con más películas que el actor de id 1.

#Ejercicio 138
#Actores que trabajan en películas con rating ‘R’.

#Ejercicio 139
#Actores que no han trabajado en películas con rating ‘R’.

#Ejercicio 140
#Actores que no hayan trabajado en películas de rating ‘R’ con exists.

#Ejercicio 141
#Clientes que no han alquilado películas de rating ‘R’.

#Ejercicio 142
#¿Qué actores no han trabajo en la categoría 'Música'?

#Ejercicio 143
#Actores que no están en la anterior consulta