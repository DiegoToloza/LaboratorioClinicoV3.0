package domain;

public class Semen implements IMuestraGenerica {
    private double volumen;
    private double concentracion;
    private double globulosBlancos;
    private int vitalidad;
    private int idPaciente;
    
    public Semen(){
        
    }

    public Semen(double volumen, double concentracion, double globulosBlancos, int vitalidad, int idPaciente) {
        this.volumen = volumen;
        this.concentracion = concentracion;
        this.globulosBlancos = globulosBlancos;
        this.vitalidad = vitalidad;
        this.idPaciente = idPaciente;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getConcentracion() {
        return this.concentracion;
    }

    public void setConcentracion(double concentracion) {
        this.concentracion = concentracion;
    }

    public double getGlobulosBlancos() {
        return this.globulosBlancos;
    }

    public void setGlobulosBlancos(double globulosBlancos) {
        this.globulosBlancos = globulosBlancos;
    }

    public int getVitalidad() {
        return this.vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    
    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    @Override
    public String escribir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semen{volumen = ").append(volumen);
        sb.append(", concentracion = ").append(concentracion);
        sb.append(", globulosBlancos = ").append(globulosBlancos);
        sb.append(", vitalidad = ").append(vitalidad);
        sb.append(", idPaciente = ").append(idPaciente);
        sb.append('}');
        return sb.toString();   
    }
}
