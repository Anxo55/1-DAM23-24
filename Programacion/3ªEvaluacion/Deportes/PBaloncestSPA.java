package Deportes;

public class PBaloncestSPA implements PartidoBaloncesto{
	
	private String equipoLocal;
	private String equipoVisitante;
	private int CestasEquipoLocal;
	private int CestasEquipoVisitante;
	
	@Override
	public void setCestasEquipoLocal(int marcador) {
		// TODO Auto-generated method stub
		this.CestasEquipoLocal = marcador;
	}
	@Override
	public void setCestasEquipoVisitante(int marcador) {
		// TODO Auto-generated method stub
		this.CestasEquipoVisitante = marcador;
		
	}
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
	@Override
	public String toString() {
		return "PBaloncestSPA [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ "\n CestasEquipoLocal=" + CestasEquipoLocal + ", CestasEquipoVisitante=" + CestasEquipoVisitante + "]";
	}
	
	
	
	
	
	
	

}

