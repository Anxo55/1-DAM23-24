package Swing.EmpleadosYNominas;

import java.util.Vector;

public class ListaEmpleados {
    public Vector<Empleado> lista;
    public double totalNómina = 0;

    public ListaEmpleados() {
        lista = new Vector<>();
    }

    public void agregarEmpleado(Empleado a) {
        lista.add(a);
    }

    public double calcularTotalNómina() {
        totalNómina = 0; // Reset total payroll before calculation
        for (Empleado e : lista) {
            totalNómina += e.calcularNómina();
        }
        return totalNómina;
    }

    public String[][] obtenerMatriz() {
        String[][] datos = new String[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            Empleado e = lista.elementAt(i);
            datos[i][0] = e.getNombre();
            datos[i][1] = e.getApellidos();
            datos[i][2] = Double.toString(e.calcularNómina());
        }
        return datos;
    }

    public String convertirTexto() {
        StringBuilder texto = new StringBuilder();
        for (Empleado e : lista) {
            texto.append("Nombre = ").append(e.getNombre()).append("\n")
                .append("Apellidos = ").append(e.getApellidos()).append("\n")
                .append("Cargo = ").append(e.getCargo()).append("\n")
                .append("Género = ").append(e.getGénero()).append("\n")
                .append("Salario = $").append(e.getSalarioDía()).append("\n")
                .append("Días trabajados = ").append(e.getDíasTrabajados()).append("\n")
                .append("Otros ingresos = $").append(e.getOtrosIngresos()).append("\n")
                .append("Pagos salud = $").append(e.getPagosSalud()).append("\n")
                .append("Aportes pensiones = $").append(e.getAportePensiones()).append("\n---------\n");
        }
        texto.append("Total nómina = $").append(String.format("%.2f", calcularTotalNómina()));
        return texto.toString();
    }
}