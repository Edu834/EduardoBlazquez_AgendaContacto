package testing;

import modelo.javabean.Contacto;

public class TestingAgendaContacto {
    private static Contacto contacto1;
    private static Contacto contacto2;
    private static Contacto contacto3;
    private static Contacto contacto4;

    static{
        contacto1=new Contacto("Sonia","García Manzano","639010345","sonig@yahoo.es","HP");
        contacto2=new Contacto("Edu","Blázquez García","694467818","eduardoblazquez34@gmail.com","PwC");
        contacto3=new Contacto("Juanjo","Pedrosa","613198217","juanjo@gmail.com","Telefónica");
        contacto4=new Contacto("María","Serra","674591217","mariserr@yahoo.es","Deloite");
    }

    public static void main(String[] args) {
        System.out.println(contacto1.getEmail());
        contacto1.setEmail("abelardo@yahoo.es");
        System.out.println(contacto1.getEmail());
        contacto4.setNombre("Pepe");
        System.out.println(contacto2.getEmpresa());
        System.out.println(contacto3.getApellidos());
        System.out.println(contacto4.getTelefono());
        System.out.println(contacto4.getNombre());
    }
}
