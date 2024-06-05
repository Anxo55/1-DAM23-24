-- 1. Crea un procedimiento que visualice todas las películas cuyo costo de reemplazo sea
-- superior a un valor que se pasará como parámetro de entrada. ¿Cuántas películas
-- tienen un costo de reemplazo superior a 20€?
CALL Visualizar_peliculas_por_costo(20);

-- 2. Crea un procedimiento que visualice todas las películas cuyo costo de reemplazo
-- esté comprendido entre dos cantidades que se pasarán como parámetros de entrada.
-- ¿Cuántas películas tienen un costo de reemplazo superior a 20€ y 21,99 €?
CALL VisualizarPeliculasPorRangoCosto(20, 21.99);

-- 3. Crear un procedimiento almacenado que devuelva todos los actores cuyo apellido
-- comience con una letra específica
CALL ActoresPorLetra('F');

-- 4. Crear una función que calcule la duración total de una película en minutos dado el ID
-- de la película.
SELECT duracion_peli(5) AS duracion;

-- 5. Crear un procedimiento almacenado que devuelva el número total de películas
-- alquiladas por un cliente específico.
CALL PeliculasAlquiladasPorCliente(1, @total);
SELECT @total;

-- 6. Crear una función que devuelva la cantidad total de películas en una categoría
-- específica:
SELECT cantidad_peliculas_categoria('Action');

-- 7. Crea un procedimiento almacenado que liste todos los clientes que hayan alquilado
-- una película en un mes específico.
CALL ClientesQueAlquilaronEnMes(1, 2006);

-- 8. Diseña una función que devuelva el nombre completo de un actor dado su ID.
SELECT nombre_completo_actor(1);

-- 9. Crea una función que calcule el total de ingresos generados por alquileres de películas
-- en una sucursal específica.
SELECT ingresos_por_sucursal(1);

-- 10. Escribe una función que devuelva el número de actores que han aparecido en una
-- película dada su ID.
SELECT numero_actores_por_pelicula(1);

-- 11. Crea un procedimiento almacenado que liste todas las películas que aún no han sido
-- alquiladas.
CALL PeliculasNoAlquiladas();

-- 12. Diseña una función que devuelva la cantidad total de películas alquiladas por un
-- cliente dado su ID.
SELECT cantidad_peliculas_alquiladas_por_cliente(1);

-- 13. Diseña un procedimiento almacenado que actualice la clasificación de una película
-- dada su ID.
CALL ActualizarClasificacionPelicula(1, 'PG-13');

-- 14. Escribe una función que devuelva la cantidad de películas alquiladas en un mes
-- específico.
SELECT cantidad_peliculas_alquiladas_en_mes(2005, 5);

-- 15. Diseña una función que calcule la duración promedio de todas las películas en una
-- categoría específica.
SELECT duracion_promedio_por_categoria('Action');
