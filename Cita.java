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

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}
