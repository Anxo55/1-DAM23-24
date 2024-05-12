package Universidad;

import java.util.Arrays;

public class Estudiante extends Persona{

    private double[] notas;

    public String carrera;
    public int semestre;
    
    public Estudiante(String nombre, String direccion, String carrera, int semestre, double[] notas) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
        this.notas = notas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + ", direccion=" + direccion
                + ", carrera=" + carrera + ", semestre=" + semestre + "]";
    }

    public static String hacerEjercicios() {
        return"Estoy haciendo ejercicios";
    }

    public double calcularMedia() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    
}
