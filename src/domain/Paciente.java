package domain;

import excepciones.*;


public class Paciente extends Persona {

    private String telefono;
    private String correoElectronico;
    private int idMedico;
    private ColeccionMuestras muestras;

    public Paciente() {
        this.muestras = new ColeccionMuestras();
    }

    public Paciente(int idPaciente) {
        super(idPaciente);
        this.muestras = new ColeccionMuestras();
    }

    public Paciente(String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad, int idMedico) {
        super(nombre, edad, genero, nacionalidad);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
        this.idMedico = idMedico;
        this.muestras = new ColeccionMuestras();
    }

    public Paciente(int idPaciente, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad, int idMedico) {
        super(nombre, edad, genero, nacionalidad, idPaciente);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
        this.idMedico = idMedico;
        this.muestras = new ColeccionMuestras();
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono.length() != 8){
            throw new PorTamanioException("8");
        }
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if(correoElectronico.isEmpty()){
            throw new TextoBlancoException();
        } 
        else if(correoElectronico.length() > 40){
            throw new PorTamanioException("40");
        } 
        else if(!correoElectronico.contains("@")){
            throw new CorreoException();
        }
        this.correoElectronico = correoElectronico;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        if(nombre.isEmpty()){
            throw new TextoBlancoException();
        }
        else if(nombre.length() > 40){
            throw new PorTamanioException("40");
        }
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        if (edad < 0 || edad > 123) {
            throw new PorRangoException();
        }
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
        if(nacionalidad.isEmpty()){
            throw new TextoBlancoException();
        }
        else if(nacionalidad.length() > 15){
            throw new PorTamanioException("15");
        }
        this.nacionalidad = nacionalidad;
    }
    
    public IMuestraGenerica obtenerMuestra(int tipoMuestra) {
        return muestras.obtenerMuestra(tipoMuestra);
    }
    
    public void agregarMuestra(IMuestraGenerica muestra, int tipoMuestra ) {
        muestras.agregar(muestra, tipoMuestra);
    }
    
    public void eliminarMuestra(int tipoMuestra) {
        muestras.eliminar(tipoMuestra);
    }
    
    public void modificarMuestra(IMuestraGenerica muestra, int tipoMuestra) {
        muestras.modificar(muestra, tipoMuestra);
    }
}
