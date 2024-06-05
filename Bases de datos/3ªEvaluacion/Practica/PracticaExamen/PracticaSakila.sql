#1 Crea un procedimiento almacenado que muestre el nombre y apellido de
# todos los clientes que hayan alquilado la película "ACADEMY DINOSAUR".
CALL get_customers_who_rented_academy_dinosaur();

#2 Crea una función almacenada que calcule y devuelva el número de actores
# que hay en las base de datos Sakila. 
SELECT count_actors() AS number_of_actors;


#3 Crea un procedimiento almacenado que muestre el nombre y apellido de
# todos los clientes que hayan alquilado más de 5 películas.
CALL get_customers_with_more_than_five_rentals();

#4 Crea un cursor que recorra todas las peliculas de la base de datos Sakila
# y muestre el título y actualice la duracion de todas sumandole 1 minuto
#  a cada una de ellas.
CALL update_movie_duration();
CALL ActualizarDuracionPeliculas();

#5 Crea un procedimiento almacenado que muestre el nombre y apellido de
# todos los clientes que hayan alquilado una película en el año 2006.
CALL get_customers_who_rented_in_2006();

#6 Crea un cursor que recorra que recorra todas las tiendas de la base 
# de datos  Sakila y muestre el nombre y la direccion de cada una.
CALL display_store_details();

#7 Crea un procedimiento almacenado que muestra el nombre y apellido
# de todos los clientes que hayan alquilado una película en el mes
# de diciembre.
CALL get_customers_who_rented_in_december();

#8 Crea una funcion almacenada que calcule el numero de clientes que
# vivan en una ciudad que se pasará como parámetro de la función.
SELECT count_customers_in_city('Baku');


#9 Crea una funcion almacenada que calcule el numero de peliculas para
# un codigo de actor pasado como parámetro.
SELECT count_movies_for_actor(1);

#10 Crear una funcion que le pasemos el id de una pelicula y nos devuelva
# lo siguiente: 
#    -'Para adultos' Si el rating es 'R'
#	 -'Para todas las edades' Si no lo es.
SELECT get_movie_rating_description(1);

