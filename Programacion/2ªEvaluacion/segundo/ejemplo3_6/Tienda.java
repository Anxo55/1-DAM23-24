package segundo.ejemplo3_6;

import java.util.Arrays;

public class Tienda {

    String nombre;
    String propietario;
    int id;

    Computador[] computadores;
    static int numComp;

    public Tienda(String nombre, String propietario, int id, int tamano) {
        if (tamano < 1) {
            System.out.println("cantidad de computadoras insuficientes");
        }else{
            this.nombre = nombre;
            this.propietario = propietario;
            this.id = id;
            computadores = new Computador[tamano];
            // se crea el array de computadores
            numComp = 0;
        }
    }

    public boolean tiendaLlena() {
        return numComp == computadores.length;
    }

    public boolean tiendaVacia() {
        return numComp == 0;
    }

    public void añadir(Computador computador) {
        if (tiendaLlena()) {
            System.out.println("La tienda está llena. No se puede añadir elemento.");
        }else{
            computadores[numComp] = computador;
            numComp++; // Se incrementa el contador de computadores
        }
    }

    public boolean eliminar(String marcaComputador) {
        int pos = buscar(marcaComputador);
        if (pos < 0) {
            return false;
        }

        for(int i=pos; i < numComp-1; i++) {
            computadores[i] = computadores[i+1];
            // no resetea el ultimo nunca
        }
        // lo que hay que hacer
        computadores[numComp-1]=null;
        numComp--;//Decrementa la cantidad de computadores
        return true;
    }

    public int buscar(String marcaComputador) {
        for(int i = 0; i < numComp; i++) {
            // USE GETMARCA POR FAVOR, en vez dek atributo
            if (computadores[i].getMarca().equals(marcaComputador)) 
            // Si se encuentra el computador buscado
            return i;//Retorna la posicion del computador buscado en el array
        }
        return -1; //Si no encontró el computador en el array
    }

    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", propietario=" + propietario + ", id=" + id + ", computadores="
                + "\n"+Arrays.toString(computadores) + "]";
    }

    
    
}
