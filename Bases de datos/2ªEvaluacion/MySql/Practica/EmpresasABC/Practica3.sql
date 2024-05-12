#numero productos que tiene cada fabricante
SELECT idFabricante, COUNT(*)
FROM productos
GROUP BY idFabricante;

SELECT idFabricante, COUNT(*)
FROM productos
GROUP BY idFabricante
HAVING COUNT(*)>5;