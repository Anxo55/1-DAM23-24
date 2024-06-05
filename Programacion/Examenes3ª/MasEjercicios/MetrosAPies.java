package MasEjercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetrosAPies extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton toFeetButton;
    private JButton toMetersButton;

    public MetrosAPies() {
        setTitle("Conversión entre Metros y Pies");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear componentes
        inputField = new JTextField();
        outputField = new JTextField();
        outputField.setEditable(false); // Campo de salida solo lectura
        toFeetButton = new JButton("Convertir a Pies");
        toMetersButton = new JButton("Convertir a Metros");

        // Crear paneles
        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        JPanel buttonPanel = new JPanel(new FlowLayout());

        // Añadir componentes al panel de entrada
        inputPanel.add(new JLabel("Introduce el valor:"));
        inputPanel.add(inputField);

        // Añadir botones al panel de botones
        buttonPanel.add(toFeetButton);
        buttonPanel.add(toMetersButton);

        // Añadir paneles a la ventana
        add(inputPanel, BorderLayout.NORTH);
        add(outputField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Añadir manejadores de eventos
        toFeetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertToFeet();
            }
        });

        toMetersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertToMeters();
            }
        });
    }

    private void convertToFeet() {
        try {
            double meters = Double.parseDouble(inputField.getText());
            double feet = meters * 3.28084;
            outputField.setText(String.format("%.2f pies", feet));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido en metros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertToMeters() {
        try {
            double feet = Double.parseDouble(inputField.getText());
            double meters = feet / 3.28084;
            outputField.setText(String.format("%.2f metros", meters));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un número válido en pies.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MetrosAPies().setVisible(true);
            }
        });
    }
}