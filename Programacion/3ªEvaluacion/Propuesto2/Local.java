package Propuesto2;

public class Local extends Inmueble{

enum tipo{
    INTERNO,CALLE
};

protected tipo tipoLocal;

    public Local(int idTipo, int area, String direccion,  tipo tipoLocal) {
        super(idTipo, area, direccion);
        this.tipoLocal=tipoLocal;
    }

    @Override
    public String toString() {
        return super.toString()+ "Local []";
    }

    
    
    
}