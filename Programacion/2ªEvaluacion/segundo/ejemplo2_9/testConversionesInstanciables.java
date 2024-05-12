package segundo.ejemplo2_9;

import java.util.Scanner;

public class testConversionesInstanciables {
    
    public static double scanydouble(String texto) {
		boolean error;
		double res = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res = sc.nextDouble();
				error = false;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, dame un double.");
				error = true;
			}

		} while (error);

		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorInstanciable con=new ConversorInstanciable(20);
		System.out.println(con.toString());
		
		double m=scanydouble("Dame una distancia en m:");
		con.setMetros(m);
		System.out.println(con.toString());

	}

}
