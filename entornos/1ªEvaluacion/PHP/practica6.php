<?php

echo "Utilizar switch";
echo "</br>";

$numero1 = 6;
$numero2 = 2;
$opcion=4;
echo "[1] suma, [2] resta, [3] multiplicacion, [4] division";
echo "</br>";

switch ($opcion) {
    case '1':
        $suma = $numero1 + $numero2;
        echo "La suma es: ".$suma;
        break;

    case '2': 
        $resta = $numero1 - $numero2;
        echo "La resta es: ".$resta;
        break;

    case '3':
        $multiplicacion = $numero1 * $numero2;
        echo "La multiplicacion es: ".$multiplicacion;
        break;

    case '4':
        $division = $numero1 / $numero2;
        echo "La division es: ".$division;
        break;    

    default:
        echo "Opcion incorrecta";
        break;
}

?>