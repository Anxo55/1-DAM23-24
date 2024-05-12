package segundo.gestesimal;

import java.util.ArrayList;
import java.util.Scanner;

/*Modifica el programa Gestisimal realizado anteriormente aladiendo las siguiente mejoras:
 * Utiliza una lista en lugar de un array apra el almacenamiento de los datos.
 * Comprueba la existencia del codigo en el alta, la baja,y la modificacion
 * de articulo oara evitar errores.
 * Cambia la opcion salida de stock por venta. Esta nueva opcion permitira hacer una venta de varios articulos
 * y emitir la factura correspondiente.
 * Se debe preguntar por los codigos y las cantidades de cada articulo que ser quiere comprar.
 * Aplica un 21% de IVA.
 */

public class Ejercicio13 {

static Scanner s = new Scanner(System.in);
    
// N determina el tamaño del array
// static final int N = 100;

// static Articulo[] articulos = new Articulo[N];

static ArrayList<Articulo> articulos = new ArrayList<>();

public static void main(String[] args) {

  // Inicializa el array
//   for(int i = 0; i < N; i++) {
//     Gestesimal.articulos[i] = new Articulo();
//   }

  int opcion;
  int stockIntroducido;
  double precioDeCompraIntroducido;
  double precioDeVentaIntroducido;
  String codigo;
  String codigoIntroducido = "";
  String descripcionIntroducida;

  Scanner s = new Scanner(System.in);

  // MENU ///////////////////////////////////////////////////////////////////
  do {
    pintaTitulo("G E S T E S I M A L");
    System.out.println("1. Listado");
    System.out.println("2. Alta");
    System.out.println("3. Baja");
    System.out.println("4. Modificación");
    System.out.println("5. Entrada de mercancía");
    System.out.println("6. Salida de mercancía");
    System.out.println("7. Salir");
    System.out.print("Introduzca una opción: ");
    opcion = Integer.parseInt(s.nextLine());
    
    switch (opcion) {

      // LISTADO ////////////////////////////////////////////////////////////
      case 1:
        pintaTitulo("LISTADO");
        
        for(Articulo a : articulos) {
          System.out.println(a);
          }
        
        break;

      // ALTA ///////////////////////////////////////////////////////////////
      case 2:
        pintaTitulo("NUEVO ARTÍCULO");
        
        // if (primeraPosicionLibre() == N) {
        //   System.out.println("Lo siento, la base de datos está llena.");
        // } else 
        // {
          
        //   // Introducción de datos 
        //   System.out.println("Por favor, introduzca los datos del artículo.");  
        //   System.out.print("Código: ");
          
        //   // Comprueba que el código introducido no se repita
        //   do {
        //     codigoIntroducido = s.nextLine();
        //     if (existeCodigo(codigoIntroducido)) {
        //       System.out.println("Ese código ya existe en la base de datos.");
        //       System.out.print("Introduzca otro código: ");
        //     }
        //   } while (existeCodigo(codigoIntroducido));

            codigoIntroducido = peticionCodigo();

        pintaTitulo("DATOS DEL NUEVO ARTICULO");
        System.out.println("Codigo valido: "+codigoIntroducido);
          
          System.out.print("Descripcion: ");
          descripcionIntroducida = s.nextLine();
          System.out.print("Precio de compra: ");
          precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
          System.out.print("Precio de venta: ");
          precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
          System.out.print("Stock: ");
          stockIntroducido = Integer.parseInt(s.nextLine());

          // Crea el nuevo artículo
          articulos.add(new Articulo(
            codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido,
            precioDeVentaIntroducido, stockIntroducido));
        // }
        
        break;

      // BAJA ///////////////////////////////////////////////////////////////
      case 3:
        pintaTitulo("BAJA");
        
        System.out.print("Por favor, introduzca el código del artículo: ");
        codigoIntroducido = s.nextLine();
  
        if (!existeCodigo(codigoIntroducido)) {
          System.out.println("Lo siento, el código introducido no existe.");
        } else {
          // como obtengo un objeto para un codigo determinado
          articulos.remove(posicionConCodigo(codigoIntroducido));
          System.out.println("Artículo borrado. Con codigo: "+codigoIntroducido);  
        }
        
        break; //dance
        
      // MODIFICACIÓN ///////////////////////////////////////////////////////
      case 4:
        pintaTitulo("MODIFICACIÓN");
        
        System.out.print("Por favor, introduzca el código del artículo: ");
        codigoIntroducido = s.nextLine();

        if (!existeCodigo(codigoIntroducido)) {
          System.out.println("Lo siento, el código introducido no existe.");
        } else {
          int i = posicionConCodigo(codigoIntroducido);
          Articulo provisional = articulos.get(i);
          System.out.print("Introduzca los nuevos datos del artículo");
          System.out.println(" o INTRO para dejarlos igual.");
    
          
          // NO DEJO TOCAR EL CODIGO
          System.out.println("Código: " + provisional.getCodigo());
          // System.out.print("Nuevo código: ");
          // codigoIntroducido = s.nextLine();
          // if (!codigoIntroducido.equals("")) {
            // articulos[i].setCodigo(codigoIntroducido);
          // }
          
          System.out.println("Descripción: " + provisional.getDescripcion());
          System.out.print("Nueva descripción: ");
          descripcionIntroducida = s.nextLine();
          if (!descripcionIntroducida.equals("")) {
            provisional.setDescripcion(descripcionIntroducida);
          }
          
          System.out.println("Precio de compra: " + provisional.getPrecioDeCompra());
          System.out.print("Nuevo precio de compra: ");
          String precioDeCompraIntroducidoString = s.nextLine();
          if (!precioDeCompraIntroducidoString.equals("")) {
            provisional.setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
          }
          System.out.println("Precio de venta: " + provisional.getPrecioDeVenta());
          System.out.print("Nuevo precio de venta: ");
          String precioDeVentaIntroducidoString = s.nextLine();
          if (!precioDeVentaIntroducidoString.equals("")) {
            provisional.setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
          }
          System.out.println("Stock: " + provisional.getStock());
          System.out.print("Nuevo stock: ");
          String stockIntroducidoString = s.nextLine();
          if (!stockIntroducidoString.equals("")) {
            provisional.setStock(Integer.parseInt(stockIntroducidoString));
          }
        
        
        articulos.set(i, provisional);
      }
        
        break; //dance

        // ENTRADA DE MERCANCÍA /////////////////////////////////////////////
        case 5:
          pintaTitulo("ENTRADA DE MERCANCÍA");
          
          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = s.nextLine();
      
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else { //pide codigo y mete en el campo stock
           
            int i = posicionConCodigo(codigoIntroducido);
            Articulo provisional = articulos.get(i);
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(provisional);
            System.out.print("Introduzca el número de unidades que entran: ");
            String stockIntroducidoString = s.nextLine();
            provisional.setStock(
              Integer.parseInt(stockIntroducidoString) + provisional.getStock()); //comprobar
            System.out.println("La mercancía ha entrado en el almacén.");  
            System.out.println("nuevo stock: "+provisional.getStock());

            articulos.set(i, provisional);
          }
          
          break; //dance

          // SALIDA DE MERCANCÍA ////////////////////////////////////////////
          case 6:
            pintaTitulo("SALIDA DE MERCANCÍA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();

            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              int i = posicionConCodigo(codigoIntroducido);
              Articulo provisional = articulos.get(i);
              System.out.println("Salida de mercancía del siguiente artículo: ");
              System.out.println(provisional);
              System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
              stockIntroducido = Integer.parseInt(s.nextLine());
              if (provisional.getStock() - stockIntroducido > 0) {
                provisional.setStock(provisional.getStock() - stockIntroducido);
                System.out.println("La mercancía ha salido del almacén.");
              } else {
                System.out.println("Lo siento, no se pueden sacar tantas unidades.");
              }
            }
            
            break;
    } // switch
  } while (opcion != 7);
}

// FUNCIONES ////////////////////////////////////////////////////////////////

public static void guardarArticulos() {

}

// /**
//  * Busca la primera posición libre del array.
//  * Si no quedan huecos, devuelve -1.
//  * 
//  * @return primera posición libre del array o -1 si no quedan huecos
//  */
// public static int primeraPosicionLibre() {
//   for (int i = 0; i < articulos.length; i++) {
//     if (articulos[i].getCodigo().equals("LIBRE")) {
//       return i;
//     }
//   }
//   return -1;
// }

/**
 * Dice si existe o no un artículo con un determinado código.
 * 
 * @return true si existe el código y false si no existe
 */
public static boolean existeCodigo(String codigo) {
  for (Articulo a : articulos) {
    if (a.getCodigo().equals(codigo)) {
      return true;
    }
  }
  return false;
}

/**
 * Pinta un título con subrayado.
 */
public static void pintaTitulo(String titulo) {
  System.out.println("\n" + titulo);
  for (int i = 0; i < titulo.length(); i++) {
    System.out.print("=");  
  }
  System.out.println();
}

/**
 * Devuelve la posición dentro del array en la que se encuentra un artículo
 * con un determinado código.
 * Si el código no se encuentra, devuelve -1.
 * 
 * @return posición dentro del array en la que se encuentra un artículo
 */
public static int posicionConCodigo(String codigo) {
  
  for (int i = 0; i < articulos.size(); i++) {
    if (articulos.get(i).getCodigo().equals(codigo)) {
      return i;
    }
  }
  return -1;
}

// SOLO EN EL CASO DOS (ALTAS) PARA EVITAR duplicidad
public static String peticionCodigo() {
    
    String codigoIntroducido;
    // Introducción de datos 
    System.out.println("Por favor, introduzca el codigo del artículo.");  
    System.out.print("Código: ");
    
    // Comprueba que el código introducido no se repita
    do {
      codigoIntroducido = s.nextLine();
      if (existeCodigo(codigoIntroducido)) {
        System.out.println("Ese código ya existe en la base de datos.");
        System.out.print("Introduzca otro código: ");
      }
    } while (existeCodigo(codigoIntroducido));

    return codigoIntroducido;
}


}

