SELECT * FROM producto;

SELECT * FROM fabricante;

SELECT p.id, p.nombre, f.nombre
FROM producto p JOIN fabricante f;

SELECT p.id, p.nombre, f.nombre
FROM producto p JOIN fabricante f ON p.id_fabricante=f.id;