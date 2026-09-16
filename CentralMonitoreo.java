package healthcarepro.central;

import healthcarepro.modelo.EventoMonitoreo;
import healthcarepro.Observer.Observador;

import java.util.ArrayList;
import java.util.List;

public class CentralMonitoreo {

    private final List<Observador> observadores;

    public CentralMonitoreo() {
        observadores = new ArrayList<>();
    }

    public void suscribir(Observador observador) {

        if (observador == null) {
            return;
        }

        if (!observadores.contains(observador)) {
            observadores.add(observador);

            System.out.println(
                    "==CENTRAL== Profesional suscrito correctamente."
            );
        }
    }

   
    public void desuscribir(Observador observador) {

        if (observador == null) {
            return;
        }

        if (observadores.remove(observador)) {

            System.out.println(
                    "==CENTRAL== Profesional desuscrito correctamente."
            );
        }
    }

    private void notificar(EventoMonitoreo evento) {

        for (Observador observador : observadores) {
            observador.actualizar(evento);
        }
    }

    public void registrarEvento(EventoMonitoreo evento) {

        System.out.println();
        System.out.println("==========================================");
        System.out.println(" NUEVO EVENTO EN CENTRAL DE MONITOREO");
        System.out.println("==========================================");
        System.out.println(evento);

        notificar(evento);
    }

    public int cantidadSuscritos() {
        return observadores.size();
    }
}
