package rel_ej03.Entidades;

import rel_ej03.Enumeraciones.Palo;



public class Carta {
    private Integer numero;
    private Palo pinta;

    public Carta() {
    }

    public Carta(Integer numero, Palo pinta) {
        this.numero = numero;
        this.pinta = pinta;
    }

    public Integer getNumero() {
        return numero;
    }

    public Palo getPinta() {
        return pinta;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPinta(Palo pinta) {
        this.pinta = pinta;
    }

    @Override
    public String toString() {
        return numero + " de " + pinta;
    }

    

    

}
