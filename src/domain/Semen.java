package domain;

public class Semen implements IMuestraGenerica {
    private double volumen;
    private double concentracion;
    private double globulosBlancos;
    private int vitalidad;
    
    public Semen(){
        
    }

    public Semen(double volumen, double concentracion, double globulosBlancos, int vitalidad) {
        this.volumen = volumen;
        this.concentracion = concentracion;
        this.globulosBlancos = globulosBlancos;
        this.vitalidad = vitalidad;
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

    @Override
    public String escribir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semen{volumen = ").append(volumen);
        sb.append(", concentracion = ").append(concentracion);
        sb.append(", globulosBlancos = ").append(globulosBlancos);
        sb.append(", vitalidad = ").append(vitalidad);
        sb.append('}');
        return sb.toString();   
    }
    
}
