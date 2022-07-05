/*
// Curso Egg FullStack
 */
package rel_ej01;

import rel_ej01.Servicios.Servicio;

public class Rel_ej01 {

    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        s1.crearPesona();
        System.out.println("");
        System.out.println("Continuemos con la segunda persona");
        System.out.println("");
        s1.crearPesona();

        s1.mostrarTodo();

    }

}
