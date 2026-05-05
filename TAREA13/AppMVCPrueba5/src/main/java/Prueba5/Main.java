package Prueba5;

import Prueba5.controller.ControladorPrincipal;
import Prueba5.view.VentanaPrincipal;

public class Main {
    static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal= new VentanaPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(ventanaPrincipal);
    }
}
