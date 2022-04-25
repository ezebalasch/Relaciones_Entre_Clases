package rel_ej03.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import rel_ej03.Entidades.Baraja;
import rel_ej03.Entidades.Carta;
import rel_ej03.Enumeraciones.Palo;

public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();
    private Collections c;

    public void crearMazo() {

        System.out.println("Creando un nuevo mazo");
        System.out.println("");

        ArrayList<Carta> cs = new ArrayList();
        ArrayList<Carta> out = new ArrayList();
        cartasEntregadas.setCartas(out);

        for (Palo aux : Palo.values()) {
            String p = aux.getNombre();
            for (int i = 0; i < 12; i++) {
                if ((i + 1) == 8 || (i + 1) == 9) {
                    // NADA
                } else {
                    Carta c = new Carta(i + 1, aux);
                    cs.add(c);
                }
            }
        }
        mazoInicial.setCartas(cs);
        System.out.println("Mazo Armado");
    }

    public void barajar() {
        c.shuffle(mazoInicial.getCartas());

    }

    public Carta siguienteCarta() {
        Carta c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es el " + mazoInicial.getCartas().get(0).toString());

        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + mazoInicial.getCartas().size());

    }

    public void darCartas() {
        System.out.println("Seleccione cuantas cartas desea recibir");
        int cantidad = leer.nextInt();
        if (cantidad <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("se entrega el " + mazoInicial.getCartas().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cantidad; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);

            }
        } else {
            cartasDisponibles();
            System.out.println("Por favor seleccione un valor correcto");
            darCartas();
        }

    }

    public void cartasMonton() {
        if (mazoInicial.getCartas().isEmpty()) {
            System.out.println("Aún no se han entrgado cartas");
            System.out.println("");

        } else {
            System.out.println("Las cartas entregadas son:");
            System.out.println("");
            String frase = "";
            int control = 0;
            for (Object aux : cartasEntregadas.getCartas()) {
                frase = frase.concat(aux.toString());
                frase = frase.concat(".\n");
                control++;
                if (control == 10) {
                    frase = "";
                    control = 0;

                }

            }
            System.out.println(frase);
        }

    }

    public void mostrarBaraja() {
        if (mazoInicial.getCartas().isEmpty()) {
            System.out.println("No hay cartas en el mazo para mostrar");
        } else {
            System.out.println("Las cartas en el mazo son:");
            System.out.println("");
            String frase = "";
            int control = 0;
            for (Object aux : mazoInicial.getCartas()) {
                frase = frase.concat(aux.toString());
                frase = frase.concat(".\n");
                control++;
                if (control == 10) {
                    frase = "";
                    control = 0;

                }

            }
            System.out.println(frase);
        }

    }

    public void menu() {
        System.out.println("--------------------------------------------");        
        System.out.println("--------------------MENU--------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese una opción:");
        System.out.println("1.  Barajar");
        System.out.println("2.  Mostrar la próxima carta");
        System.out.println("3.  Mostrar cartas disponibles");
        System.out.println("4.  Dar las cartas");
        System.out.println("5.  Mostrar las cartas entregadas");
        System.out.println("6.  Mostrar las cartas en el mazo");
        System.out.println("7.  Salir");
        System.out.println("--------------------------------------------");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case 2:
                siguienteCarta();
                menu();

                break;
            case 3:
                cartasDisponibles();
                menu();

                break;
            case 4:
                darCartas();
                menu();
                break;
            case 5:
                cartasMonton();
                menu();
                break;
            case 6:
                mostrarBaraja();
                menu();
            case 7:
                System.out.println("GAME OVER");
                break;
            default:
                System.out.println("Opción Inválida, por favor ingrese nuevamente");
                menu();

        }
    }

}
