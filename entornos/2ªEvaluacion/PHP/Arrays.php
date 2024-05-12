<?php

$semana = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes', 'sabado', 'domingo'];

print_r($semana);

echo "</br>";

$alumnos = [];
$planetas=array();

$planetas[] = 'Mercurio';
$planetas[] = 'Venus';
$planetas[] = 'Tierra';

$planetas[1] = 'Jupiter';
// unset($planetas[1]);

print_r($planetas);
echo count($planetas);

foreach ($planetas as $luis) {
    echo $luis. "</br>";
}

echo $luis;

// unset se utiliza para borrar el elemento de la posicion que eliges.

?>