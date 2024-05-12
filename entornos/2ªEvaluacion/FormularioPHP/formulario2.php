<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Datos Personales</title>
</head>
<body>

<h1>Formulario:</h1>

<form action="recibido.php" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" required><br>

    <label for="contraseña">Contraseña:</label>
    <input type="password" name="contraseña" required><br>

    <label for="educacion">Educacion:</label>
    <select name="educacion" id="educacion">
        <option value="sin_estudios">Sin estudios</option>
        <option value="Educacion Obligatoria" selected="selected">Educacion Obligatoria</option>
        <option value="formacion_profesional">Formacion profesional</option>
        <option value="universidad">Universidad</option>
    </select><br>

    <label for="Nacionalidad">Nacionalidad:</label>
    <label for="hispana">Hispana</label>
    <input type="radio" name="nacionalidad" required>
    <label for="otra">Otra</label>
    <input type="radio" name="nacionalidad" required><br>

    <label for="Idiomas">Idiomas:</label>
    <input type="checkbox" name="checkbox">
    <label for="español">Español</label>
    <input type="checkbox" name="checkbox">
    <label for="ingles">Ingles</label>
    <input type="checkbox" name="checkbox">
    <label for="frances">Frances</label>
    <input type="checkbox" name="checkbox">
    <label for="aleman">Aleman</label><br>

    <label for="Email">Email:</label>
    <input type="" name="" required><br>

    <label for="sitio_web">Sitio Web:</label>
    <input type="text" name="" required><br>

    <button type="button">Enviar</button>

</form>
    
</body>
</html>