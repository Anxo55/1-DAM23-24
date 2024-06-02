package ModeloA.Ejercicio2A;

import java.io.Serializable;

public class Delantero extends Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private int golesMetidos;
    private int penaltisFallados;

    // Constructor con parámetros
    public Delantero(String n, String d, int p, int g, int a, int r, int golesMetidos, int penaltisFallados) {
        super(n, d, p, g, a, r);
        this.golesMetidos = golesMetidos;
        this.penaltisFallados = penaltisFallados;
    }

    // Constructor por defecto
    public Delantero() {
        super();
        this.golesMetidos = 0;
        this.penaltisFallados = 0;
    }

    // Getters y Setters
    public int getGolesMetidos() {
        return golesMetidos;
    }

    public void setGolesMetidos(int golesMetidos) {
        this.golesMetidos = golesMetidos;
    }

    public int getPenaltisFallados() {
        return penaltisFallados;
    }

    public void setPenaltisFallados(int penaltisFallados) {
        this.penaltisFallados = penaltisFallados;
    }

    // Sobrescribir el método imprimir
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Goles Metidos: " + golesMetidos);
        System.out.println("Penaltis Fallados: " + penaltisFallados);
    }
}