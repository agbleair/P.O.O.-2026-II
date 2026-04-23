package mx.unam.aragon.ico;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingrese su peso");
            calculadoraIMC.setPeso(teclado.nextDouble());
            System.out.println("Ingrese su altura");
            calculadoraIMC.setAltura(teclado.nextDouble());
            calculadoraIMC.calcularIMC();
        } catch (Exception e) {
            System.out.println("Información no válida");
        }
        System.out.println("Su IMC es de: " + calculadoraIMC.getImc());
        calculadoraIMC.interpretarDatos();

    }
}
