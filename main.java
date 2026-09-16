package healthcarepro;

import healthcarepro.central.CentralMonitoreo;
import healthcarepro.modelo.EventoMonitoreo;
import healthcarepro.modelo.TipoEvento;
import healthcarepro.profesionales.AndresSuarez;
import healthcarepro.profesionales.ElenaRamos;
import healthcarepro.profesionales.MartaGomez;

public class main {

    public static void main(String[] args) {
        System.out.println("=======================================================================INICIO=======================================================================");
        CentralMonitoreo central = new CentralMonitoreo();

        ElenaRamos elena = new ElenaRamos();
        AndresSuarez andres = new AndresSuarez();
        MartaGomez marta = new MartaGomez();

        central.suscribir(elena);
        central.suscribir(andres);
        central.suscribir(marta);

        System.out.println("=== PROFESIONALES SUSCRITOS ===");
        System.out.println("Total: " + central.cantidadSuscritos());

        EventoMonitoreo evento1 = new EventoMonitoreo(
                TipoEvento.SIGNOS_VITALES_CRITICOS,
                "Paciente 1",
                "Saturacion baja"
        );

        central.registrarEvento(evento1);

        EventoMonitoreo evento2 = new EventoMonitoreo(
                TipoEvento.CAMBIO_PRIORIDAD,
                "Paciente 2",
                "Cambio a codigo rojo"
        );

        central.registrarEvento(evento2);

        EventoMonitoreo evento3 = new EventoMonitoreo(
                TipoEvento.LABORATORIO_URGENTE,
                "Paciente 3",
                "Examen de laboratorio urgente"
        );

        central.registrarEvento(evento3);

    
        System.out.println();
        System.out.println("=== ELENA SE DESUSCRIBE ===");

        central.desuscribir(elena);

        EventoMonitoreo evento4 = new EventoMonitoreo(
                TipoEvento.SIGNOS_VITALES_CRITICOS,
                "Paciente 4",
                "Presion arterial baja"
        );

        central.registrarEvento(evento4);

        System.out.println();
        System.out.println("=======================================================================FIN =======================================================================");
    }
}