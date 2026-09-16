package healthcarepro.profesionales;

import healthcarepro.modelo.EventoMonitoreo;
import healthcarepro.modelo.TipoEvento;
import healthcarepro.Observer.Observador;


public class AndresSuarez implements Observador {

    private final String nombre;

    public AndresSuarez() {
        this.nombre = "Andres Suarez";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo() == TipoEvento.CAMBIO_PRIORIDAD) {

            System.out.println();
            System.out.println(">>> NOTIFICACION PARA ANDRES SUAREZ");
            System.out.println("Profesional: " + nombre);
            System.out.println("Paciente: " + evento.getPaciente());
            System.out.println("Evento: " + evento.getDescripcion());
            System.out.println(
                    "Accion: Coordinar turnos y disponibilidad de camas."
            );
        }
    }

    public String getNombre() {
        return nombre;
    }
}
