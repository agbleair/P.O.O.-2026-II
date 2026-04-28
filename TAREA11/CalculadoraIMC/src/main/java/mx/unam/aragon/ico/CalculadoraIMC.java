package mx.unam.aragon.ico;

import lombok.Data;

public @Data class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;

    public void calcularIMC(){
        this.imc= this.peso / (this.altura * this.altura);
    }
     public void interpretarDatos(){
         if (imc < 18.5) {
             System.out.println("Clasificación: Bajo peso");
         } else if (imc < 25) {
             System.out.println("Clasificación: Normal");
         } else if (imc < 30) {
             System.out.println("Clasificación: Sobrepeso");
         } else {
             System.out.println("Clasificación: Obesidad");
         }
     }
}
