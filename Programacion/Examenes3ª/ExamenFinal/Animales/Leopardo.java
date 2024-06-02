package ExamenFinal.Animales;

import java.io.*;

public class Leopardo extends Felino implements Serializable {
    private boolean pelajeManchado;
    private String habitat;

    public Leopardo(String esp, int ed, String color, boolean pelajeManchado, String habitat) {
        super(esp, ed, color);
        this.pelajeManchado = pelajeManchado;
        this.habitat = habitat;
    }

    public Leopardo() {
        this("Leopardo", 0, "Desconocido", false, "Desconocido");
    }

    @Override
    public String toString() {
        return "Leopardo{" +
                "pelajeManchado=" + pelajeManchado +
                ", habitat='" + habitat + '\'' +
                ", especie='" + getEspecie() + '\'' +
                ", edad=" + getEdad() +
                ", colorPelaje='" + getColorPelaje() + '\'' +
                ", id=" + getId() +
                '}';
    }

    public void guardar(String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Leopardo leer(String fichero) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            return (Leopardo) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
