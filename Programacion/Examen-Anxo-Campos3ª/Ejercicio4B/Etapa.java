package Ejercicio4B;

import java.util.ArrayList;
import java.util.Collections;

public class Etapa extends Carrera {


	private int numEtapa;
	private int distancia; 
	private String tipoEtapa; 
	ArrayList<Ciclista> clasificacionParcial; 
public Etapa(String nombreCompeticion, int numEtapa, int distancia, String tipoEtapa) {
	super(nombreCompeticion, tipoEtapa);
		this.numEtapa = numEtapa;
		this.distancia = distancia;
		this.tipoEtapa = tipoEtapa;
	}

	public int getNumEtapa() {
		return numEtapa;
	}

	public void setNumEtapa(int numEtapa) {
		this.numEtapa = numEtapa;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getTipoEtapa() {
		return tipoEtapa;
	}

	public void setTipoEtapa(String tipoEtapa) {
		this.tipoEtapa = tipoEtapa;
	}

	public void calculaYMuestraTiemposParciales() {
		for (Ciclista c : clasificacionParcial) {
			c.calculaTiempoParcial();
			c.acumulaTiempoTotal();
			System.out.println(c.toString());
		}
		Collections.sort(clasificacionParcial,
				(o1, o2) -> (int) (o1.getTiempoAcumulado()) - (int) (o2.getTiempoAcumulado()));
	}

} 

