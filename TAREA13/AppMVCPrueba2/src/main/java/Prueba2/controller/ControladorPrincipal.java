package Prueba2.controller;

import Prueba2.view.VentanaPrincipal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;

    public ControladorPrincipal(VentanaPrincipal vista){
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == this.view.getBtnSaludar()){
            System.out.println("Hola desde fes aragon");
            this.view.getLblSalida().setText("Hola, " + this.view.getTxtNombre().getText());
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
