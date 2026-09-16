package globalmarket.strategy;

public class EnvioEconomico implements EstrategiaEnvio {

@Override
public double calcularEnvio(
        double valorCompra,
        double peso,
        double distancia) {

    return 5 + (peso * 0.50);
}


}