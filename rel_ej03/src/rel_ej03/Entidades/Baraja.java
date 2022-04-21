package rel_ej03.Entidades;

import java.util.ArrayList;
import rel_ej03.Enumeraciones.Palo;


public class Baraja {
    
    private ArrayList<Carta> cartas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    
}
