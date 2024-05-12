package Peaje;

public class Moto extends Vehiculo{
	 
    //Atributo estático
    private static int valorPeaje=5000;

    //Constructor completo
    public Moto(String matricula) {
        super(matricula);
        this.valorPeaje = this.getValorPeaje();
    }

    //Get y set
    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    //@toString
    @Override
    public String toString() {
        return super.toString()+"Moto [valorPeaje=" + valorPeaje + "]";
    }

    
}
