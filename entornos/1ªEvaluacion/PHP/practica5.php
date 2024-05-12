<?php
// .Escribir un programa que imprima "Hola, mundo!" en la pantalla.
// .Escribir un programa que declare una variable entera y la inicialice con un valor. Luego, imprimir el valor de la variable en la pantalla.
// .Escribir un programa que declare una variable de cadena y la inicialice con un valor. Luego, imprimir el valor de la variable en la pantalla.
// .Escribir un programa que declare una variable booleana y la inicialice con un valor. Luego, imprimir el valor de la variable en la pantalla.
// .Escribir un programa que declare una variable de punto flotante y la inicialice con un valor. Luego, imprimir el valor de la variable en la pantalla.
// .Escribir un programa que declare dos variables enteras y las inicialice con valores diferentes. Luego, imprimir el valor de la variable más grande en la pantalla.
// .Escribir un programa que declare una variable entera y la inicialice con un valor. Luego, imprimir "Es par" si el valor de la variable es par, y "Es impar" si el valor de la variable es impar.
// .Escribir un programa que declare una variable de cadena y la inicialice con un valor. Luego, imprimir "La cadena es corta" si la longitud de la cadena es menor que 10, y "La cadena es larga" si la longitud de la cadena es mayor o igual a 10.
// .Escribir un programa que declare una variable entera y la inicialice con un valor. Luego, imprimir "Es positivo" si el valor de la variable es positivo, "Es negativo" si el valor de la variable es negativo, y "Es cero" si el valor de la variable es cero.
// .Escribir un programa que declare dos variables enteras y las inicialice con valores diferentes. Luego, imprimir "Son iguales" si los valores de las variables son iguales, y "Son diferentes" si los valores de las variables son diferentes.

echo "Hola mundo";
echo "</br>";
$numero = 8;
echo $numero;
echo "</br>";
$nombre = "Pepe";
echo $nombre;
echo "</br>";
$numero1 = 5;
$numero2 = 6;

if($numero1 > $numero2) {
    echo "El numero ".$numero1." es el mayor";
}else{
    echo "El numero ".$numero2." es el mayor";
}
echo "</br>";

$numero3 = 6;

if($numero3 % 2 == 0) {
    echo "El numero ".$numero3." es par";
}else{
    echo "El numero ".$numero3." no es par";
}
echo "</br>";

$cadenaTexto ="Programacion";
if(strlen($cadenaTexto) >=10){
    echo "Es una cadena mayor de 10";
}else{
    echo "Es una cadena menor de 10";
}

echo "</br>";
$numero4 = 2;

if($numero4 > 0) {
    echo "El numero es positivo";
}else{
    echo "El numero es negativo";
}

echo "</br>";

$numero5 = 5;
$numero6 = 4;


if ($numero5 == $numero4) {
    echo "Los numeros son iguales";
}else{
    echo "Los numeros no son iguales";
}


?>