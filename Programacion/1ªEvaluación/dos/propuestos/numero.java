package dos.propuestos;

import java.util.Scanner;

// 3. Realiza una clase número que almacene un número entero y tenga las siguientes características:
// Constructor por defecto que inicializa a 0 el número interno.
// Constructor que inicializa el número interno.
// Método aniade que permite sumarle un número al valor interno.
// Método resta que resta un número al valor interno.
// Método getValor. Devuelve el valor interno.
// Método getDoble. Devuelve el doble del valor interno.
// Método getTriple. Devuelve el triple del valor interno.
// Método setNumero. Inicializa de nuevo el valor interno

public class numero {

    Scanner sc = new Scanner(System.in);

    //atributo o parametro de la clase numero
    private int numero;

    //constructor por defecto
    numero() {
        this.numero = 0;
    }

    //Constructor con el parametro de la clase numero
    numero(int numero) {
        this.numero = numero;
    }

    //metodos getters y setters.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void aniado(int anidado) {
        numero = numero + anidado;
    }

    public void restar(int restar) {
        numero = numero - restar;
    }

    //metodos doble, triple y cuadruple
    public int doble() {
        int doble = numero * 2;
        return doble;
    }

    public int triple() {
        int triple = numero * 3;
        return triple;
    }

    public int cuadruple() {
        int cuadruple = numero * 4;
        return cuadruple;
    }

    //metodo toString para imprimir por consola
    @Override
    public String toString() {
        return "numero [numero=" + numero + "]";
    }

}
