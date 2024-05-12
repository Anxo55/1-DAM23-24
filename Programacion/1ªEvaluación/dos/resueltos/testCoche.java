package dos.resueltos;

public class testCoche {

    //metodo para hacer que si pasa de 120 no puede acelerar y si va a pasar de 0 para abajo decirle que no puede bajar.

public static void main(String[] args) {
    
    coche cochecito= new coche();

    //Despues de crear el coche los mostramos por pantalla teniendo 0 kilometros ya que no le pasamos ninguna velocidad
    System.out.println(cochecito);

    //Aqui le pasamos 220 kilometros al coche, por lo que nos tendria que mostrar por pantalla el mensaje de no pasarse de 120 kilometros.
    cochecito.acelear(120);
    System.out.println(cochecito.toString());

    //En este ultimo nos saltaria el mismo mensaje que en el anterior ya que no bajo de 120 kilometros
    cochecito.frenar(60);
    System.out.println(cochecito.toString());

    //Aqui ya estariamos por debajo de 120 kilometros, con lo cual no nos mostraria ningun mensaje de los anteriormente comentados.
    cochecito.frenar(40);
    System.out.println(cochecito.toString());

    //Aqui al estar a 0 kilometros nos mandaría el mensaje  por pantalla de que estamos por debajo de 0 kilometros.
    cochecito.frenar(50);
    System.out.println(cochecito.toString());


    //Coche creado con el nuevo constructor con el entero de velocidad
    coche cochazo = new coche(120);

    System.out.println(cochazo.toString());

}
    
}
