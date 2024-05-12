package Peaje;

public class Coche extends Vehiculo{
    //Atributo estático
   private static int valorPeaje = 10000;

   //Constructor completo
   public Coche(String matricula) {
       super(matricula);
       //Al ser un atributo estático, hay que llamarlo por la clase, no por this.
       this.valorPeaje = this.getValorPeaje();
   }

   //Get y set
   public int getValorPeaje() {
       return valorPeaje;
   }

   //No se puede estableces el valor de Peaje, es un valor único
   public static void setValorPeaje(int valorPeaje) {
       //Al ser un atributo estático, hay que llamarlo por la clase, no por this.
       Coche.valorPeaje = valorPeaje;
   }

   //@toString
   @Override
   public String toString() {
       return super.toString()+"Coche [valorPeaje=" + valorPeaje + "]";
   }
    
}
