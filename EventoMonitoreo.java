package healthcarepro.modelo;

public class EventoMonitoreo {

    private TipoEvento tipo;
    private String paciente;
    private String descripcion;

    public EventoMonitoreo(
            TipoEvento tipo,
            String paciente,
            String descripcion) {

        this.tipo = tipo;
        this.paciente = paciente;
        this.descripcion = descripcion;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + " | Paciente: " + paciente
                + " | " + descripcion;
    }
}