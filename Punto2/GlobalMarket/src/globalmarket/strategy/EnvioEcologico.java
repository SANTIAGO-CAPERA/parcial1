package globalmarket.strategy;

public class EnvioEcologico implements EstrategiaEnvio {

@Override
public double calcularEnvio(
        double valorCompra,
        double peso,
        double distancia) {

    return 8 + (peso * 0.70) + (distancia * 0.02);
}


}