package globalmarket;

import java.util.Scanner;

import globalmarket.modelo.Orden;
import globalmarket.strategy.EnvioEconomico;
import globalmarket.strategy.EnvioExpress;
import globalmarket.strategy.EnvioEcologico;
import globalmarket.strategy.EnvioCasillero;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       GLOBAL MARKET - ENVIOS");
        System.out.println("======================================");

        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese la ciudad de destino: ");
        String destino = scanner.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la distancia al centro de distribucion en km: ");
        double distancia = scanner.nextDouble();

        Orden orden = new Orden(
                cliente,
                destino,
                valorCompra,
                peso,
                distancia
        );

        int opcion;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("       MODALIDADES DE ENVIO");
            System.out.println("======================================");
            System.out.println("1. Envio economico");
            System.out.println("2. Envio express");
            System.out.println("3. Envio ecologico");
            System.out.println("4. Envio por casillero");
            System.out.println("5. Confirmar compra");
            System.out.println("======================================");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    orden.cambiarEstrategia(new EnvioEconomico());
                    System.out.println("Envio economico seleccionado");
                    System.out.printf("Costo de envio: %.2f%n",
                            orden.calcularEnvio());
                    break;

                case 2:
                    orden.cambiarEstrategia(new EnvioExpress());
                    System.out.println("Envio express seleccionado");
                    System.out.printf("Costo de envio: %.2f%n",
                            orden.calcularEnvio());
                    break;

                case 3:
                    orden.cambiarEstrategia(new EnvioEcologico());
                    System.out.println("Envio ecologico seleccionado");
                    System.out.printf("Costo de envio: %.2f%n",
                            orden.calcularEnvio());
                    break;

                case 4:
                    orden.cambiarEstrategia(new EnvioCasillero());
                    System.out.println("Envio por casillero seleccionado");
                    System.out.printf("Costo de envio: %.2f%n",
                            orden.calcularEnvio());
                    break;

                case 5:

                    if (orden.tieneEstrategia()) {

                        double costoEnvio = orden.calcularEnvio();
                        double total = valorCompra + costoEnvio;

                        System.out.println();
                        System.out.println("======================================");
                        System.out.println("       RESUMEN DE LA COMPRA");
                        System.out.println("======================================");

                        System.out.println("Cliente: " + cliente);
                        System.out.println("Destino: " + destino);

                        System.out.printf(
                                "Valor de compra: %.2f%n",
                                valorCompra
                        );

                        System.out.printf(
                                "Peso: %.2f kg%n",
                                peso
                        );

                        System.out.printf(
                                "Distancia: %.2f km%n",
                                distancia
                        );

                        System.out.printf(
                                "Costo de envio: %.2f%n",
                                costoEnvio
                        );

                        System.out.printf(
                                "Total de la compra: %.2f%n",
                                total
                        );

                        System.out.println("======================================");
                        System.out.println("Compra confirmada");

                    } else {

                        System.out.println(
                                "Debe seleccionar una modalidad de envio"
                        );

                        opcion = 0;
                    }

                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
