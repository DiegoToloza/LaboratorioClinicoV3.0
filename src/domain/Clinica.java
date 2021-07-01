package domain;

public class Clinica {
    
    ColeccionPersonas paciente;
    ColeccionPersonas medico;
    
    
    public Clinica() {
        paciente = new ColeccionPersonas();
        medico = new ColeccionPersonas();
    }
}
