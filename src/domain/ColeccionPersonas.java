package domain;

import java.util.*;

public class ColeccionPersonas {

    private final List<Persona> coleccionP;
    private final Map<Integer, Persona> mapaP;

    public ColeccionPersonas() {
        coleccionP = new ArrayList<>();
        mapaP = new HashMap<>();
    }
    
    public Persona obtener(int id) {
        return mapaP.get(id);
    }

    public void agregar(Persona persona) {
        coleccionP.add(persona);
        mapaP.put(persona.getId(), persona);
    }
    
    public void eliminar(int id) {
        for (int i = 0; i < coleccionP.size(); i++) {
            if(id == coleccionP.get(i).getId()){
                coleccionP.remove(i);
                break;
            }
        }
        
        mapaP.remove(id);
    }
    
    public void modificar(int id, Persona persona) {
        for (int i = 0; i < coleccionP.size(); i++) {
            if(id == coleccionP.get(i).getId()){
                coleccionP.set(i,persona);
                break;
            }
        }
        
        mapaP.remove(id);
        mapaP.put(persona.getId(), persona);
        
    }
}
