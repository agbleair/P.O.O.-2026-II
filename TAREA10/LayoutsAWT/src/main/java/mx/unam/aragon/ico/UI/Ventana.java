package mx.unam.aragon.ico.UI;

import java.awt.*;

public class Ventana extends Frame {
    Button boton1;
    TextField texto;
    FlowLayout layout;

    public Ventana(){

    }

    public Ventana(String titulo, int ancho, int alto){
        super(titulo);
        setSize(ancho,alto);
        boton1 = new Button("Botón 1");
        texto = new TextField();
        layout = new FlowLayout();
        this.setLayout(new FlowLayout());

        this.add(boton1);
        this.add(texto);

    }
}
