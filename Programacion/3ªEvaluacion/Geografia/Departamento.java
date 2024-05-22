package Geografia;

import java.util.ArrayList;
import java.util.Collections;

public class Departamento {

    private String nombre;
    private ArrayList<Municipio> municipios;

    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
        Collections.sort(this.municipios);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Municipio> getMunicipio() {
        return municipios;
    }

    public void setMunicipio(ArrayList<Municipio> municipios) {
        this.municipios = municipios;
    }

    // metodos de la clase Departamento


    // metodo agrega municipio
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
        Collections.sort(this.municipios);
    }

    // metodo para buscar el municipio
    public Municipio buscarMunicipio(String nombre) {
        Municipio mun = null;
        for(Municipio municipio: municipios) {
            if(municipio.getNombre().equals(nombre)) {
                mun = municipio;
                // si el sysout de abajo lo dejas sin comentar, es cuando te mostrará dos veces el objeto de hispanity repetido.
                // System.out.println(municipio.toString());
            }

        }
        return mun;
    }

    // metodo para eliminar un municipio
    public void eliminarMunicipio(String nombre) {
        municipios.remove(buscarMunicipio(nombre));
    }


    public void buscarMunicipioConPoblacionMayor(int poblacion) {

        // Municipio mun = null;
        for(Municipio municipio: municipios) {
            if(municipio.getPoblacion() >= poblacion) {
                System.out.println(municipio.toString());
            }
        }
    }

    // metodo de calculo de censo de poblacion del deaprtamento
    public int calcularCensoPoblacionDepartamento() {
        int cen = 0;
        for(Municipio municipio: municipios) {
            cen+=municipio.getPoblacion();
        }
        return cen;
    }

    public void listarMunicipios() {
        System.out.println("-------------------");
        System.out.println("Listado de los municipios");
        for(int i=0; i<municipios.size(); i++) {
            System.out.println(municipios.get(i));
        }
        
    }
     
}
