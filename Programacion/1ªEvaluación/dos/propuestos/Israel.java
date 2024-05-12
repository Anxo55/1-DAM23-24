package dos.propuestos;

import java.util.Scanner;

// 11. (Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide 
// diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el 
// almacén. El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender 
// el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos

public class Israel {

   double papas; //en kilos

	double chocos; //en kilos

	//constructor por defecto

	Israel(){
		papas=0;
		chocos=0;
	}

	Israel(double papas, double chocos){
		this.papas=papas;
		this.chocos=chocos;
	}

	@Override
	public String toString() {
		return "israel [papas=" + papas + ", chocos=" + chocos + "]";
	}

	//getters and setters

	

	public double getPapas() {
		return papas;
	}

	public void setPatatas() {
		this.papas= papas;
	}

	public double getChocos() {
		return chocos;
	}


	public void setChocos() {
		this.chocos= chocos;
	}

	//addPatatas

	public void addPatatas(double x) {
		papas+=x;
	}

	//addChocos
	public void addChocos(double y) {

		chocos+=y;

	}

	//en else decir cuantos comen y cuantas patatas

	public int numeroClientes() {
		int comensales=0;

		//su codigo 
		if (papas>2*chocos) {
			//sobran patatas o se acaban chocos
			comensales=(int)(3*(2*chocos));
			papas-=2*chocos;
			chocos-=chocos;
		}else {
			//sobran chocos y faltan patatas
			comensales=(int)(3*papas);
			chocos-=papas/2;
			papas-=papas;

		}	
		//fin de su codigo
		return comensales;

	}
}
