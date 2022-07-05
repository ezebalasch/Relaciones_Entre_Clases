package rel_ej02.Entidades;

import java.util.ArrayList;




public class Juego {

    private ArrayList<Jugador> player;
    private RevolverAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> player, RevolverAgua revolver) {
        this.player = player;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getPlayer() {
        return player;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setPlayer(ArrayList<Jugador> player) {
        this.player = player;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }
    //METODOS
    
    public void llenarJuego(ArrayList<Jugador> j1, RevolverAgua r1){
        player = j1;
        revolver = r1;
    }
    public boolean ronda(int i){
        boolean juegoContinua = true;
        player.get(i).disparo(revolver);
        if (player.get(i).getMojado()) {
            juegoContinua=false;
            
        }
        return juegoContinua;
        
    }

    @Override
    public String toString() {
        return "Juego{" + "player=" + player + ", revolver=" + revolver + '}';
    }
    
}
