package globalmarket.strategy;

public class EnvioCasillero implements EstrategiaEnvio {

@Override
public double calcularEnvio(
        double valorCompra,
        double peso,
        double distancia) {

    return 10 + (distancia * 0.10);
}


}