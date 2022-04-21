package rel_ej01.Personas;

import rel_ej01.Perros.Perro;

/* * @author Ezequiel Balasch
 */


public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Long documento;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Long documento, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Long getDocumento() {
        return documento;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascota=" + mascota.toString() + '}';
    }
    
    

}
