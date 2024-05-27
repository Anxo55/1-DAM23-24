#1 Crea una función que devuelva la suma de dos números.
SELECT suma(3,5) AS suma;

-- CREATE DEFINER=`root`@`localhost` FUNCTION `suma`(a INT, b INT) RETURNS int
    -- DETERMINISTIC
-- BEGIN
	-- DECLARE resultado INT;
    -- SET resultado = a+b;
-- RETURN resultado;
-- END

#2 Escribe un procedimiento almacenado que multiplique dos números y los muestre como resultado.
CALL multiplicacion(3,5);

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `multiplicacion`(a INT, b INT)
-- BEGIN
	-- DECLARE resultado INT;
    -- SET resultado = a*b;
    -- SELECT resultado AS "Total";
-- END

#3 Implementa un bucle que muestre los números del 1 al 10.
CALL mostrar_numeros();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrar_numeros`()
-- BEGIN
	-- DECLARE contador INT DEFAULT 1;
    
-- WHILE contador <=10 DO
    -- SELECT contador AS "Numero";
    -- SET contador = contador + 1;
    
-- END WHILE;
-- END


#4 Crea una función que calcule el factorial de un número dado.
SELECT factorial_de_un_numero(5) AS "Resultado";

-- CREATE DEFINER=`root`@`localhost` FUNCTION `factorial_de_un_numero`(numero INT) RETURNS int
    -- DETERMINISTIC
-- BEGIN

	-- DECLARE resultado INT DEFAULT 1;
    -- DECLARE contador INT DEFAULT 1;
    
    -- WHILE contador <= numero DO
        -- SET resultado = resultado * contador;
        -- SET contador = contador + 1;
    -- END WHILE;
    
    -- RETURN resultado;

-- RETURN 1;
-- END

#5 Diseña un procedimiento almacenado que genere una tabla con los primeros 10 números pares.
CALL primeros_numeros_pares();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `primeros_numeros_pares`()
-- BEGIN

-- DECLARE i INT;
-- DECLARE numeroPar INT;

-- DROP TABLE IF EXISTS NumerosPares;
-- CREATE TEMPORARY TABLE NumerosPares(numero INT);
-- SET i=1;
-- WHILE i <=10 DO
	-- SET numeroPar = i*2;
    -- INSERT INTO NumerosPares (numero) VALUES (numeroPar);
    -- SET i = i+1;
-- END WHILE;

    -- SELECT * FROM NumerosPares;
    
-- END

#6 Utiliza un bucle para mostrar los números impares del 1 al 20.

WITH RECURSIVE OddNumbers AS (
  SELECT 1 AS Number
  UNION
  SELECT Number + 2 AS Number
  FROM OddNumbers
  WHERE Number < 19
)

SELECT Number
FROM OddNumbers;

#7 Implementa una función que devuelva el cuadrado de un número.
SELECT cuadrado_de_un_numero(5);

-- CREATE DEFINER=`root`@`localhost` FUNCTION `cuadrado_de_un_numero`(numero FLOAT) RETURNS float
    -- DETERMINISTIC
-- BEGIN
-- DECLARE cuadrado FLOAT;
-- SET cuadrado = numero * numero;
-- RETURN cuadrado;
-- END

#8 Escribe un procedimiento almacenado que calcule el promedio de una lista de números.Crea un bucle que muestre la tabla de multiplicar de un número específico.


#9 Diseña una función que determine si un número dado es primo.
SELECT esPrimo(17) AS EsPrimo; -- Retorna 1 (true) porque 17 es primo
SELECT esPrimo(18) AS EsPrimo; -- Retorna 0 (false) porque 18 no es primo

-- CREATE DEFINER=`root`@`localhost` FUNCTION `esPrimo`(numero INT) RETURNS tinyint(1)
    -- DETERMINISTIC
-- BEGIN
    -- DECLARE esPrimo BOOLEAN;
    -- DECLARE i INT;

    -- IF numero < 2 THEN
        -- SET esPrimo = FALSE;
    -- ELSE
        -- SET esPrimo = TRUE;
        -- SET i = 2;

        -- WHILE i * i <= numero DO
            -- IF numero % i = 0 THEN
                -- SET esPrimo = FALSE;
                -- SET i = numero; 
            -- END IF;
            -- SET i = i + 1;
        -- END WHILE;
    -- END IF;

    -- RETURN esPrimo;
-- END


#10 Implementa un procedimiento almacenado que calcule la suma de los números pares del 1 al 100.
CALL sumaNumerosPares();

-- CREATE DEFINER=`root`@`localhost` PROCEDURE `sumaNumerosPares`()
-- BEGIN
-- DECLARE suma INT DEFAULT 0;
-- DECLARE i INT DEFAULT 1;

-- WHILE i <= 100 DO
        -- IF i % 2 = 0 THEN
            -- SET suma = suma + i;
        -- END IF;
        -- SET i = i + 1;
    -- END WHILE;

    -- SELECT suma AS SumaDePares;

-- END
