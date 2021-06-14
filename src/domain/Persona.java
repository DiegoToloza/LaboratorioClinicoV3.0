package domain;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;
    protected String nacionalidad;
    
    public Persona(){
    }
    
    public Persona(String nombre, int edad, String genero, String nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract int getEdad();

    public abstract void setEdad(int edad);

    public abstract String getGenero();

    public abstract void setGenero(String genero);

    public abstract String getNacionalidad();

    public abstract void setNacionalidad(String nacionalidad);

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
