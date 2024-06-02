package MasEjercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorYardasAPies extends JFrame {
    private JTextField valorField;
    private JLabel resultadoLabel;

    public ConversorYardasAPies() {
        setTitle("Convertidor de Longitud: Yardas a Pies");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        JLabel valorLabel = new JLabel("Yardas:");
        valorField = new JTextField(10);
        JButton yardasAPiesButton = new JButton("Yardas a Pies");
        JButton piesAYardasButton = new JButton("Pies a Yardas");
        resultadoLabel = new JLabel("Resultado:");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel inputPanel = new JPanel();
        inputPanel.add(valorLabel);
        inputPanel.add(valorField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yardasAPiesButton);
        buttonPanel.add(piesAYardasButton);
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultadoLabel);

        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(resultPanel);
        add(panel);

        // Añadir funcionalidad al botón de conversión de yardas a pies
        yardasAPiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirYardasAPies();
            }
        });

        // Añadir funcionalidad al botón de conversión de pies a yardas
        piesAYardasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirPiesAYardas();
            }
        });
    }

    private void convertirYardasAPies() {
        try {
            double yardas = Double.parseDouble(valorField.getText());
            double pies = yardas * 3;
            resultadoLabel.setText("Resultado: " + pies + " pies");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertirPiesAYardas() {
        try {
            double pies = Double.parseDouble(valorField.getText());
            double yardas = pies / 3;
            resultadoLabel.setText("Resultado: " + yardas + " yardas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorYardasAPies().setVisible(true);
            }
        });
    }
}