package repasosExamen;

// Se desea llevar un control del estado de una cuenta corriente; la cuenta corriente está caracterizada por su saldo,
// el nombre de su titular y un número de cuenta y sobre ella se pueden realizar cuatro tipos de métodos:

// · Saldo: devuelve el saldo de la cuenta (puede ser negativo).
// · Depósito (cantidad): ingresa en la cuenta una cantidad de dinero.
// · Retiro (cantidad): saca de la cuenta una determinada cantidad de dinero.
// . Interés (porcentaje): incrementa el saldo de la cuenta en el porcentaje pasado como parametro

// Suponga que la cuenta inicialmente tiene un saldo igual a cero.

// También, necesitamos un contador de todas las cuentas bancarias existentes. 

// Además, contendrá: Constructor por defecto. Constructor con parámetros. Métodos setters/getters. Método toString.

// Escriba una clase Cuenta Corriente que implemente las funcionalidades descritas.

// Pruebe la clase creando al menos tres cuentas que prueben todos los  métodos.


public class Ejercicio4A {

    private int saldo;
    private String nombreTitular;
    private int numeroCuenta;

        Ejercicio4A() {
            this.saldo = 2500;
            this.nombreTitular = "Pepe";
            this.numeroCuenta = 123456789;
        }

        Ejercicio4A(int saldo, String nombreTitular, int numeroCuenta) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        }

        public int getSaldo() {
            return saldo;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        public String getNombreTitular() {
            return nombreTitular;
        }

        public void setNombreTitular(String nombreTitular) {
            this.nombreTitular = nombreTitular;
        }

        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        // · Saldo: devuelve el saldo de la cuenta (puede ser negativo).
        // · Depósito (cantidad): ingresa en la cuenta una cantidad de dinero.
        // · Retiro (cantidad): saca de la cuenta una determinada cantidad de dinero.
        // . Interés (porcentaje): incrementa el saldo de la cuenta en el porcentaje pasado como parametro

        public int depositoDinero(int aumento) {
            return saldo+=aumento;
        }

        public int retiroDinero(int quitar) {
            return saldo-=quitar;
        }

        @Override
        public String toString() {
            return "Ejercicio4A [saldo=" + saldo + ", nombreTitular=" + nombreTitular + ", numeroCuenta=" + numeroCuenta
                    + "]";
        }

}
