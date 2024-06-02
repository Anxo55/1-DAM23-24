package MasEjercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorLongitud extends JFrame {
    private JTextField valorField;
    private JLabel resultadoLabel;

    public ConversorLongitud() {
        setTitle("Convertidor de Longitud");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        JLabel valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);
        JButton convertirAMetrosButton = new JButton("Convertir a Metros");
        JButton convertirACentimetrosButton = new JButton("Convertir a Centímetros");
        resultadoLabel = new JLabel("Resultado:");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel inputPanel = new JPanel();
        inputPanel.add(valorLabel);
        inputPanel.add(valorField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convertirACentimetrosButton);
        buttonPanel.add(convertirAMetrosButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultadoLabel);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(resultPanel);
        add(panel);

        // Añadir funcionalidad a los botones
        convertirACentimetrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirMetrosACentimetros();
            }
        });

        convertirAMetrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirCentimetrosAMetros();
            }
        });
    }

    private void convertirMetrosACentimetros() {
        try {
            double metros = Double.parseDouble(valorField.getText());
            double centimetros = metros * 100;
            resultadoLabel.setText("Resultado: " + centimetros + " cm");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirCentimetrosAMetros() {
        try {
            double centimetros = Double.parseDouble(valorField.getText());
            double metros = centimetros / 100;
            resultadoLabel.setText("Resultado: " + metros + " m");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorLongitud().setVisible(true);
            }
        });
    }
}