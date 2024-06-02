package MasEjercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorYardasAMetros extends JFrame {
    private JTextField valorField;
    private JLabel resultadoLabel;

    public ConversorYardasAMetros() {
        setTitle("Convertidor de Longitud: Yardas a Metros");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        JLabel valorLabel = new JLabel("Yardas:");
        valorField = new JTextField(10);
        JButton yardasAMetrosButton = new JButton("Yardas a Metros");
        JButton metrosAYardasButton = new JButton("Metros a Yardas");
        resultadoLabel = new JLabel("Resultado:");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel inputPanel = new JPanel();
        inputPanel.add(valorLabel);
        inputPanel.add(valorField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yardasAMetrosButton);
        buttonPanel.add(metrosAYardasButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultadoLabel);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(resultPanel);
        add(panel);

        // Añadir funcionalidad al botón de conversión de yardas a metros
        yardasAMetrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirYardasAMetros();
            }
        });

        // Añadir funcionalidad al botón de conversión de metros a yardas
        metrosAYardasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirMetrosAYardas();
            }
        });
    }

    private void convertirYardasAMetros() {
        try {
            double yardas = Double.parseDouble(valorField.getText());
            double metros = yardas * 0.9144;
            resultadoLabel.setText("Resultado: " + metros + " metros");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirMetrosAYardas() {
        try {
            double metros = Double.parseDouble(valorField.getText());
            double yardas = metros / 0.9144;
            resultadoLabel.setText("Resultado: " + yardas + " yardas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorYardasAMetros().setVisible(true);
            }
        });
    }
}