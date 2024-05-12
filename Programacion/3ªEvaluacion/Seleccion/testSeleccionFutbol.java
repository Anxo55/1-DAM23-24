package Seleccion;

import java.util.ArrayList;

public class testSeleccionFutbol {

    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> seleccionFutbol = new ArrayList<SeleccionFutbol>();

        // Entrenador delBosque = new Entrenador(1, "Vicente", "DEl bosque", 60, "6542662");
        // Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        // Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        // En vez de indicar con cada una de las clase, puedes hacerlo con la clase madre que sería
        // la de SeleccionFutbol
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del bosque", 60, "6542662");
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        seleccionFutbol.add(delBosque);
        seleccionFutbol.add(iniesta);
        seleccionFutbol.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo HEREDADO)");
        for (SeleccionFutbol seleccionFutbol2 : seleccionFutbol) {
            System.out.println(seleccionFutbol2.toString()+" ---> ");
            seleccionFutbol2.Concentrarse();
        }

        // VIAJE
        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo HEREDADO)");
        for (SeleccionFutbol seleccionFutbol2 : seleccionFutbol) {
            System.out.println(seleccionFutbol2.getNombre()+" "+ seleccionFutbol2.getApellidos());
            seleccionFutbol2.Viajar();
        }

        // recorre el arraylist ejecutando los metodos especificos o propios de cada objeto
        
        for(SeleccionFutbol i : seleccionFutbol) {
			if(i instanceof Futbolista) {
				System.out.print(i.nombre + " " + i.apellidos +"--->");
				((Futbolista) i).Viajar();
			}else if(i instanceof Entrenador) {
				System.out.print(i.nombre + " " + i.apellidos +"--->");
				((Entrenador) i).dirigirPartido();
			}else if(i instanceof Masajista) {
				System.out.print(i.nombre + " " + i.apellidos +"--->");
				((Masajista) i).darMasaje();
			}
    }

}
}
