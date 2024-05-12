package Deportes;

public interface PartidoFutbol extends Match{
	
	public static  final int duracion=90;
	
	public void setGolesEquipoLocal(int marcador);
	public void setGolesEquipoVisitante(int marcador);
    
}
