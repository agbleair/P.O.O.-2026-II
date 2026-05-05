package mx.unam.aragon.ico.controller;

import mx.unam.aragon.ico.view.VentanaPrincipal;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;

    public ControladorPrincipal(VentanaPrincipal vista){
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getPnlPanel1().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnSaludar()) {
            this.view.getLblSalida().setText("Hola, " + this.view.getTxtNombre().getText());
            System.out.println("Hola desde Fes Aragon");
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
        if(e.getSource() == this.view.getPnlPanel1()){
            this.view.getPnlPanel1().setBackground(new Color(255, 135, 218));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
