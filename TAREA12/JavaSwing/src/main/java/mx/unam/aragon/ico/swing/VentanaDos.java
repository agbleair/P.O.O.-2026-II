package mx.unam.aragon.ico.swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {

    GridLayout layout = new GridLayout();
    private JPanel  panel1 = new JPanel();
    private JPanel  panel2 = new JPanel();
    private JPanel  panel3 = new JPanel();
    private JPanel  panel4 = new JPanel();
    private JLabel etiqueta = new JLabel();
    private JButton boton = new JButton();
    private JComboBox<String> caja;

    public VentanaDos(){
        super("Seguynda ventana swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(2,2);

        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        caja = new JComboBox<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Maia");
        nombres.add("yarah");
        nombres.add("Fátima");
        ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        caja.setModel(modelo);

        panel1. setBackground(new Color(222, 157, 255));
        panel2.setBackground(new Color(0xFF87DA));
        panel3.setBackground(new Color(97, 220, 248));
        panel4.setBackground(new Color(253, 241, 132));

        etiqueta = new JLabel("Soy una etiqueta");
        boton = new JButton("Soy un botón");
        panel1.add(etiqueta);
        panel2.add(boton);
        panel3.add(caja);

        getContentPane().add(panel1,0);
        getContentPane().add(panel2, 1);
        getContentPane().add(panel3, 2);
        getContentPane().add(panel4, 3);

        setVisible(true);
        setSize(800,600);
    }
}
