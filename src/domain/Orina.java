package domain;

public class Orina implements IMuestraGenerica{
    private double glucosa;
    private double densidad;
    private int pH;
    private int sodio;

    public Orina(){
        
    }
    
    public Orina(double glucosa, double densidad, int pH, int sodio) {
        this.glucosa = glucosa;
        this.densidad = densidad;
        this.pH = pH;
        this.sodio = sodio;
    }

    public double getGlucosa() {
        return this.glucosa;
    }

    public void setGlucosa(double glucosa) {
        this.glucosa = glucosa;
    }

    public double getDensidad() {
        return this.densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public int getpH() {
        return this.pH;
    }

    public void setpH(int pH) {
        this.pH = pH;
    }

    public int getSodio() {
        return this.sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    @Override
    public String escribir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orina{glucosa = ").append(glucosa);
        sb.append(", densidad = ").append(densidad);
        sb.append(", pH = ").append(pH);
        sb.append(", sodio = ").append(sodio);
        sb.append('}');
        return sb.toString();
    }

    
}
