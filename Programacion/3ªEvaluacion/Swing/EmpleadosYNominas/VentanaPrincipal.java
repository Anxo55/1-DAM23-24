package Swing.EmpleadosYNominas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    ListaEmpleados empleados;
    private JMenuBar barraMenu;
    private JMenu menuOpciones;
    private JMenuItem itemMenu1;
    private JMenuItem itemMenu2;
    private JMenuItem itemMenu3;

    public VentanaPrincipal() {
        empleados = new ListaEmpleados();
        inicio();
        setTitle("Nómina");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        barraMenu = new JMenuBar();
        menuOpciones = new JMenu("Menú");
        itemMenu1 = new JMenuItem("Agregar empleado");
        itemMenu2 = new JMenuItem("Calcular nómina");
        itemMenu3 = new JMenuItem("Guardar archivo");

        menuOpciones.add(itemMenu1);
        menuOpciones.add(itemMenu2);
        menuOpciones.add(new JSeparator());
        menuOpciones.add(itemMenu3);
        barraMenu.add(menuOpciones);
        setJMenuBar(barraMenu);

        itemMenu1.addActionListener(this);
        itemMenu2.addActionListener(this);
        itemMenu3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == itemMenu1) {
            VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
            ventanaAgregar.setVisible(true);
        }
        if (evento.getSource() == itemMenu2) {
            VentanaNomina ventanaNomina = new VentanaNomina(empleados);
            ventanaNomina.setVisible(true);
        }
        if (evento.getSource() == itemMenu3) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int respuesta = fc.showOpenDialog(this);
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                File directorioElegido = fc.getSelectedFile();
                String nombre = directorioElegido.getAbsolutePath();
                try {
                    String contenido = empleados.convertirTexto();
                    File file = new File(nombre + "\\Nomina.txt");
                    file.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                        bw.write(contenido);
                    }
                    String texto = "El archivo de la nómina Nomina.txt se ha creado en " + nombre;
                    JOptionPane.showMessageDialog(this, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
