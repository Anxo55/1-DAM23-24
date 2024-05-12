package dos.propuestos;

// 8. Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos constructores inicializarán 
// los atributos marca y modelo de la clase. Crea dos objetos (cada objeto llama a un constructor distinto) y verifica 
// que todo funciona correctamente.

public class Coche {
    private int velocidad; 
    private String marca;
    private String modelo;

//constructor por defecto.
Coche () {
    velocidad=0;
    marca = "";
    modelo = "";
}

Coche(int velocidad, String marca, String modelo) {
    if (velocidad <0 || velocidad >120) {
        this.velocidad=0;
    } else {
        this.velocidad=velocidad;
    }
    this.marca = marca;
    this.modelo = modelo;
}

//Generamos el getter y setter del atributo o porpiedad velocidad
public int getVelocidad() {
    return this.velocidad;
}

public void setVelocidad(int velocidad) {

    if (velocidad <0 || velocidad >120) {
        this.velocidad=0;
    } else {
        this.velocidad=velocidad;
    }
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
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
    return "Coche [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
}

}
