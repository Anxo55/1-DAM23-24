package herenciaInmuebles;

import java.util.ArrayList;

import herenciaInmuebles.local.tipo;
public class testInmuebles {
	
	

	public static int generaArea() {
		return (int) (30 + Math.random()*121);
	}
		
		
		public static void main(String[] args) {
			
		
		ArrayList<Inmuebles> col= new ArrayList();
		
		casaRural casa1= new casaRural(1, generaArea(), "Avenida Madrid", 5, 2, 2, 10, 8);
		col.add(casa1);
		apartamentoFamiliar casa2= new apartamentoFamiliar(2, generaArea(), "rua santiago",6 , 4, 3);
		col.add(casa2);
		Oficina oficina =new Oficina(3, generaArea(), "Avenidad Hispanidad", tipo.INTERNO,false);
		col.add(oficina);
		LocalComercial localComercial = new LocalComercial(4, generaArea(),"Avenida Venezuela", tipo.CALLE, "Camelias"); 
		col.add(localComercial);
		/*
		 * col.add(new Inmuebles ("Oficina")); col.add(new Inmuebles
		 * ("Local Comercial")); col.add(new Inmuebles ("Apartamento Familiar"));
		 * col.add(new Inmuebles ("Casa Rural")); col.add(new Inmuebles
		 * ("Casa en Conjunto Cerrado"));
		 */
		
		 
	
		double precio=0d;
		
		for (Inmuebles c: col) {
			System.out.println(c.toString());
			double p = c.calcularPrecioVenta();
			System.out.println("precio: " + p);
			precio+=p;
		}
			
			System.out.println("precio todos: " + precio);
			System.out.println("iva 21%: " +0.21*precio);
			System.out.println("total: "+1.21* precio);
	}
}

