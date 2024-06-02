package ModeloB.Ejercicio3B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMoneda extends JFrame implements ActionListener {
    private JLabel lblCantidad;
    private JTextField txtCantidad;
    private JButton btnALibras;
    private JButton btnAEuros;
    private JLabel lblResultado;

    public ConversorMoneda() {
        setTitle("Conversor de Moneda");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para la entrada de datos
        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new FlowLayout());

        lblCantidad = new JLabel("Cantidad:");
        txtCantidad = new JTextField(10);

        panelEntrada.add(lblCantidad);
        panelEntrada.add(txtCantidad);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2));

        btnALibras = new JButton("A Libras");
        btnAEuros = new JButton("A Euros");

        btnALibras.addActionListener(this);
        btnAEuros.addActionListener(this);

        btnALibras.setPreferredSize(new Dimension(100, 30)); // Ajustar tamaño de los botones
        btnAEuros.setPreferredSize(new Dimension(100, 30));

        panelBotones.add(btnALibras);
        panelBotones.add(btnAEuros);

        // Panel para el resultado
        JPanel panelResultado = new JPanel();
        panelResultado.setLayout(new FlowLayout());

        lblResultado = new JLabel();
        panelResultado.add(lblResultado);

        // Agregar paneles al marco
        add(panelEntrada, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(panelResultado, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnALibras) {
            convertirALibras();
        } else if (e.getSource() == btnAEuros) {
            convertirAEuros();
        }
    }

    private void convertirALibras() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double resultado = cantidad * 0.86; // Tasa de conversión de euros a libras
            lblResultado.setText("Esta cantidad en libras es: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirAEuros() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText());
            double resultado = cantidad * 1.16; // Tasa de conversión de libras a euros
            lblResultado.setText("Esta cantidad en euros es: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ConversorMoneda conversor = new ConversorMoneda();
                conversor.setVisible(true);
            }
        });
    }
}