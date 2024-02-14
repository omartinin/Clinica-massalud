class Cita {
    private String paciente;
    private String fecha;
    private String hora;

    public Cita(String paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
