
package globalmarket.modelo;
import globalmarket.strategy.EstrategiaEnvio;
public class Orden {
private String cliente;
private String destino;
private double valorCompra;
private double peso;
private double distancia;

private EstrategiaEnvio estrategiaEnvio;

public Orden(
        String cliente,
        String destino,
        double valorCompra,
        double peso,
        double distancia) {

    this.cliente = cliente;
    this.destino = destino;
    this.valorCompra = valorCompra;
    this.peso = peso;
    this.distancia = distancia;
}

public void cambiarEstrategia(EstrategiaEnvio estrategiaEnvio) {
    this.estrategiaEnvio = estrategiaEnvio;
}

public double calcularEnvio() {

    if (estrategiaEnvio == null) {
        throw new IllegalStateException(
                "No se ha seleccionado una estrategia de envio"
        );
    }

    return estrategiaEnvio.calcularEnvio(
            valorCompra,
            peso,
            distancia
    );
}

public boolean tieneEstrategia() {
    return estrategiaEnvio != null;
}


}

