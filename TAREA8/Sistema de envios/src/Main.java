public class Main {
    static void main(String[] args) {
        EnvioEstandar enviostd = new EnvioEstandar();
        System.out.println("Costo de envío estándar: " + enviostd.calcularCostoEnvio(6.5));

        EnvioInternacional envioww = new EnvioInternacional();
        System.out.println("Costo de envío internacional: " + envioww.calcularCostoEnvio(2.6));
    }
}
