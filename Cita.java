import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Cita {
    private String paciente;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = LocalDate.parse(fecha, formatoFecha);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = LocalTime.parse(hora, formatoHora);
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatoFecha);
    }

    public String getHora() {
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        return hora.format(formatoHora);
    }
}
