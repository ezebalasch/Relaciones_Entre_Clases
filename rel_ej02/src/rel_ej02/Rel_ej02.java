/*
// Curso Egg FullStack
 */
package rel_ej02;

//@author Ezequiel Bala
import java.util.ArrayList;
import java.util.Scanner;
import rel_ej02.Entidades.Juego;
import rel_ej02.Entidades.Jugador;
import rel_ej02.Entidades.RevolverAgua;

public class Rel_ej02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> players = new ArrayList<>();
        int cantjugadores = 0;
        System.out.println("Iniciando juego");
        System.out.println("");
        do {
            System.out.println("Introduzca cantidad de jugadores");
            cantjugadores = leer.nextInt();

        } while (cantjugadores > 6 || cantjugadores < 1);
        for (int i = 0; i < cantjugadores; i++) {
            Jugador a = new Jugador(i+1);
            players.add(a);
        }
        System.out.println("Preparando revolver");
        System.out.println("");
        RevolverAgua r = new RevolverAgua();
        r.llenarRevolver();
        
        System.out.println("Revolver cargado. Iniciando juego");
        System.out.println("-------------------------------------------------");
        Juego j = new Juego();
        j.llenarJuego(players, r);
        boolean juegoContinua = true;
        int turno = 0;
        while(juegoContinua){
            if (turno == (cantjugadores)) {
                turno = 0;                
            }
            System.out.println("El \n " + j.getPlayer().get(turno).getNombre() + "\n procede a disparar\n ");
            juegoContinua = j.ronda(turno);
            if (juegoContinua) {
                System.out.println("El " + j.getPlayer().get(turno).getNombre() + " se salva");
                System.out.println("");
                System.out.println("");
            }else{
                System.out.println("El " + j.getPlayer().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego Finalizado");
            }
            turno++;
        }
        System.out.println("");
        

    }

}
