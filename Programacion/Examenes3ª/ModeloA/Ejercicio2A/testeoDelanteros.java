package ModeloA.Ejercicio2A;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class testeoDelanteros {
    
        public static void main(String[] args) {
            // Crear una lista de jugadores y delanteros
            List<Jugador> jugadores = new ArrayList<>();
            jugadores.add(new Delantero("Juan", "Delantero", 10, 5, 2, 0, 15, 3));
            jugadores.add(new Delantero("Pedro", "Delantero", 8, 4, 1, 1, 10, 2));
            jugadores.add(new Delantero("Luis", "Delantero", 12, 6, 3, 2, 18, 1));
            jugadores.add(new Jugador("Carlos", "Defensa", 20, 1, 5, 0));
            jugadores.add(new Jugador("Andrés", "Portero", 15, 0, 2, 0));
    
            // Imprimir y guardar información de delanteros
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("delanteros.dat"))) {
                for (Jugador jugador : jugadores) {
                    if (jugador instanceof Delantero) {
                        jugador.imprimir();
                        oos.writeObject(jugador);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

