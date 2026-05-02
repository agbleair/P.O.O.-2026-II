package mx.unam.aragon.ico.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;


    public VentanaSwing(){
        super("Mi primer ventana swing");
        this.getContentPane().setLayout(new GridLayout(3,3));
        etiqueta = new JLabel("Dame un número");
        entrada = new JTextField(10);
        boton = new JButton("Enviar");

        boton.setForeground(new Color(255, 133, 206, 255));
        boton.setBackground(new Color(117, 255, 103));
        etiqueta.setForeground(new Color(181, 120, 255));
        etiqueta.setOpaque(true);

        getContentPane().add(etiqueta,0);
        getContentPane().add(entrada, 1);
        getContentPane().add(boton, 2);


        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelsius = Double.parseDouble(entrada.getText());
                double gradosFarenheit = (entradaCelsius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "El grado Farenheit es: "+ gradosFarenheit);
            }
        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el clic en el cuadro de diálogo");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el keyTyped desde la entrada");
                System.out.println(e.getComponent());
                System.out.println("Codigo de tecla: " +  e.getKeyCode());
            }
        });
    }
}
