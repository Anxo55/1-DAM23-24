package Peaje;

import java.util.ArrayList;

public class Peaje {
    
    public String nombre;
	public String departamento;
	public int totalPeaje;
	public int totalCamiones;
	public int totalMotos;
	public int totalCoches;
	
	
	ArrayList<Vehiculo> Peaje = new ArrayList<Vehiculo>();


	public Peaje(String nombre, String departamento) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void añadirVehiculo(Vehiculo a) {
		
		if(a instanceof Moto) {
			this.totalMotos++;
		}else if (a instanceof Coche) {
			this.totalCoches++;
		}else if(a instanceof Camion) {
			this.totalCamiones++;
		}else {
			System.out.println("No podemos registrar ese tipo de vehiculo");
		}
		Peaje.add(a);
		
		
	}
	
	public int calcularPeaje(Vehiculo a) {
			if(a instanceof Moto) {
				totalPeaje +=((Moto) a).getValorPeaje();
			}if (a instanceof Coche) {
				totalPeaje +=((Coche) a).getValorPeaje();
			}if(a instanceof Camion) {
				totalPeaje +=((Camion)a).getNumeroEjes() * ((Camion)a).getValorPeaje();
			}else {
				System.out.println("No podemos cobrar peaje a ese tipo de vehiculo");
			}
			
				
			return totalPeaje;
		}
		
		
		
	
    public void mostrarCoches() {
    	for (Vehiculo a : Peaje) {
    		System.out.println(a.toString());
    	}
    }
		}
		


