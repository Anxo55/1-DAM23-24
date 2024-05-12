SELECT ProductName
FROM products;

SELECT UPPER(ProductName), LOWER(ProductName), LENGTH(ProductName), CONCAT(ProductName," ",categoryID),
SUBSTRING(ProductName,1,4)
FROM products;
#con el concat podemos unir cadenas
#el substring coge un rango de caracteres que tu le pides