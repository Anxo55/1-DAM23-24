package tres.ejemplos;

import java.util.Scanner;

public class ejemplo6 {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        int numero =1;

        while(numero<=10){ //bucle que cuenta hasta 10
            System.out.println(numero);
            numero++;

            //el tiempo que va a tardar en mostrar el siguiente numero tras recorre el bucle while.
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

            System.out.println("fin de codigo");

                numero = 1;
                do{ //comienzo del do while

                    System.out.println(numero);
                    numero++;

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // e.printStackTrace();
                        System.out.println("CAPTURADA UNA EXPECCION");
                    }
                }while(numero<=10);

                System.out.println("fin de codigo");

                for (int i= 1; i <=10; i++) {

                    System.out.println(i);

                    Thread.sleep(100);
                }

                System.out.println("fin de codigo de i");
            }
            

    }



    

