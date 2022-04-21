/*
// Curso Egg FullStack
 */
package rel_ej03.Enumeraciones;

/**
 *
 * @author Ezequiel Balasch
 */
public enum Palo {
    ESPADA("Espada"), ORO("Oro"), BASTO("Basto"), COPA("Copa");

    private String nombre;

    private Palo() {
    }

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    

    
}
