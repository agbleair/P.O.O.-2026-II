public class EnvioExpress implements Envio{
    public static final int TARIFA_POR_KG = 20;

    @Override
    public float calcularCostoEnvio(double peso){
        if (peso<=0){
            System.out.println("Información no válida");
            return 0;
        }
        return (float)peso * TARIFA_POR_KG;
    }
}
