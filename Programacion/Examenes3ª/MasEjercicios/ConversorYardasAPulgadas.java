package MasEjercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorYardasAPulgadas extends JFrame {
    private JTextField valorField;
    private JLabel resultadoLabel;

    public ConversorYardasAPulgadas() {
        setTitle("Convertidor de Longitud: Yardas a Pulgadas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        JLabel valorLabel = new JLabel("Yardas:");
        valorField = new JTextField(10);
        JButton yardasAPulgadasButton = new JButton("Yardas a Pulgadas");
        JButton pulgadasAYardasButton = new JButton("Pulgadas a Yardas");
        resultadoLabel = new JLabel("Resultado:");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel inputPanel = new JPanel();
        inputPanel.add(valorLabel);
        inputPanel.add(valorField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yardasAPulgadasButton);
        buttonPanel.add(pulgadasAYardasButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultadoLabel);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(resultPanel);
        add(panel);

        // Añadir funcionalidad al botón de conversión de yardas a pulgadas
        yardasAPulgadasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirYardasAPulgadas();
            }
        });

        // Añadir funcionalidad al botón de conversión de pulgadas a yardas
        pulgadasAYardasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirPulgadasAYardas();
            }
        });
    }

    private void convertirYardasAPulgadas() {
        try {
            double yardas = Double.parseDouble(valorField.getText());
            double pulgadas = yardas * 36;
            resultadoLabel.setText("Resultado: " + pulgadas + " pulgadas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirPulgadasAYardas() {
        try {
            double pulgadas = Double.parseDouble(valorField.getText());
            double yardas = pulgadas / 36;
            resultadoLabel.setText("Resultado: " + yardas + " yardas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorYardasAPulgadas().setVisible(true);
            }
        });
    }
}