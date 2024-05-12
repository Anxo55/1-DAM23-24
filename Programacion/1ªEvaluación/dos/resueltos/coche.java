package dos.resueltos;

// Añade a la clase coche los siguientes métodos:
// int getVelocidad(). Este método devuelve la velocidad actual.
// uoid acelera(int mas). Este método actualiza la velocidad a mas kilómetros más.
// void frenafint menos). Este método actualiza la velocidad a menos kilómetros menos

public class coche {

private int velocidad; 

//constructor por defecto.
coche () {
    velocidad=0;
}

coche(int velocidad) {
    if (velocidad <0 || velocidad >120) {
        this.velocidad=0;
    } else {
        this.velocidad=velocidad;
    }
}

//Generamos el getter y setter del atributo o porpiedad velocidad
public int getVelocidad() {
    return this.velocidad;
}

public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
}

//en este metodo incluimos el ifelse para dar las indicaciones que tendra q tener el testCoche cuando ejecutemos la clase con los parametros dados al objeto coche.
public void acelear(int mas) {
    if ((velocidad + mas) <= 120) {
        velocidad += mas;
    } else {
        System.out.println("No se puede acelear mas de 120 kilometros");
    }
}

//en este metodo incluimos el ifelse para dar las indicaciones que tendra q tener el testCoche cuando ejecutemos la clase con los parametros dados al objeto coche.
public void  frenar(int menos) {
    if ((velocidad - menos) >=0) {
        velocidad -= menos;
    } else {
        System.out.println("No se puede ir por debajo de 0 kilometros");
    }
}

//Creamos el metodo obtenerVelocidad que nos devolverá como bien indica la velocidad que se mostrará.
public int obtenerVelocidad() {
    return velocidad;
}


// Generamos el metodo toString para mostrar los valores que le pasaremos a nuestro coche que en este caso es la velocidad.
@Override
public String toString() {
    return "coche [velocidad=" + velocidad + "]";
}

}
