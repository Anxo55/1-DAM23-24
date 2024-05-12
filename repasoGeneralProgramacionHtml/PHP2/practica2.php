<?php


$edad = 25;
$nombre = "Pepe";

echo "Como se llama el profesor de Progrmacion: ";
echo "</br>";
echo "El profesor de programacion se llama ".$nombre;
echo "</br>";

if ($edad > 20) {
    echo $nombre. " tiene mas de 20 años";
}else if($edad <18){
    echo $nombre. " es menor de edad";
}

?>