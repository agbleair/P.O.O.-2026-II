package Prueba4;

import Prueba4.controller.ControladorPrincipal;
import Prueba4.view.VentanaPrincipal;

public class Main {
    static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(ventanaPrincipal);
    }
}
