package segundo.ejemplo3_2;

public class CadenaBis {

    public static int contarLetra(String param, char letra) {
        int contador = 0;
        for(int k=0; k<param.length();k++) 
            if((param.charAt(k)==letra))
                contador++;
            return contador;    
        
    }

    public static int cuentaMayusculas(String param) {
        int contador = 0;
        for(int k=0; k<param.length(); k++) //65 a 90
            if((param.charAt(k) <= 'Z') && (param.charAt(k)>='A'))
                contador++;
            return contador;    
        
    }

    public static String voltearCadena(String param) {
        char[] caracteres = param.toCharArray();
        String  volta = "";
        
        for(int i=caracteres.length-1;i>=0;i--) 
            volta += caracteres[i];

        return volta;        
    }

   public static void main(String[] args) {
        String cadena = "Programacion Orientada a Objetos";
        System.out.println("mayusculas: "+cuentaMayusculas(cadena));
        System.out.println("letras: "+contarLetra(cadena, 'O'));
        System.out.println(voltearCadena(cadena));
   }

}
