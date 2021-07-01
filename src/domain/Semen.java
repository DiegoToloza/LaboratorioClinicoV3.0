package domain;

import excepciones.PorRangoException;

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
        setConcentracion(concentracion);
        setGlobulosBlancos(globulosBlancos);
        setVitalidad(vitalidad);
        this.idPaciente = idPaciente;
    }

    public double getVolumen() {
        return this.volumen;
    }

    public void setVolumen(double volumen) {
        if(volumen < 0){
            throw new PorRangoException();
        }
        this.volumen = volumen;
    }

    public double getConcentracion() {
        return this.concentracion;
    }

    public void setConcentracion(double concentracion) {
        if(concentracion < 0){
            throw new PorRangoException();
        }
        this.concentracion = concentracion;
    }

    public double getGlobulosBlancos() {
        return this.globulosBlancos;
    }

    public void setGlobulosBlancos(double globulosBlancos) {
        if(globulosBlancos < 0){
            throw new PorRangoException();
        }
        this.globulosBlancos = globulosBlancos;
    }

    public int getVitalidad() {
        return this.vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        if(vitalidad < 0 || vitalidad > 100){
            throw new PorRangoException();
        }
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
