package test;

import domain.*;
import java.io.*;
import java.util.*;

public class test {

    static Map<Integer, Paciente> mapaPacientes = new HashMap();
    static Map<Integer, Medico> mapaMedicos = new HashMap();

    public static void main(String[] args) throws IOException {

        boolean flag = true;

        while (flag) {
            List<String> MenuPrincipal = new ArrayList<>();
            MenuPrincipal.add("Menu Principal");
            MenuPrincipal.add("Agregar Paciente");
            MenuPrincipal.add("Agregar Medico");
            MenuPrincipal.add("Mostrar Pacientes");
            MenuPrincipal.add("Mostrar Medicos");
            MenuPrincipal.add("Agregar muestra");
            MenuPrincipal.add("Mostrar muestras");
            MenuPrincipal.add("Salir");
            int opcion = Menu(MenuPrincipal);
            switch (opcion) {
                case 0 ->
                    agregarPacienteManual();
                case 1 ->
                    agregarMedicoManual();
                case 2 ->
                    imprimirMapa(mapaPacientes.values());
                case 3 ->
                    imprimirMapa(mapaMedicos.values());
                case 4 ->
                    MenuMuestras();
                case 5 ->
                    mostrarMuestras();
                case 6 ->
                    flag = false;
                default ->
                    System.out.println("Tonto hueon aprende fundamentos de matematicas");
            }

        }

    }

    public static void imprimirMapa(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("" + elemento);
        });
    }

    public static void agregarPacienteManual() throws IOException {
        int ip, ed;
        String te, ce, nom, gen, na;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese IdPaciente:");
        ip = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese telefono:");
        te = lector.readLine();
        System.out.print("Ingrese correo electronico:");
        ce = lector.readLine();
        System.out.print("Ingrese nombre paciente:");
        nom = lector.readLine();
        System.out.print("Ingrese edad:");
        ed = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese genero paciente:");
        gen = lector.readLine();
        System.out.print("Ingrese nacionalidad paciente:");
        na = lector.readLine();

        Paciente pacienteGenerico = new Paciente(ip, te, ce, nom, ed, gen, na);
        mapaPacientes.put(pacienteGenerico.getIdPaciente(), pacienteGenerico);
    }

    public static void agregarMedicoManual() throws IOException {
        int im, ed;
        String esp, te, ce, nom, gen, na;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese IdMedico:");
        im = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese Especializacion:");
        esp = lector.readLine();
        System.out.print("Ingrese telefono:");
        te = lector.readLine();
        System.out.print("Ingrese correo electronico:");
        ce = lector.readLine();
        System.out.print("Ingrese nombre medico:");
        nom = lector.readLine();
        System.out.print("Ingrese edad:");
        ed = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese genero paciente:");
        gen = lector.readLine();
        System.out.print("Ingrese nacionalidad paciente:");
        na = lector.readLine();

        Medico medicoGenerico = new Medico(im, esp, te, ce, nom, ed, gen, na);
        mapaMedicos.put(medicoGenerico.getIdMedico(), medicoGenerico);
    }

    public static void agregarSangreManual() throws IOException {
        double hem, ret;
        int neu, pla, id;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese idPaciente:");
        id = Integer.parseInt(lector.readLine());
        if (mapaPacientes.get(id) == null) {
            System.out.println("Paciente no existe");
            return;
        }
        System.out.print("Ingrese hemoglobina:");
        hem = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese reticulocitos:");
        ret = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese neutrofilos:");
        neu = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese plaquetas:");
        pla = Integer.parseInt(lector.readLine());

        IMuestraGenerica sangreGenerica = new Sangre(hem, ret, neu, pla);
        mapaPacientes.get(id).agregarMuestra(sangreGenerica);

    }

    public static void agregarSemenManual() throws IOException {
        double vol, con, glo;
        int vit, id;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese idPaciente:");
        id = Integer.parseInt(lector.readLine());
        if (mapaPacientes.get(id) == null) {
            System.out.println("Paciente no existe");
            return;
        }
        System.out.print("Ingrese volumen:");
        vol = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese concentracion:");
        con = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese globulos blancos:");
        glo = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese vitalidad:");
        vit = Integer.parseInt(lector.readLine());

        IMuestraGenerica semenGenerica = new Semen(vol, con, glo, vit);
        mapaPacientes.get(id).agregarMuestra(semenGenerica);
    }

    public static void agregarOrinaManual() throws IOException {
        double glu, den;
        int ph, sod, id;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese idPaciente:");
        id = Integer.parseInt(lector.readLine());
        if (mapaPacientes.get(id) == null) {
            System.out.println("Paciente no existe");
            return;
        }
        System.out.print("Ingrese glucosa:");
        glu = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese densidad:");
        den = Double.parseDouble(lector.readLine());
        System.out.print("Ingrese pH:");
        ph = Integer.parseInt(lector.readLine());
        System.out.print("Ingrese sodio:");
        sod = Integer.parseInt(lector.readLine());

        IMuestraGenerica orinaGenerica = new Orina(glu, den, ph, sod);
        mapaPacientes.get(id).agregarMuestra(orinaGenerica);
    }

    public static int Menu(List<String> Lista) throws IOException {

        int opcion = -1;

        System.out.println(Lista.get(0) + "\n");
        for (int i = 1; i < Lista.size(); i++) {
            System.out.println("" + i + ")" + Lista.get(i));
        }
        System.out.print("INGRESAR OPCION: ");
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        try {
            opcion = Integer.parseInt(lector.readLine());
        } catch (NumberFormatException e) {
            opcion = -1;
        }
        if (opcion >= 1 && opcion < Lista.size()) {
            opcion -= 1;
            return opcion;
        }
        return opcion;
    }

    public static void mostrarMuestras() throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese idPaciente:");
        int id = Integer.parseInt(lector.readLine());
        if (mapaPacientes.get(id) == null) {
            System.out.println("Paciente no existe");
            return;
        }
        for (IMuestraGenerica iMuestraGenerica : mapaPacientes.get(id).getMuestrasPaciente()) {
            System.out.println(iMuestraGenerica.escribir());
        }
    }

    public static void MenuMuestras() throws IOException {
        boolean flag = true;

        while (flag) {
            List<String> menuMuestras = new ArrayList<>();
            menuMuestras.add("Menu Muestras");
            menuMuestras.add("Agregar muestra sangre");
            menuMuestras.add("Agregar muestra semen");
            menuMuestras.add("Agregar muestra orina");
            menuMuestras.add("Regresar al menu principal");
            int opcion = Menu(menuMuestras);
            switch (opcion) {
                case 0 ->
                    agregarSangreManual();
                case 1 ->
                    agregarSemenManual();
                case 2 ->
                    agregarOrinaManual();
                case 3 ->
                    flag = false;
                default ->
                    System.out.println("MONGOLO");
            }
        }
    }

}
