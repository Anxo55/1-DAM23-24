package herenciaInmuebles;

public class local extends Inmuebles{

	//-----ENUM----
	enum tipo {
		CALLE, INTERNO
	}
	
	//----ATRIBUTO-----
	protected tipo tipolocal;

	
	//----GETTER AND SETTER--
	public tipo getTipolocal() {
		return tipolocal;
	}

	public void setTipolocal(tipo tipolocal) {
		this.tipolocal = tipolocal;
	}

	
	//----TOSTRING--



	
	// ---CONTRUCTOR---
	public local(int id, int area, String direccion, tipo tipolocal) {
		super(id, area, direccion);
		this.tipolocal = tipolocal;
	
	}

	@Override
	public String toString() {
		return "local [tipolocal=" + tipolocal + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}


	
}
