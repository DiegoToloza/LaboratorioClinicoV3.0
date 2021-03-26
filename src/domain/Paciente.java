package domain;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private int idPaciente;
    private String telefono;
    private String correoElectronico;
    private List<IMuestraGenerica> muestras;
    
    public Paciente(){
        this.muestras = new ArrayList<>();
    }
    
    public Paciente(int idPaciente){
        this.idPaciente = idPaciente;
        this.muestras = new ArrayList<>();
    }

    public Paciente(String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.muestras = new ArrayList<>();
    }

    public Paciente(int idPaciente, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.idPaciente = idPaciente;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.muestras = new ArrayList<>();
    }

    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public void setMuestras(List<IMuestraGenerica> muestras){
        this.muestras = muestras;
    }
    
    public List<IMuestraGenerica> getMuestras(){
        return this.muestras;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{idPaciente = ").append(idPaciente);
        sb.append(", telefono = ").append(telefono);
        sb.append(", correoElectronico = ").append(correoElectronico);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
