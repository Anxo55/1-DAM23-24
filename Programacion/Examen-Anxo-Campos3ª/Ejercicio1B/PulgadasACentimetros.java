package Ejercicio1B;

// Preparar una GUI que recoja en dos cajas dos números enteros (pies y
//  pulgadas) y al pulsar un botón CONVERTIR realizará la operación de
//  conversión de dichos valores a cm y su suma, que se colocara en un
//  label para mostrar el resultado de dicha operación.
//  Ejemplo 5 pies 11 pulgadas son 180,34 cm.
//  5 por 30,48 cm + 11 por 2,54 cm = 152,4 + 27,94 = 180,34 cm

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PulgadasACentimetros {
    private JFrame frame;
    private JTextField piesTextField;
    private JTextField pulgadasTextField;
    private JLabel resultadoLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                PulgadasACentimetros window = new PulgadasACentimetros();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public PulgadasACentimetros() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Pulgadas a CM");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JLabel piesLabel = new JLabel("Pies:");
        frame.getContentPane().add(piesLabel);

        piesTextField = new JTextField();
        piesTextField.setColumns(10);
        frame.getContentPane().add(piesTextField);

        JLabel pulgadasLabel = new JLabel("Pulgadas:");
        frame.getContentPane().add(pulgadasLabel);

        pulgadasTextField = new JTextField();
        pulgadasTextField.setColumns(10);
        frame.getContentPane().add(pulgadasTextField);

        JButton convertButton = new JButton("Convertir");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });
        frame.getContentPane().add(convertButton);

        resultadoLabel = new JLabel("");
        frame.getContentPane().add(resultadoLabel);
    }

    private void convert() {
        try {
            int pies = Integer.parseInt(piesTextField.getText());
            int pulgadas = Integer.parseInt(pulgadasTextField.getText());

            if (pulgadas > 11) {
                JOptionPane.showMessageDialog(frame, "Número de pulgadas inválido. Máximo 11.");
                return;
            }

            double centimetrosPies = pies * 12 * 2.54;
            double centimetrosPulgadas = pulgadas * 2.54;
            double totalCentimetros = centimetrosPies + centimetrosPulgadas;

            resultadoLabel.setText(String.format("%d pies y %d pulgadas son %.2f cm.", pies, pulgadas, totalCentimetros));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, introduzca números enteros.");
        }
    }
}
