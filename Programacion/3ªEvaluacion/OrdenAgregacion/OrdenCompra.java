package OrdenAgregacion;

import java.util.ArrayList;
import java.util.List;

public class OrdenCompra {

    private int identificador;
    private List<LineaPedido> lineasPedido;

    public OrdenCompra(int identificador) {
        this.identificador = identificador;
        this.lineasPedido = new ArrayList<>();        
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public List<LineaPedido> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(List<LineaPedido> lineasPedido) {
        this.lineasPedido = lineasPedido;
    }


    // metodos extras de la clase
    public void añadirItem(LineaPedido lineaPedido) {
        lineasPedido.add(lineaPedido);
    }

    public double calculatTotal() {
        double total = 0;
        for(LineaPedido lineaPedido: lineasPedido) {
            total += lineaPedido.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "OrdenCompra [identificador=" + identificador + ", lineasPedido=" + lineasPedido + "]";
    }

    
    
}
