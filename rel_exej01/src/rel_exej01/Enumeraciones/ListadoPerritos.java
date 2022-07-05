/*
// Curso Egg FullStack
 */
package rel_exej01.Enumeraciones;

/**
 *
 * @author Ezequiel Balasch
 */
public enum ListadoPerritos {
    FRIDA("Frida", 100, "Ovejero Alemán", 1.15), GRETA("Greta", 15, "Ovejero Alemán", 1.10);
    
    private String nombre;
    private Integer edad;
    private String raza;
    private Double tamanio;

    private ListadoPerritos() {
    }

    private ListadoPerritos(String nombre, Integer edad, String raza, Double tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public static ListadoPerritos getFRIDA() {
        return FRIDA;
    }

    public static ListadoPerritos getGRETA() {
        return GRETA;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "ListadoPerritos{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tamanio=" + tamanio + '}';
    }


}
