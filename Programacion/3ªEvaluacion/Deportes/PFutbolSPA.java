package Deportes;

public class PFutbolSPA implements PartidoFutbol{
	
	private String equipoLocal;
	private String equipoVisitante;
	private int GolesEquipoLocal;
	private int GolesEquipoVisitante;
	
	/*De match*/
	@Override
	public void setEquipoLocal(String eq) {
		// TODO Auto-generated method stub
		this.equipoLocal=eq;
		
	}
	@Override
	public void setEquipoVisitante(String eq) {
		// TODO Auto-generated method stub
		this.equipoVisitante=eq;
		
	}
	/*De partido futbol*/
	@Override
	public void setGolesEquipoLocal(int marcador) {
		// TODO Auto-generated method stub
		this.GolesEquipoLocal=marcador;
		
	}
	@Override
	public void setGolesEquipoVisitante(int marcador) {
		// TODO Auto-generated method stub
		this.GolesEquipoVisitante=marcador;
		
	}
	@Override
	public String toString() {
		return "PFutbolSPA [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + "\n GolesEquipoLocal="
				+ GolesEquipoLocal + ", GolesEquipoVisitante=" + GolesEquipoVisitante + "]";
	}
	
	
	
	
	

}

