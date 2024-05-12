package Deportes;

public class testPartidos {
    
    public static void main(String[] args) {
		 	
		PFutbolSPA a=new PFutbolSPA();
		a.setEquipoLocal("Celta");
		a.setEquipoLocal("Valladolid");
		a.setGolesEquipoLocal(1);
		a.setGolesEquipoVisitante(0);
		System.out.println(a);
		
		PBaloncestSPA b=new PBaloncestSPA();
		b.setEquipoLocal("CeltaAlgo");
		b.setEquipoLocal("ValladolidOtro");
		b.setCestasEquipoLocal(99);
		b.setCestasEquipoVisitante(89);
		System.out.println(b);
		
	}


}
