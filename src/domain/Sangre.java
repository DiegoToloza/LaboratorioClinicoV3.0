package domain;

public class Sangre implements IMuestraGenerica{
    private double hemogoblina;
    private double reticulocitos;
    private int neutrofilos;
    private int plaquetas;

    public Sangre(){
        
    }

    public Sangre(double hemogoblina, double reticulocitos, int neutrofilos, int plaquetas) {
        this.hemogoblina = hemogoblina;
        this.reticulocitos = reticulocitos;
        this.neutrofilos = neutrofilos;
        this.plaquetas = plaquetas;
    }

    public double getHemogoblina() {
        return this.hemogoblina;
    }

    public void setHemogoblina(double hemogoblina) {
        this.hemogoblina = hemogoblina;
    }

    public double getReticulocitos() {
        return this.reticulocitos;
    }

    public void setReticulocitos(double reticulocitos) {
        this.reticulocitos = reticulocitos;
    }

    public int getNeutrofilos() {
        return this.neutrofilos;
    }

    public void setNeutrofilos(int neutrofilos) {
        this.neutrofilos = neutrofilos;
    }
    
    public void setNeutrofilos(double neutrofilos) {
        this.neutrofilos = (int)neutrofilos;
    }

    public int getPlaquetas() {
        return this.plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        this.plaquetas = plaquetas;
    }
    
    public void setPlaquetas(double plaquetas) {
        this.plaquetas = (int)plaquetas;
    }

    @Override
    public String escribir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sangre{hemogoblina = ").append(hemogoblina);
        sb.append(", reticulocitos = ").append(reticulocitos);
        sb.append(", neutrofilos = ").append(neutrofilos);
        sb.append(", plaquetas = ").append(plaquetas);
        sb.append('}');
        return sb.toString();   
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sangre{hemogoblina=").append(hemogoblina);
        sb.append(", reticulocitos=").append(reticulocitos);
        sb.append(", neutrofilos=").append(neutrofilos);
        sb.append(", plaquetas=").append(plaquetas);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
