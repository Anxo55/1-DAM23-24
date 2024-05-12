package dos.resueltos;

public class satelite {

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

// public void printPosicion(){

// System.out.println("El satélite se encuentra en el paralelo "+ paralelo+" Meridiano "+meridiano+" a una  distancia de la tierra de "+distancia_tierra+ "Kilómetros");

// }



}

