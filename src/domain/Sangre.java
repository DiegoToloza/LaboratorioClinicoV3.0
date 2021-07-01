package domain;

import excepciones.PorRangoException;

public class Sangre implements IMuestraGenerica {

    private double hemogoblina;
    private double reticulocitos;
    private int neutrofilos;
    private int plaquetas;
    private int idPaciente;

    public Sangre() {

    }

    public Sangre(double hemogoblina, double reticulocitos, int neutrofilos, int plaquetas, int idPaciente) {
        setHemogoblina(hemogoblina);
        setReticulocitos(reticulocitos);
        setNeutrofilos(neutrofilos);
        setPlaquetas(plaquetas);
        this.idPaciente = idPaciente;
    }

    public double getHemogoblina() {
        return this.hemogoblina;
    }

    public void setHemogoblina(double hemogoblina) {
        if(hemogoblina < 0){
            throw new PorRangoException();
        }
        this.hemogoblina = hemogoblina;
    }

    public double getReticulocitos() {
        return this.reticulocitos;
    }

    public void setReticulocitos(double reticulocitos){
        if (reticulocitos < 0 || reticulocitos > 100){
            throw new PorRangoException();
        }
        this.reticulocitos = reticulocitos;
    }

    public int getNeutrofilos() {
        return this.neutrofilos;
    }

    public void setNeutrofilos(int neutrofilos) {
        if(neutrofilos < 0 || neutrofilos > 100){
            throw new PorRangoException();
        }
        this.neutrofilos = neutrofilos;
    }

    public void setNeutrofilos(double neutrofilos) {
        if(neutrofilos < 0 || neutrofilos > 100){
            throw new PorRangoException();
        }
        this.neutrofilos = (int) neutrofilos;
    }

    public int getPlaquetas() {
        return this.plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        if(plaquetas < 0){
            throw new PorRangoException();
        }
        this.plaquetas = plaquetas;
    }

    public void setPlaquetas(double plaquetas) {
        if(plaquetas < 0){
            throw new PorRangoException();
        }
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
