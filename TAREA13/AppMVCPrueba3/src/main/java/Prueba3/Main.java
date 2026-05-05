package Prueba3;

import Prueba3.controller.ControladorPrincipal;
import Prueba3.view.VentanaPrincipal;

public class Main {
    static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
    }
}
