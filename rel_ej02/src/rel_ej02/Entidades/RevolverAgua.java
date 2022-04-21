package rel_ej02.Entidades;

public class RevolverAgua {

    private Integer posActual;
    private Integer posAgua;

    public RevolverAgua(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public RevolverAgua() {
    }

    public Integer getPosActual() {
        return posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }


    //METODOS
    
    
    public void llenarRevolver() {
        posActual = (int) (Math.random() * 6 + 1);
        posAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        boolean vof = false;
        if (posActual == posAgua) {
            vof = true;
        }
        return vof;
    }

    public void nextChorro() {
        if (posActual == 6) {
            posActual = 1;
        } else {
            posActual++;
        }
    }
    
    @Override
    public String toString() {
        return "RevolverAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

}
