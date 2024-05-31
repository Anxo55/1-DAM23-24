package Swing.Practica3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JButton botonCilindro;
    private JButton botonEsfera;
    private JButton botonPiramide;
    private JButton botonCono;

    public VentanaPrincipal() {
        inicio();
        setTitle("Seleccionar Figura Geométrica");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        Container contenedor = getContentPane();
        contenedor.setLayout(null);

        botonCilindro = new JButton("Cilindro");
        botonCilindro.setBounds(50, 20, 200, 30);
        botonCilindro.addActionListener(this);

        botonEsfera = new JButton("Esfera");
        botonEsfera.setBounds(50, 60, 200, 30);
        botonEsfera.addActionListener(this);

        botonPiramide = new JButton("Pirámide");
        botonPiramide.setBounds(50, 100, 200, 30);
        botonPiramide.addActionListener(this);

        botonCono = new JButton("Cono");
        botonCono.setBounds(50, 140, 200, 30);
        botonCono.addActionListener(this);

        contenedor.add(botonCilindro);
        contenedor.add(botonEsfera);
        contenedor.add(botonPiramide);
        contenedor.add(botonCono);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        } else if (e.getSource() == botonEsfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        } else if (e.getSource() == botonPiramide) {
            VentanaPirámide ventanaPiramide = new VentanaPirámide();
            ventanaPiramide.setVisible(true);
        } else if (e.getSource() == botonCono) {
            VentanaCono ventanaCono = new VentanaCono();
            ventanaCono.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}