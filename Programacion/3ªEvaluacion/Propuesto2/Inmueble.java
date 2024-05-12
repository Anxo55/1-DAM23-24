package Propuesto2;

public class Inmueble {

    protected static double valorArea=0;

    private int identificadorInmobiliario;
    private int areaMetrosCuadrados;
    private String direccion;
    
    public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
    }

    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public void setAreaMetrosCuadrados(int areaMetrosCuadrados) {
        this.areaMetrosCuadrados = areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static double getValorArea() {
        return valorArea;
    }

    public static void setValorArea(double valorArea) {
        Inmueble.valorArea = valorArea;
    }

    @Override
    public String toString() {
        return "Inmueble [identificadorInmobiliario=" + identificadorInmobiliario + ", areaMetrosCuadrados="
                + areaMetrosCuadrados + ", direccion=" + direccion + "]";
    }

    public double calcularPrecioVenta(double valorArea) {
        return this.areaMetrosCuadrados*valorArea;
    }
    
}
