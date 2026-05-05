package mx.unam.aragon.ico;

import mx.unam.aragon.ico.controller.ControladorPrincipal;
import mx.unam.aragon.ico.view.VentanaPrincipal;

public class Main {
    static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
    }
}
