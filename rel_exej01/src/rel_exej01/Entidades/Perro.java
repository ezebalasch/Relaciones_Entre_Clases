package rel_exej01.Entidades;


public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private Double tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Double tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNobre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setNobre(String nobre) {
        this.nombre = nobre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
    

}


