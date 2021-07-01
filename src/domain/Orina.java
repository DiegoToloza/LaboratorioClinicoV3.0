package domain;

import excepciones.PorRangoException;

public class Orina implements IMuestraGenerica {

    private double glucosa;
    private double densidad;
    private int pH;
    private int sodio;
    private int idPaciente;

    public Orina() {

    }

    public Orina(double glucosa, double densidad, int pH, int sodio, int idPaciente) {
        setGlucosa(glucosa);
        setDensidad(densidad);
        setpH(pH);
        setSodio(sodio);
        this.idPaciente = idPaciente;
    }

    public double getGlucosa() {
        return this.glucosa;
    }

    public void setGlucosa(double glucosa) {
        if(glucosa < 0){
            throw new PorRangoException();
        }
        this.glucosa = glucosa;
    }

    public double getDensidad() {
        return this.densidad;
    }

    public void setDensidad(double densidad) {
        if(densidad < 0){
            throw new PorRangoException();
        }
        this.densidad = densidad;
    }

    public int getpH() {
        return this.pH;
    }

    public void setpH(int pH) {
        if(pH < 0 || pH > 14){
            throw new PorRangoException();
        }
        this.pH = pH;
    }

    public int getSodio() {
        return this.sodio;
    }

    public void setSodio(int sodio) {
        if(sodio < 0){
            throw new PorRangoException();
        }
        this.sodio = sodio;
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
        sb.append("Orina{glucosa = ").append(glucosa);
        sb.append(", densidad = ").append(densidad);
        sb.append(", pH = ").append(pH);
        sb.append(", sodio = ").append(sodio);
        sb.append(", idPaciente = ").append(idPaciente);
        sb.append('}');
        return sb.toString();
    }

}
