package domain;

public class Sangre implements IMuestraGenerica {

    private double hemogoblina;
    private double reticulocitos;
    private int neutrofilos;
    private int plaquetas;
    private int idPaciente;

    public Sangre() {

    }

    public Sangre(double hemogoblina, double reticulocitos, int neutrofilos, int plaquetas, int idPaciente) {
        this.hemogoblina = hemogoblina;
        this.reticulocitos = reticulocitos;
        this.neutrofilos = neutrofilos;
        this.plaquetas = plaquetas;
        this.idPaciente = idPaciente;
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
        this.neutrofilos = (int) neutrofilos;
    }

    public int getPlaquetas() {
        return this.plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        this.plaquetas = plaquetas;
    }

    public void setPlaquetas(double plaquetas) {
        this.plaquetas = (int) plaquetas;
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
        sb.append("Sangre{hemogoblina = ").append(hemogoblina);
        sb.append(", reticulocitos = ").append(reticulocitos);
        sb.append(", neutrofilos = ").append(neutrofilos);
        sb.append(", plaquetas = ").append(plaquetas);
        sb.append(", idPaciente = ").append(idPaciente);
        sb.append('}');
        return sb.toString();
    }
}
