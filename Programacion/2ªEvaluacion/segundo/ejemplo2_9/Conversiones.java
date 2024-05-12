package segundo.ejemplo2_9;

import java.util.Scanner;

public class Conversiones {

	final static double Factor_m_cm=100.0;
	final static double Factor_m_mm=1000.0;
	final static double Factor_m_pul=39.37;
	final static double Factor_m_pies=3.28;
	final static double Factor_m_yar=1.09361;

	public static double m_to_cm(double m) {
		return (Factor_m_cm)*m;
	}

	public static double m_to_mm(double m) {
		return (Factor_m_mm)*m;
	}

	public static double m_to_pul(double m) {
		return (Factor_m_pul)*m;
	}

	public static double m_to_pies(double m) {
		return (Factor_m_pies)*m;
	}

	public static double m_to_yar(double m) {
		return (Factor_m_yar)*m;
	}

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

	// TODO Auto-generated method stub

	public static void main(String[] args) {
		double metros=scanydouble("Dame una distancia en metros:");
		System.out.println("En cm:"+m_to_cm(metros));
		System.out.println("En mm:"+m_to_mm(metros));
		System.out.println("En pulgadas:"+m_to_pul(metros));
		System.out.println("En pies:"+m_to_pies(metros));
		System.out.println("En yardas:"+m_to_yar(metros));


	}

}
