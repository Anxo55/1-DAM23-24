package Seleccion2;

public class Entrenador extends SeleccionFutbol{

     //Atributos
     private String licencia;

     //Constructor herencia
     public Entrenador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
     }
 
     //Constructor completo
     public Entrenador(int id, String nombre, String apellidos, int edad, String licencia) {
        super(id, nombre, apellidos, edad);
        this.licencia = licencia;
     }

     //Getters y setters
     public String getIdFederacion() {
         return licencia;
     }
 
     public void setIdFederacion(String licencia) {
         this.licencia = licencia;
     }

     @Override
     public void entrenar(){
        System.out.println("Dirige un entrenamiento");
     }

     @Override
     public void jugarPartido(){
        System.out.println("Dirige un partido");
     }


     public void planificarEntrenamiento(){
        System.out.println("Planifica un entrenamiento");
     }
 
     @Override
     public String toString() {
         return super.toString()+"Entrenador [licencia=" + licencia + "]";
     }
}
