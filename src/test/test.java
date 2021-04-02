package test;

import domain.*;
import java.io.*;
import java.util.*;

public class test { 
    
    public static void main(String[] args) throws IOException {
        
        Map mapaPacientes = new HashMap();
        
        IMuestraGenerica pruebaSangre = agregarSangreManual();
        Paciente pac1 = agregarPacienteManual();
        mapaPacientes.put(pac1.getIdPaciente(),pac1);
        
        imprimirPacientes(mapaPacientes.values());
        System.out.println("" + pruebaSangre);
        
    }
    
    public static void imprimirPacientes(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("" + elemento);
        });
    }
    
    public static Paciente agregarPacienteManual() throws IOException{
        int ip , ed;
        String te , ce , nom , gen , na ;
        BufferedReader lector = new BufferedReader ( new InputStreamReader(System.in));
        System.out.println("Ingrese IdPaciente:");
        ip = Integer.parseInt(lector.readLine());
        System.out.println("Ingrese telefono:");
        te = lector.readLine();
        System.out.println("Ingrese correo electronico:");
        ce = lector.readLine();
        System.out.println("Ingrese nombre paciente:");
        nom = lector.readLine();
        System.out.println("Ingrese edad:");
        ed = Integer.parseInt(lector.readLine());
        System.out.println("Ingrese genero paciente:");
        gen = lector.readLine();
        System.out.println("Ingrese nacionalidad paciente:");
        na = lector.readLine();
        
        Paciente pacienteGenerico = new Paciente(ip,te,ce,nom,ed,gen,na);
        return pacienteGenerico;
    }
    
    public static IMuestraGenerica agregarSangreManual() throws IOException{
        double hem , ret ;
        int neu , pla ;
        BufferedReader lector = new BufferedReader ( new InputStreamReader(System.in));
        System.out.println("Ingrese hemoglobina:");
        hem = Double.parseDouble(lector.readLine());
        System.out.println("Ingrese reticulocitos:");
        ret = Double.parseDouble(lector.readLine());
        System.out.println("Ingrese neutrofilos:");
        neu = Integer.parseInt(lector.readLine());
        System.out.println("Ingrese plaquetas:");
        pla = Integer.parseInt(lector.readLine());
        
        IMuestraGenerica sangreGenerica = new Sangre(hem,ret,neu,pla);
        return sangreGenerica;
    }
    
}
