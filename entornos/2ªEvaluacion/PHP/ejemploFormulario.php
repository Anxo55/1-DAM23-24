<html>
    <body>
        <form method="POST">
            <?php
                echo '<pre>';
                print_r($_REQUEST);
                print_r($_GET);
                print_r($_POST);
                echo '</pre>';
            ?>
            <!--
            <input type="text" name="nombre" value="<?php echo $_POST['nombre']; ?>"  >
            <input type="text" name="nombre" value="<?php if(isset($_POST['nombre'])){echo $_POST['nombre'];} ?>"  >
            -->
            <input type="text" name="nombre" value="<?php echo isset($_POST['nombre'])?$_POST['nombre']:''; ?>"  >


            <input name="enviar" type="submit">
        </form>

        <?php 
            if(!empty($_POST['nombre'])){
                echo "BIENVENIDO ".$_POST['nombre'];
            }
            if(isset($_POST['enviar']) AND empty($_POST['nombre'])){
               echo "DEBE LLENAR EL CAMPO";  
            }
                
            

            
        ?>
    </body>
</html>