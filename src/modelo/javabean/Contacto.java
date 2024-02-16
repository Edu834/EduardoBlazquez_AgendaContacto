package modelo.javabean;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;

    public Contacto(){
        super();
    }

    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    /**
     * Este método devuelve la clave única del objeto Contacto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpresa() {
        return empresa;
    }

    /**
     * Este método establece o cambia el valor de la clave única del objeto Contacto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
