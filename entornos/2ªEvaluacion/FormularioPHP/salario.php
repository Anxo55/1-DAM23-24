<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recoger datos del formulario
    $nombre = $_POST["nombre"];
    $apellidos = $_POST["apellidos"];
    $salario = floatval($_POST["salario"]);
    $edad = intval($_POST["edad"]);

    // Validar que no falten datos
    if (empty($nombre) || empty($apellidos) || empty($salario) || empty($edad)) {
        header("Location: index.php?error=faltan_datos");
        exit;
    }

    // Calcular nuevo salario
    if ($salario > 2000) {
        $nuevoSalario = $salario;
    } elseif ($salario >= 1000 && $salario <= 2000) {
        if ($edad > 45) {
            $nuevoSalario = $salario * 1.03;
        } else {
            $nuevoSalario = $salario * 1.10;
        }
    } elseif ($salario < 1000) {
        if ($edad < 30) {
            $nuevoSalario = 1100;
        } elseif ($edad >= 30 && $edad <= 45) {
            $nuevoSalario = $salario * 1.03;
        } else {
            $nuevoSalario = $salario * 1.15;
        }
    }

    // Mostrar mensaje con el nuevo salario
    echo "<h2>Nuevo salario para $nombre $apellidos:</h2>";
    echo "<p>Salario anterior: $salario €</p>";
    echo "<p>Nuevo salario: $nuevoSalario €</p>";
} else {
    // Redirigir a index.php si no es una solicitud POST
    header("Location: index.php");
    exit;
}
?>