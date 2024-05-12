<?php
// Generar un número aleatorio entre 1 y 100
$numeroAleatorio = rand(1, 100);

// Inicializar variables
$intentos = 0;
$adivinado = false;

// Comienza el juego
echo "¡Bienvenido al juego de adivinanza!\n";

do {
    // Solicitar al usuario que ingrese un número
    $guess = readline("Adivina el número (entre 1 y 100): ");

    // Validar la entrada del usuario
    if (!is_numeric($guess) || $guess < 1 || $guess > 100) {
        echo "Por favor, ingresa un número válido entre 1 y 100.\n";
        continue;
    }

    // Incrementar el contador de intentos
    $intentos++;

    // Verificar si el número ingresado es igual al número aleatorio
    if ($guess == $numeroAleatorio) {
        $adivinado = true;
    } elseif ($guess < $numeroAleatorio) {
        echo "Intenta con un número más grande.\n";
    } else {
        echo "Intenta con un número más pequeño.\n";
    }

} while (!$adivinado);

// Mostrar mensaje de éxito al adivinar el número
echo "¡Felicidades! Adivinaste el número $numeroAleatorio en $intentos intentos.\n";
?>