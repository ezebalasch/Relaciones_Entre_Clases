package rel_ej01.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import rel_ej01.Perros.Perro;
import rel_ej01.Personas.Persona;

/* * @author Ezequiel Balasch
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> personas;
    private ArrayList<Perro> perritos;

    public Servicio() {
        this.personas = new ArrayList();
        this.perritos = new ArrayList();
    }

    public void crearPesona() {

        Persona p1;
        p1 = agregarPersonas();
        agregarAListaPersona(p1);
    }

    public Persona agregarPersonas() {
        Persona p1;
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese documento");
        Long documento = leer.nextLong();
        System.out.println("");
        System.out.println("---------Ingrese datos de su mascota---------");
        System.out.println("");
        Perro mascota = perroLlenado();
        agregarAListaPerro(mascota);
        p1 = new Persona(nombre, apellido, edad, documento, mascota);
        return p1;

    }

    public void agregarAListaPersona(Persona p1) {
        personas.add(p1);
    }

    public void agregarAListaPerro(Perro p1) {
        perritos.add(p1);
    }

    public Perro perroLlenado() {
        Perro mascota;
        System.out.println("Ingrese nombre de la mascota");
        String nombre = leer.next();
        System.out.println("Ingre raza");
        String raza = leer.next();
        System.out.println("Ingrese edad del perro");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese tamaño del perro");
        Double tamanio = leer.nextDouble();

        mascota = new Perro(nombre, raza, edad, tamanio);
        return mascota;
    }

    public void mostrarTodo() {
        for (Persona persona : personas) {

            System.out.println(persona.toString());
        }

    }
}
