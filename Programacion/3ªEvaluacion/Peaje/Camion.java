package Peaje;

public class Camion extends Vehiculo{
    //Atributo
  private static int valorPeaje=5000;
  private int numeroEjes;

  //Constructor completo
  public Camion(String matricula, int numEjes) {
      super(matricula);
      this.valorPeaje = this.valorPeaje;
      this.numeroEjes = numEjes;
  }

  //Get y set
  public static int getValorPeaje() {
      return valorPeaje;
  }

  public static void setValorPeaje(int valorPeaje) {
      Camion.valorPeaje = valorPeaje;
  }

  public int getNumeroEjes() {
      return numeroEjes;
  }

  public void setNumeroEjes(int numeroEjes) {
      this.numeroEjes = numeroEjes;
  }

  //@toString
  @Override
  public String toString() {
      return super.toString()+"Camion [valorPeaje=" + valorPeaje + " numeroEjes="+numeroEjes+"]";
  }



  
}
