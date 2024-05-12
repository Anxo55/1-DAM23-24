<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina Principal</title>
</head>
<body>

<header>
    <h1>PAGO DE EMPLEADO</h1>
</header>

<section>
    <table align="center">

        <form action="paginaWeb.php" method="post">

            <tr>
                <td>Empleado</td>
                <td><input type="text" name="txtEmpleado"></td>
            </tr>

            <tr>
                <td>Horas trabajadas</td>
                <td><input type="text" name="txtHoras"></td>
            </tr>
            <tr>
                <td>Tarifa por horas</td>
                <td><input type="text" name="txtTarifa"></td>
            </tr>

            <tr>
                <td><input type="submit" value="Procesar"></td>
                <td type="reset" value="Limpiar"></td>
            </tr>

            <!-- codigo php -->
            <?php
            error_reporting[0];
            $empleado =$_POST['txtEmpleado'];
            $horas = $_POST['txtHoras'];
            $tarifa = $_POST['txtTarifa'];

            // Realizar los calculos
            $salarioBruto = $horas * $tarifa;
            $descuentoSeguroSalud =  $salarioBruto * 0.12;
            $descuentoAfp = $salarioBruto * 0.10;
            $salarioNeto = $salarioBruto - $descuentoSeguroSalud - $descuentoAfp;

            
            ?>

            <tr>
                <td>Empleado</td>
                <td><?php echo $empleado; ?></td>
            </tr>

        </form>

    </table>
</section>
    
</body>
</html>