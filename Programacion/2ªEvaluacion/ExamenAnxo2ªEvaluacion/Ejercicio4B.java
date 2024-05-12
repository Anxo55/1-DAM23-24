package ExamenAnxo2ªEvaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Utilizando la clase Producto un supermercado nos pide que hagamos una pequeña aplicación
//  que almacene los productos pasados por el escaner de la caja central.

// La aplicación debe almacenar Productos (crea la clase), cada producto al crearse
//  contiene una cantidad(entera), un precio (flotante). Ambos dos generados aleatoriamente. 

// El nombre del producto será básico (producto1, producto2, producto3, etc.).

// Calcular el precio total de una lista de entre 1 y 6 productos (aleatorio). Dichos productos
//  serán almacenados en una lista dinámica.

// Mostrar un ticket con todo lo vendido y el precio final como se hacen en los supermercados.

// ***********Cantidad****Precio*****Total
// Producto1 		5 	 3.5 		17.5
// Producto2    	7	 2.5 		17.5

// Precio 		35
// 			iva 20%		7
			
// Total			42

public class Ejercicio4B {



    public static void main(String[] args) {
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Random random = new Random();
        int numeroProductos = random.nextInt(6) + 1;

        for (int i = 0; i < numeroProductos; i++) {
            Producto producto = new Producto(random.nextInt(10) + 1, random.nextFloat() * 10); 
            listaProductos.add(producto);
        }

        
        System.out.println("-------------Cantidad-----Precio-------Total");

        double total = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            float subtotal = producto.getCantidad() * producto.getPrecio();
            total += subtotal;
            System.out.printf("Producto%d \t%d \t %.2f \t\t %.2f\n", i + 1, producto.getCantidad(), producto.getPrecio(), subtotal);
        }
    }
}

