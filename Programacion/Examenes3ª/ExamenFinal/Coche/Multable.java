package ExamenFinal.Coche;

public interface Multable {
    int MULTA_MAXIMA = 100;

    String Multa(int cantidad);

    String disminuirMulta(int cantidad);

    String aumentarMulta(int cantidad);
}
