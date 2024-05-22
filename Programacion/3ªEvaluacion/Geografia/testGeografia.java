package Geografia;

import java.util.ArrayList;

public class testGeografia {

    public static void main(String[] args) {

        Municipio municipio = new Municipio("Manizales", 400000, 17, 2200);
        Municipio municipio2 = new Municipio("La Dorada", 98000, 28, 1000);
        Municipio municipio3 = new Municipio("Neira", 30000, 20, 1969);

        ArrayList<Municipio> municipios = new ArrayList<>();
        municipios.add(municipio);
        municipios.add(municipio2);
        municipios.add(municipio3);

        Departamento departamento = new Departamento("Caldas", municipios);

        System.out.println("El " + departamento.getNombre() + " tiene una poblacion de: " +
                departamento.calcularCensoPoblacionDepartamento() + " habitantes.");

        System.out.println("Municipios con poblacion mayor a 50000");
        departamento.buscarMunicipioConPoblacionMayor(50000);

        System.out.println();

        System.out.println("Busqueda de municipio de Manizales");
        Municipio mun = departamento.buscarMunicipio("Manizales");

        Municipio municipio4 = new Municipio("Hispanity", 300, 15, 48);
        departamento.agregarMunicipio(municipio4);

        departamento.listarMunicipios();

        departamento.eliminarMunicipio("Hispanity");

        departamento.listarMunicipios();
    }
}