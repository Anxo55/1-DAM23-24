package dos.propuestos;

// Modifica la clase satélite y añádele los siguientes métodos:
// Método void variaAltura(double desplazamiento). Este método acepta un parámetro que será positivo o 
// negativo dependiendo de si el satélite tiene que alejarse o acercarse a La Tierra.
// Método boolean enOrbitaQ. Este método devolverá false si el satélite está en tierra y true en caso 
// contrario.
// Método void variaPosicion(double variap, double variam). Este método permite modificar los atributos de 
// posición (meridiano y paralelo) mediante los parámetros variap y variam. Estos parámetros serán valores 
// positivos o negativos relativos que harán al satélite modificar su posición.

public class satelite {

    public void variaAltura(double desplazamiento) {
        distancia_tierra = distancia_tierra + desplazamiento;
    }

    public boolean enOrbita() {
        if(distancia_tierra > 0) {
            return true;
        }else{
            return false;
        }
        
    }

    // public boolean enOrbita(double desplazamiento) {
    //     return distancia_tierra > 0;
    // }


    public void variaPosicion(double variaParalelo, double variMeridiano) {
        paralelo = paralelo + variaParalelo;
        meridiano += meridiano;

    }

//atributos o propiedades de la clase
private double meridiano; 
private double paralelo; 
private double distancia_tierra; 

//Constructores de la clase satelite
public satelite(double meridiano, double paralelo, double distancia_tierra) {
    this.meridiano = meridiano;
    this.paralelo = paralelo;
    this.distancia_tierra = distancia_tierra;
}

//Constructor de la clase satelite
public satelite() {

}


//getters y setters
public double getMeridiano() {
    return meridiano;
}

public void setMeridiano(double meridiano) {
    this.meridiano = meridiano;
}


public double getParalelo() {
    return paralelo;
}


public void setParalelo(double paralelo) {
    this.paralelo = paralelo;
}


public double getDistancia_tierra() {
    return distancia_tierra;
}


public void setDistancia_tierra(double distancia_tierra) {
    this.distancia_tierra = distancia_tierra;
}

//metodo que llama a OTROS 
public void setPosicion(double m,double p,double d){ 
// meridiano=m; 
// paralelo=p; 
// distancia_tierra=d;
setMeridiano(m);
setParalelo(p);
setDistancia_tierra(d);
}

@Override
public String toString() {
    return "satelite [meridiano=" + meridiano + ", paralelo=" + paralelo + ", distancia_tierra=" + distancia_tierra
            + "]";
}

    
}
