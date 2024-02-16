package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

public class AgendaContacto implements ContactoDao{
    private String nombreAgenda;
    private ArrayList<Contacto> contactos;

    public AgendaContacto(String nombre){
        nombreAgenda=nombre;
        contactos = new ArrayList<>();
        cargardatos();
    }

    public String getNombreAgenda(){
        return nombreAgenda;
    }

    public void setNombreAgenda(String nombre) {
        nombreAgenda = nombre;
    }

    private void cargardatos(){
        contactos.add(new Contacto("Juan","García","607511207","juanillo@gmail.com","IBM"));
        contactos.add(new Contacto("María","Serrano","674591217","mariserr@gmail.com","Deloite"));
        contactos.add(new Contacto("José","Martinez","614191297","joselin@gmail.com","Deloite"));
        contactos.add(new Contacto("Juanjo","Pedrosa","613198217","juanjo@gmail.com","Telefónica"));

    }

    @Override
    public boolean altaContacto(Contacto contacto) {
        if(!contactos.contains(contacto)){
            contactos.add(contacto);
            return true;
        }else{
            return false;
        }
    }

    public  String mostrarTodo(){
        String strContactos=contactos.toString();
        return nombreAgenda+strContactos;
    }

    @Override
    public boolean eliminarContacto(Contacto contacto) {
        if(contactos.contains(contacto)){
            contactos.remove(contacto);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Contacto buscarUno(String nombre) {
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        int pos = contactos.indexOf(contacto);
        if(pos==-1){
            return null;
        }else {
            return contactos.get(pos);
        }
    }

    @Override
    public Contacto buscarTelefono(String telefono) {
        for (int i = 0; i < contactos.size(); i++) {
            if(contactos.get(i).getTelefono().equals(telefono)){
                return contactos.get(i);
            }
        }
        return null;
    }

    @Override
    public Contacto buscarEmail(String email) {
        for(int i = 0; i < contactos.size(); i++) {
            if(contactos.get(i).getTelefono().equals(email)){
                return contactos.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> contactosTresPrimeros= new ArrayList<Contacto>();
        if(nombre.length()>=3){
            for (int i = 0; i < contactos.size(); i++) {
                if(contactos.get(i).getNombre().substring(0,2).equals(nombre.substring(0,2))){
                    contactosTresPrimeros.add(contactos.get(i));
                }
            }
        }else{
            return null;
        }
        return contactosTresPrimeros;
    }

    @Override
    public boolean cambiarDatos(Contacto contacto) {
        for (int i = 0; i < contactos.size(); i++) {
            if(contactos.get(i).getNombre().equals(contacto.getNombre())){
                contactos.get(i).setApellidos(contacto.getApellidos());
                contactos.get(i).setEmail(contacto.getEmail());
                contactos.get(i).setEmpresa(contacto.getEmpresa());
                contactos.get(i).setTelefono(contacto.getTelefono());
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> contactosEmpresa= new ArrayList<Contacto>();
            for (int i = 0; i < contactos.size(); i++) {
                if(contactos.get(i).getEmpresa().equals(empresa)){
                    contactosEmpresa.add(contactos.get(i));
                }
            }
        return contactosEmpresa;
    }
}

