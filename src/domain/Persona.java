package domain;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;
    protected String nacionalidad;
    private int id;
    
    public Persona(){
    }
    
    public Persona(String nombre, int edad, String genero, String nacionalidad, int id){
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setNacionalidad(nacionalidad);
        this.id = id;
    }
    
    public Persona(String nombre, int edad, String genero, String nacionalidad){
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
        setNacionalidad(nacionalidad);
    }
    
    public Persona(int id){
        this.id = id;
    }

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract int getEdad();

    public abstract void setEdad(int edad);

    public abstract String getGenero();

    public abstract void setGenero(String genero);

    public abstract String getNacionalidad();

    public abstract void setNacionalidad(String nacionalidad);
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
