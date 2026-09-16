package healthcarepro.profesionales;

import healthcarepro.modelo.EventoMonitoreo;
import healthcarepro.modelo.TipoEvento;
import healthcarepro.Observer.Observador;


public class ElenaRamos implements Observador {

    private final String nombre;

    public ElenaRamos() {
        this.nombre = "Elena Ramos";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo() == TipoEvento.SIGNOS_VITALES_CRITICOS) {

            System.out.println();
            System.out.println(">>> ALERTA PARA ELENA RAMOS");
            System.out.println("Profesional: " + nombre);
            System.out.println("Paciente: " + evento.getPaciente());
            System.out.println("Evento: " + evento.getDescripcion());
            System.out.println("Accion: Intervencion medica inmediata.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
