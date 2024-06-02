package ExamenFinal.Coche;

public abstract class VehiculoConMulta extends Car implements Multable {
    private int multaActual = 0;

    public VehiculoConMulta(int velocidad, double PrecioNormal, String color) {
        super(velocidad, PrecioNormal, color);
    }

    @Override
    public String Multa(int cantidad) {
        if (cantidad < 0 || cantidad > MULTA_MAXIMA) {
            return "Cantidad inválida";
        }
        this.multaActual = cantidad;
        return "Multa actualizada a: " + this.multaActual;
    }

    @Override
    public String disminuirMulta(int cantidad) {
        if (cantidad < 0) {
            return "Cantidad inválida";
        }
        if (this.multaActual - cantidad < 0) {
            this.multaActual = 0;
            return "Multa no puede ser inferior a 0. Multa actual: 0";
        }
        this.multaActual -= cantidad;
        return "Multa disminuida. Multa actual: " + this.multaActual;
    }

    @Override
    public String aumentarMulta(int cantidad) {
        if (cantidad < 0) {
            return "Cantidad inválida";
        }
        if (this.multaActual + cantidad > MULTA_MAXIMA) {
            this.multaActual = MULTA_MAXIMA;
            return "Multa no puede superar el máximo. Multa actual: " + MULTA_MAXIMA;
        }
        this.multaActual += cantidad;
        return "Multa aumentada. Multa actual: " + this.multaActual;
    }
}