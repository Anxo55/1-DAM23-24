-- 1. Listar Películas por Categoría
-- Crear un cursor que liste todas las películas de una categoría específica.
CALL ListarPeliculasPorCategoria('Acción');

-- 2. Actualizar Stock de Inventario
-- Crear un cursor que recorra todos los inventarios y actualice el stock basado en ciertas condiciones.


-- 3. Calcular Ingresos por Tienda
-- Crear un cursor que calcule los ingresos totales generados por cada tienda.
CALL CalcularIngresosPorTienda();

-- 4. Clientes con Más de 10 Alquileres
-- Crear un cursor que liste los clientes que han realizado más de 10 alquileres.
CALL ListarClientesFrecuentes();

-- 5. Películas no Alquiladas
-- Crear un cursor que identifique las películas que no han sido alquiladas en los últimos 6 meses.


-- 6. Empleados con Ventas Mayores a $1000
-- Crear un cursor que liste a los empleados que han generado ventas superiores a $1000.
CALL ListarEmpleadosVentasSuperiores1000();

-- 7. Promedio de Duración de Películas por Categoría
-- Crear un cursor que calcule el promedio de duración de las películas en cada categoría.
CALL PromedioDuracionPorCategoria();

-- 8. Actualizar Precio de Películas Antiguas
-- Crear un cursor que actualice el precio de las películas lanzadas hace más de 5 años.
CALL update_old_movie_prices();

-- 9. Listar Películas por Actor
-- Crear un cursor que liste todas las películas en las que ha participado un actor específico.
CALL ListarPeliculasPorActor('NOMBRE_DEL_ACTOR', 'APELLIDO_DEL_ACTOR');

-- 10. Clientes con Mayor Gasto
-- Crear un cursor que identifique a los clientes que han gastado más de $500 en alquileres.
CALL ClientesConMayorGasto();

-- 11. Detalles de Alquileres por Mes
-- Crear un cursor que liste los detalles de los alquileres realizados cada mes.
CALL DetallesAlquileresPorMes();


-- 12. Inventario Bajo
-- Crear un cursor que identifique las películas con menos de 5 copias disponibles en inventario.
CALL PeliculasConInventarioBajo();

-- 13. Películas Más Alquiladas
-- Crear un cursor que liste las 10 películas más alquiladas en el último año.
CALL PeliculasMasAlquiladasUltimoAno();

-- 14. Clientes Sin Alquileres Recientes
-- Crear un cursor que identifique a los clientes que no han realizado ningún alquiler en el último año.
CALL ClientesSinAlquileresRecientes();

-- 15. Actualizar Estado de Devoluciones Tardías
-- Crear un cursor que actualice el estado de las devoluciones tardías y aplique multas
-- correspondientes.