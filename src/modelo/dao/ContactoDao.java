package modelo.dao;

import modelo.javabean.Contacto;

import java.util.ArrayList;

/**
 * Implementa los métodos en ContactoAgenda
 */
public interface ContactoDao {
    boolean altaContacto(Contacto contacto);
    boolean eliminarContacto(Contacto contacto);
    Contacto buscarUno(String nombre);
    Contacto buscarTelefono(String telefono);
    Contacto buscarEmail(String email);
    ArrayList<Contacto> buscarContactosPorTresPrimeros (String nombre);
    boolean cambiarDatos(Contacto contacto);
    ArrayList<Contacto> contactosPorEmpresa(String empresa);
}
