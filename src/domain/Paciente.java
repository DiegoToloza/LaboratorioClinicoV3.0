package domain;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import test.*;

public class Paciente extends Persona {
    private int idPaciente;
    private String telefono;
    private String correoElectronico;
    private List<IMuestraGenerica> muestrasPaciente;
    
    public Paciente(){
        muestrasPaciente = new ArrayList<>();
    }
    
    public Paciente(int idPaciente){
        this.idPaciente = idPaciente;
        muestrasPaciente = new ArrayList<>();
    }

    public Paciente(String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        muestrasPaciente = new ArrayList<>();
    }

    public Paciente(int idPaciente, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.idPaciente = idPaciente;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        muestrasPaciente = new ArrayList<>();
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
    
    public void agregarMuestra(IMuestraGenerica muestra){
        muestrasPaciente.add(muestra);
    }

    public List<IMuestraGenerica> getMuestrasPaciente() {
        return muestrasPaciente;
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
