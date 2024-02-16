package testing;

import modelo.dao.AgendaContacto;
import modelo.javabean.Contacto;

public class TestingAgendaContacto {
    private static AgendaContacto agc1;
    private static AgendaContacto agc2;
    private static AgendaContacto agc3;
    private static Contacto contacto1;
    private static Contacto contacto2;
    private static Contacto contacto3;
    private static Contacto contacto4;

    static{
        agc1=new AgendaContacto("Juanan");
        agc1=new AgendaContacto("Sonia");
        agc1=new AgendaContacto("Mario");
        contacto1=new Contacto("Sonia","García Manzano","639010345","sonig@yahoo.es","HP");
        contacto2=new Contacto("Edu","Blázquez García","694467818","eduardoblazquez34@gmail.com","PwC");
        contacto3=new Contacto("Juanjo","Pedrosa","613198217","juanjo@gmail.com","Telefónica");
        contacto4=new Contacto("María","Serra","674591217","mariserr@yahoo.es","Deloite");
    }

    public static void main(String[] args) {
        //Testing Contacto.java

        System.out.println(contacto1.getEmail());
        contacto1.setEmail("abelardo@yahoo.es");
        System.out.println(contacto1.getEmail());
        contacto4.setNombre("Pepe");
        System.out.println(contacto2.getEmpresa());
        System.out.println(contacto3.getApellidos());
        System.out.println(contacto4.getTelefono());
        System.out.println(contacto4.getNombre());

        //Testing AgendaContacto.java
        agc1.altaContacto(contacto1);
        System.out.println(agc1.mostrarTodo());
        System.out.println(agc1.buscarUno("Juan"));
        System.out.println(agc1.buscarEmail("674591217"));
        System.out.println(agc1.buscarTelefono("juanjo@gmail.com"));
    }
}
