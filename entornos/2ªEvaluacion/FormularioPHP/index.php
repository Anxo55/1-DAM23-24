<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Datos</title>
</head>
<body>
    <h1>Formulario de Datos</h1>
    
    <form action="salario.php" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required><br>

        <label for="apellidos">Apellidos:</label>
        <input type="text" name="apellidos" required><br>

        <label for="salario">Salario:</label>
        <input type="number" step="0.01" name="salario" required><br>

        <label for="edad">Edad:</label>
        <input type="number" name="edad" required><br>

        <input type="submit" value="Calcular Salario">
    </form>

    <?php
        if(isset($_GET['error']) && $_GET['error'] == 'faltan_datos') {
            echo '<p style="color: red;">FALTAN DATOS</p>';
        }
    ?>
</body>
</html>