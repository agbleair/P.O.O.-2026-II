package mx.unam.aragon.ico;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends Frame {
    TextField peso, altura;
    Button calcularIMC = new Button("Calcular IMC");
    FlowLayout layout;
    CalculadoraIMC calculadoraIMC;
    Label resultado;

    public Ventana(){

    }

    public Ventana(String titulo){
        super(titulo);
        setSize(700,700);
        setBackground(new Color(220, 255, 220));
        calculadoraIMC = new CalculadoraIMC();

        layout = new FlowLayout();
        this.setLayout(new FlowLayout());

        add(new Label("Peso (kg): "));
        peso = new TextField(10); //
        add(peso);
        peso.setBackground(Color.WHITE);

        add(new Label("Altura (m): "));
        altura = new TextField(10);
        add(altura);
        altura.setBackground(Color.WHITE);

        add(calcularIMC);
        calcularIMC.setBackground(new Color(60,179,113));
        resultado = new Label("IMC:");
        add(resultado);

        calcularIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double p = Double.parseDouble(peso.getText());
                    double a = Double.parseDouble(altura.getText()); //similar a valueOf, funciona mejor para calculos

                    calculadoraIMC.setPeso(p);
                    calculadoraIMC.setAltura(a);
                    calculadoraIMC.calcularIMC();

                    resultado.setText("IMC: " + calculadoraIMC.getImc());
                    calculadoraIMC.interpretarDatos(); // imprime clasificación en consola
                } catch (Exception ex) {
                    resultado.setText("Datos no válidos");
                }

            }
        });


        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
        );
    }
}
