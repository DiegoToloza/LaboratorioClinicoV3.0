package domain;

public class Medico extends Persona {
    
    
    private String especializacion;
    private String telefono;
    private String correoElectronico;
    private ColeccionPersonas pacientes;
    
    public Medico(){
        super();
    }
    
    public Medico(int idMedico){
        super(idMedico);
    }

    public Medico(String especializacion, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        setEspecializacion(especializacion);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
    }
    
    

    public Medico(int idMedico, String especializacion, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad,idMedico);
        setEspecializacion(especializacion);
        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
    }

    public String getEspecializacion() {
        return this.especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", especializacion = ").append(especializacion);
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
    
    public Paciente obtenerPaciente(int idPaciente) {
        return (Paciente) pacientes.obtener(idPaciente);
    }
    
    public void agregarPaciente(Paciente paciente) {
        pacientes.agregar(paciente);
    }
    
    public void eliminarPaciente(int idPaciente) {
        pacientes.eliminar(idPaciente);
    }
    
    public void modificarPaciente(Paciente paciente, int idPaciente) {
        pacientes.modificar(idPaciente, paciente);
    }
    
    
}
