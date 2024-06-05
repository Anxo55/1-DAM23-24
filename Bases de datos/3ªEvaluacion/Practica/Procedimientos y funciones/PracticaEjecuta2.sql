-- 1 Crea una función que devuelva la suma de dos números.
SELECT suma(3,5) AS suma;

-- 2 Escribe un procedimiento almacenado que multiplique dos números y los muestre como resultado.
CALL multiplicacion(3,5);

-- 3 Implementa un bucle que muestre los números del 1 al 10.
CALL mostrar_numeros();

-- 4 Crea una función que calcule el factorial de un número dado.
SELECT factorial_de_un_numero(5) AS "Resultado";

-- 5 Diseña un procedimiento almacenado que genere una tabla con los primeros 10 números pares.
CALL primeros_numeros_pares();

-- 6 Utiliza un bucle para mostrar los números impares del 1 al 20.
WITH RECURSIVE OddNumbers AS (
  SELECT 1 AS Number
  UNION
  SELECT Number + 2 AS Number
  FROM OddNumbers
  WHERE Number < 19
)

SELECT Number
FROM OddNumbers;

-- 7 Implementa una función que devuelva el cuadrado de un número.
SELECT cuadrado_de_un_numero(5);

-- 8 Escribe un procedimiento almacenado que calcule el promedio de una lista de números.Crea un bucle que muestre la tabla de multiplicar de un número específico.


-- 9 Diseña una función que determine si un número dado es primo.
SELECT esPrimo(17) AS EsPrimo; -- Retorna 1 (true) porque 17 es primo
SELECT esPrimo(18) AS EsPrimo; -- Retorna 0 (false) porque 18 no es primo

-- 10 Implementa un procedimiento almacenado que calcule la suma de los números pares del 1 al 100.
CALL sumaNumerosPares();
