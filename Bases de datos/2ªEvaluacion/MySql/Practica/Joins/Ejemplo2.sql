SELECT * FROM producto;
SELECT * FROM fabricante;

SELECT id_fabricante, fabricante.nombre, COUNT(*) FROM producto JOIN fabricante ON producto.id_fabricante = fabricante.id
GROUP BY id_fabricante
