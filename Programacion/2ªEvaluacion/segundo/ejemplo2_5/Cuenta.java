package segundo.ejemplo2_5;

public class Cuenta {

    String nombre;

	String apellidos;

	int numero;

	enum tipo {
		AHORROS, CORRIENTE
	}

	tipo tipoCuenta;
	float saldo = 0;

	Cuenta(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
		/*
		 * Tener en cuenta que no se pasa como parámetro el saldo ya que inicialmente es
		 * cero.
		 */
		this.nombre = nombresTitular;
		this.apellidos = apellidosTitular;
		this.numero = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", apellidos=" + apellidos + ", numero=" + numero + ", tipoCuenta="
				+ tipoCuenta + ", saldo=" + saldo + "]";
	}

	void consultarSaldo() {
		System.out.println("El saldo actual es = " + saldo);
	}

	boolean consignar(int valor) {
		// El valor a consignar debe ser mayor que cero
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a consignar debe ser mayor que cero.");
			return false;
		}
	}

	boolean retirar(int valor) {
		/*
		 * El valor debe ser mayor que cero y no debe superar el saldo actual
		 */
		if ((valor > 0) && (valor <= saldo)) {
			saldo = saldo - valor;
			System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a retirar debe ser menor que el saldo actual.");
			return false;
		}
	}
    
}
