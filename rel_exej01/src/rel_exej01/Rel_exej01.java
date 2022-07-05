/*
// Curso Egg FullStack
 */
package rel_exej01;

//@author Ezequiel Balasch
import rel_exej01.Entidades.Perro;
import rel_exej01.Entidades.Persona;
import rel_exej01.Enumeraciones.ListadoPerritos;
import rel_exej01.Servicios.Servicio;

public class Rel_exej01 {

    public static void main(String[] args) {
        Perro perrito = new Perro();
        perrito.setNobre(ListadoPerritos.getFRIDA().getNombre());
        perrito.setEdad(ListadoPerritos.getFRIDA().getEdad());
        perrito.setRaza(ListadoPerritos.getFRIDA().getRaza());
        perrito.setTamanio(ListadoPerritos.getFRIDA().getTamanio());

        Persona persona = new Persona();
        persona.setMascota(perrito);

        Perro perrito1 = new Perro();
        perrito1.setNobre(ListadoPerritos.getGRETA().getNombre());
        perrito1.setEdad(ListadoPerritos.getGRETA().getEdad());
        perrito1.setRaza(ListadoPerritos.getGRETA().getRaza());
        perrito1.setTamanio(ListadoPerritos.getGRETA().getTamanio());

        Persona persona1 = new Persona();
        persona1.setMascota(perrito1);
        

        Servicio s1 = new Servicio();
        s1.crearPesona();
        s1.elegirPerro(dato, persona1);
        System.out.println("");
        System.out.println("Continuemos con la segunda persona");
        System.out.println("");
        s1.crearPesona();

        s1.mostrarTodo();

    }

}
