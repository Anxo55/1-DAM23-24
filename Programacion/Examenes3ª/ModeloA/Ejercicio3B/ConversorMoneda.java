package ModeloA.Ejercicio3B;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ConversorMoneda extends JFrame {
    private JTextField campoCantidad;
    private JButton botonAEuros;
    private JButton botonADolares;
    private JLabel etiquetaCantidad;
    private JLabel etiquetaResultado;

    private static final double TASA_EURO_A_DOLAR = 1.10; // Ejemplo de tasa de conversión
    private static final double TASA_DOLAR_A_EURO = 0.91; // Ejemplo de tasa de conversión

    public ConversorMoneda() {
        setTitle("Conversor de Moneda");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar el layout
        setLayout(new GridLayout(5, 1));

        // Crear componentes
        etiquetaCantidad = new JLabel("Introduce la cantidad:", SwingConstants.CENTER);
        campoCantidad = new JTextField();
        etiquetaResultado = new JLabel("", SwingConstants.CENTER);
        botonAEuros = new JButton("A Euros");
        botonADolares = new JButton("A Dólares");

        // Añadir componentes a la ventana
        add(etiquetaCantidad);
        add(campoCantidad);
        add(etiquetaResultado);
        add(botonADolares);
        add(botonAEuros);

        // Añadir funcionalidad a los botones
        botonAEuros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirAEuros();
            }
        });

        botonADolares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirADolares();
            }
        });
    }

    private void convertirAEuros() {
        try {
            double cantidad = Double.parseDouble(campoCantidad.getText());
            double resultado = cantidad * TASA_DOLAR_A_EURO;
            etiquetaResultado.setText("Cantidad en euros: " + String.format("%.2f", resultado));
        } catch (NumberFormatException e) {
            etiquetaResultado.setText("Por favor, introduce una cantidad válida.");
        }
    }

    private void convertirADolares() {
        try {
            double cantidad = Double.parseDouble(campoCantidad.getText());
            double resultado = cantidad * TASA_EURO_A_DOLAR;
            etiquetaResultado.setText("Cantidad en dólares: " + String.format("%.2f", resultado));
        } catch (NumberFormatException e) {
            etiquetaResultado.setText("Por favor, introduce una cantidad válida.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorMoneda().setVisible(true);
            }
        });
    }
}