package Prueba2;

import Prueba2.controller.ControladorPrincipal;
import Prueba2.view.VentanaPrincipal;

public class Main {
    static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
    }
}
