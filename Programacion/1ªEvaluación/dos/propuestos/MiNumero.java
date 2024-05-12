package dos.propuestos;

// 2. Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número proporcionado en su 
// constructor (realiza un método para doble, otro para triple y otro para cuádruple). Haz que la clase tenga un métock 
// main y comprueba los distintos métodos.

public class MiNumero {

    //atributos
    private int numero;

    //constructor con el parametro o atributo de las clase.
    public MiNumero(int numero) {
        this.numero = numero;
    }

    //metodo para tener el doble del numero que mandamos
    public int doble() {
        int doble = numero *2;
        return doble;
    }

    //metodo para tener el triple del numero que mandamos
    public int triple() {
        int triple = numero * 3;
        return triple;
    }

    //metodo para tener el cuadruple del numero que mandamos
    public int cuadruple() {
        int cuadruple = numero * 4;
        return cuadruple;
    }

    @Override
    public String toString() {
        return "MiNumero [numero=" + numero + "]";
    }

    
    
    
}
