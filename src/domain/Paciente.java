package domain;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {

    private int idPaciente;
    private String telefono;
    private String correoElectronico;
    private int idMedico;
    private List<IMuestraGenerica> muestras;

    public Paciente() {
        this.muestras = new ArrayList<>();
    }

    public Paciente(int idPaciente) {
        this.idPaciente = idPaciente;
        this.muestras = new ArrayList<>();
    }

    public Paciente(String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad, int idMedico) {
        super(nombre, edad, genero, nacionalidad);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idMedico = idMedico;
        this.muestras = new ArrayList<>();
    }

    public Paciente(int idPaciente, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad, int idMedico) {
        super(nombre, edad, genero, nacionalidad);
        this.idPaciente = idPaciente;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idMedico = idMedico;
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

    public void setMuestras(List<IMuestraGenerica> muestras) {
        this.muestras = muestras;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public List<IMuestraGenerica> getMuestras() {
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

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getNacionalidad() {
        return this.nacionalidad;
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
