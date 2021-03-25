package test;

import domain.Medico;
import domain.Orina;
import domain.Paciente;
import domain.Persona;
import domain.Sangre;
import domain.Semen;
import java.io.*;

public class test {
    
    public static void main(String[] args) throws IOException {
        
        Paciente paciente1 = new Paciente( 6 , "+56 9 73647384" , "reymasterfollador@gmail.com" , "Alex Castillo" , 21 , "Bicho" , "Peruano"); 
        System.out.println("paciente1 = " + paciente1);
        
        Medico medico1 = new Medico( 7 , "Otorrinolaringologo" , "+56 9 38294018" , "matiaselnova@gmail.com" , "Matias Ceballos" , 21 , "Monke" , "Chileno");
        System.out.println("medico1 = " + medico1);
        
        Semen semen1 = new Semen( 50.12 ,90.49 , 349.94 , 98 );
        System.out.println("semen1 = " + semen1);
        
        Orina orina1 = new Orina( 349.54 , 432.43 , 23 , 100);
        System.out.println("orina1 = " + orina1);
        
        Sangre sangre1 = new Sangre( 3484.34 , 3294.23 , 1000 , 321 );
        System.out.println("sangre1 = " + sangre1);
    }
}
