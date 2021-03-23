package domain;

public class Medico extends Persona {
    
    private int idMedico;
    private String especializacion;
    private String telefono;
    private String correoElectronico;
    
    public Medico(){
        super();
    }
    
    public Medico(int idMedico){
        this.idMedico = idMedico;
    }

    public Medico(String especializacion, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.especializacion = especializacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    

    public Medico(int idMedico, String especializacion, String telefono, String correoElectronico, String nombre, int edad, String genero, String nacionalidad) {
        super(nombre, edad, genero, nacionalidad);
        this.idMedico = idMedico;
        this.especializacion = especializacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdMedico() {
        return this.idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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
        sb.append("Medico{idMedico = ").append(idMedico);
        sb.append(", especializacion = ").append(especializacion);
        sb.append(", telefono = ").append(telefono);
        sb.append(", correoElectronico = ").append(correoElectronico);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
