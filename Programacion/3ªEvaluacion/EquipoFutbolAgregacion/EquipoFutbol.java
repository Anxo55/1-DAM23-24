package EquipoFutbolAgregacion;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {

    private String nombre;
    private String pais;
    private Tecnico tecnico;
    private Portero portero;
    private List<Defensa> defensas;
    private List<Mediocampo> mediocampos;
    private List<Delantero> delanteros;

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.defensas = new ArrayList<>();
        this.mediocampos = new ArrayList<>();
        this.delanteros = new ArrayList<>();
    }

    public EquipoFutbol(String nombre, String pais, Tecnico tecnico, Portero portero, List<Defensa> defensas, List<Mediocampo> mediocampos, List<Delantero> delanteros) {
        this(nombre, pais);
        this.tecnico = tecnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    public void imprimir() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Portero: " + portero);
        System.out.println("Defensas:");
        for (Defensa defensa : defensas) {
            System.out.println(defensa);
        }
        System.out.println("Mediocampos:");
        for (Mediocampo mediocampo : mediocampos) {
            System.out.println(mediocampo);
        }
        System.out.println("Delanteros:");
        for (Delantero delantero : delanteros) {
            System.out.println(delantero);
        }
    }

    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Carlos", "Queiroz", 66, 30, false);
        Portero portero = new Portero("David", "Ospina", 30, true, 10);
        
        List<Defensa> defensas = new ArrayList<>();
        defensas.add(new Defensa("Yerry", "Mina", 24, true));
        defensas.add(new Defensa("Davison", "Sánchez", 23, true));
        defensas.add(new Defensa("William", "Tesillo", 29, true));
        defensas.add(new Defensa("Stefan", "Medina", 29, true));

        List<Mediocampo> mediocampos = new ArrayList<>();
        mediocampos.add(new Mediocampo("Mateus", "Uribe", 28, true, 12));
        mediocampos.add(new Mediocampo("Wilmar", "Barrios", 25, true, 12));
        mediocampos.add(new Mediocampo("Juan Guillermo", "Cuadrado", 31, true, 10));
        mediocampos.add(new Mediocampo("James", "Rodríguez", 28, true, 32));

        List<Delantero> delanteros = new ArrayList<>();
        delanteros.add(new Delantero("Radamel Falcao", "García", 33, true, 15));
        delanteros.add(new Delantero("Duván", "Zapata", 28, true, 12));

        EquipoFutbol equipo = new EquipoFutbol("Selección Colombia", "Colombia", tecnico, portero, defensas, mediocampos, delanteros);
        equipo.imprimir();
    }
}
