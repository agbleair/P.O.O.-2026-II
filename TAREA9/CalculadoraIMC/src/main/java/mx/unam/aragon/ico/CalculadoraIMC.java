package mx.unam.aragon.ico;

import lombok.Data;

public @Data class CalculadoraIMC {
    private double peso;
    private double altura;
    private double imc;

    public void calcularIMC(){
        this.imc= this.peso / (this.altura * this.altura);
    }
}
