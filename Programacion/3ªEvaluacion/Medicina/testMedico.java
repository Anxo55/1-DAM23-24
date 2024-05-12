package Medicina;

import java.util.ArrayList;

import Medicina.Ortopedista.tipologiaG;
import Medicina.Pediatra.tipologiaP;

public class testMedico {

    public static void main(String[] args) {

        ArrayList<Medico> miembros = new ArrayList<Medico>();

        Medico medico = new Medico("Pepe");
        Pediatra pediatra = new Pediatra("Fermin", tipologiaP.NEUROLOGO);
        Ortopedista ortopedista = new Ortopedista("Maxi", tipologiaG.MAXILOFACIAL);

        miembros.add(medico);
        miembros.add(pediatra);
        miembros.add(ortopedista);

        for(int i = 0; i<miembros.size();i++) {
			Medico a = (Medico) miembros.get(i);
			
			if(a instanceof Ortopedista) {
				System.out.println("El objeto del indice "+ i+" es un ortopedista");
                ortopedista.soyOrtopedista();
				continue;
			}
			if(a instanceof Pediatra) {
				System.out.println("El objeto del indice "+i+ " es un Pediatra");
                pediatra.soyPediatra();
				continue;
			}
			if (a instanceof Medico) {
				System.out.println("El objeto del inice "+i+ " es un medico");
                medico.tomarLaTension();
				continue;
			}
        }

       
    }
    
}
