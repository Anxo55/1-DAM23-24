package segundo.ejemplo3_2;

public class Reto1 {

    public static void main(String[] args) {
        String cadena = "Pepe es muy guapo";
        System.out.println(voltearCadena(cadena));
    }

    public static String voltearCadena(String param) {
        char[] caracteres = param.toCharArray();
        String  volta = "";
        
        for(int i=caracteres.length-1;i>=0;i--) 
            volta += caracteres[i];

        return volta;        
    }
    
}
