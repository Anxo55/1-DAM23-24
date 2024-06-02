package MasEjercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorLongitud2 extends JFrame {
    private JTextField valorField;
    private JLabel resultadoLabel;

    public ConversorLongitud2() {
        setTitle("Convertidor de Longitud: Pies a Pulgadas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        JLabel valorLabel = new JLabel("Pies:");
        valorField = new JTextField(10);
        JButton convertirAPulgadasButton = new JButton("Convertir a Pulgadas");
        JButton convertirAPiesButton = new JButton("Convertir a Pies");
        resultadoLabel = new JLabel("Resultado:");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel inputPanel = new JPanel();
        inputPanel.add(valorLabel);
        inputPanel.add(valorField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convertirAPulgadasButton);
        buttonPanel.add(convertirAPiesButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultadoLabel);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(resultPanel);
        add(panel);

        // Añadir funcionalidad a los botones
        convertirAPulgadasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirPiesAPulgadas();
            }
        });

        convertirAPiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirPulgadasAPies();
            }
        });
    }

    private void convertirPiesAPulgadas() {
        try {
            double pies = Double.parseDouble(valorField.getText());
            double pulgadas = pies * 12;
            resultadoLabel.setText("Resultado: " + pulgadas + " pulgadas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirPulgadasAPies() {
        try {
            double pulgadas = Double.parseDouble(valorField.getText());
            double pies = pulgadas / 12;
            resultadoLabel.setText("Resultado: " + pies + " pies");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorLongitud2().setVisible(true);
            }
        });
    }
}