package globalmarket.strategy;

public class EnvioExpress implements EstrategiaEnvio {

@Override
public double calcularEnvio(
        double valorCompra,
        double peso,
        double distancia) {

    return 20 + (peso * 2.00) + (distancia * 0.05);
}


}