package Propuesto2;

public class Oficinas extends Local{
    
    protected static double valorArea=3500;

    protected boolean esGobierno;

    public Oficinas(int idTipo, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(idTipo, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
        setValorArea(3500);
    }


    @Override
    public String toString() {
        return super.toString()+ "Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + "]";
    }

}
