package healthcarepro.profesionales;

import healthcarepro.modelo.EventoMonitoreo;
import healthcarepro.modelo.TipoEvento;
import healthcarepro.Observer.Observador;

public class MartaGomez implements Observador {

    private final String nombre;

    public MartaGomez() {
        this.nombre = "Marta Gomez";
    }

    @Override
    public void actualizar(EventoMonitoreo evento) {

        if (evento.getTipo() == TipoEvento.LABORATORIO_URGENTE) {

            System.out.println();
            System.out.println(">>> NOTIFICACION PARA MARTA GOMEZ");
            System.out.println("Profesional: " + nombre);
            System.out.println("Paciente: " + evento.getPaciente());
            System.out.println("Evento: " + evento.getDescripcion());
            System.out.println(
                    "Accion: Coordinar toma de muestras urgente."
            );
        }
    }

    public String getNombre() {
        return nombre;
    }
}

