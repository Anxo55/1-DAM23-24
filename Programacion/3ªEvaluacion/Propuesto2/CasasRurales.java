package Propuesto2;

public class CasasRurales extends Casa{

    protected static double valorArea=1500;

    private int distanciaCabeceraMunicipal;
    private int altitudNivelMar;

    
    public CasasRurales(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
            int numeroHabitaciones, int numeroBaños, int numPisos, int distanciaCabeceraMunicipal,
            int altitudNivelMar) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBaños, numPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }


    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }


    public void setDistanciaCabeceraMunicipal(int distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }


    public int getAltitudNivelMar() {
        return altitudNivelMar;
    }


    public void setAltitudNivelMar(int altitudNivelMar) {
        this.altitudNivelMar = altitudNivelMar;
    }


    @Override
    public String toString() {
        return super.toString() + "CasasRurales [distanciaCabeceraMunicipal=" + distanciaCabeceraMunicipal + ", altitudNivelMar="
                + altitudNivelMar + "]";
    }
    
    
}
