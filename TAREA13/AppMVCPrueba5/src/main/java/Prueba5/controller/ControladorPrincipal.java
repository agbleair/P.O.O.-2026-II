package Prueba5.controller;

import Prueba5.view.VentanaPrincipal;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;

    public ControladorPrincipal(VentanaPrincipal vista){
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource()==this.view.getBtnSaludar()){
            System.out.println("Hola desde el botón saludar");
            this.view.getLblSalida().setText("Hola, "+ this.view.getTxtNombre().getText());
        }
        if(e.getSource()==this.view.getLblNombre()){
            System.out.println("Hola desde la etiqueta");
            this.view.getLblNombre().setForeground(new Color(255, 255, 255));
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
