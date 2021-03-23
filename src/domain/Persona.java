package domain;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    
    public Persona(){
    }
    
    public Persona(String nombre, int edad, String genero, String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre = ").append(nombre);
        sb.append(", edad = ").append(edad);
        sb.append(", genero = ").append(genero);
        sb.append(", nacionalidad = ").append(nacionalidad);
        sb.append('}');
        return sb.toString();
    }

}
