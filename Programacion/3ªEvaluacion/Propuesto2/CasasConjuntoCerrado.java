package Propuesto2;

public class CasasConjuntoCerrado extends CasasUrbanas{

    protected static double valorArea=2500;

    private int valorAdministracion;
    private boolean tienePiscinas;
    private boolean tieneCamposDeportivos;

    
    public CasasConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
            int numeroHabitaciones, int numeroBaños, int numPisos, int valorAdministracion, boolean tienePiscinas,
            boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBaños, numPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscinas = tienePiscinas;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }


    @Override
    public String toString() {
        return super.toString() + "CasasConjuntoCerrado [valorAdministracion=" + valorAdministracion + ", tienePiscinas=" + tienePiscinas
                + ", tieneCamposDeportivos=" + tieneCamposDeportivos + "]";
    }

    

}
