<?php

$numero1 = 10;
$numero2 = 20;

$suma = $numero1 + $numero2;
echo "La suma de ".$numero1. " y " .$numero2. " = ".$suma;
echo "</br>";
echo "Calculamos cual de los dos numeros es mayor";
echo "</br>";

if ($numero1 > $numero2) {
    echo "El numero " .$numero1. " es mayor que " .$numero2;
}else if($numero1 < $numero2 ) {
    echo "El numero ".$numero2. " es mayor que ".$numero1;
}
echo "</br>";
$numero3 = 324.234;
$redondeo = round($numero3,2);
echo "redondeo: ".$redondeo;
// print_r($_GET)
?>