package Ficheros;

import java.io.File;

public class LeerDirectorio {

    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\anxoc\\OneDrive\\Escritorio\\DAM 23-24\\1-DAM23-24\\Programacion\\3ªEvaluacion");

        String[] archivos =  directorio.list();
        for(int i=0; i<archivos.length; i++) {
            System.out.println("Archivo " + archivos[i]);
        }
        
    }
    
}
