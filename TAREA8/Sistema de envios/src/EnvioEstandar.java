public class EnvioEstandar implements Envio{
    public static final float TARIFA_POR_KG = 10;

    @Override
    public float calcularCostoEnvio(double peso){
        if (peso<=0){
            System.out.println("Información no válida");
            return 0;
        }
        return (float)peso * TARIFA_POR_KG;
    }
}


