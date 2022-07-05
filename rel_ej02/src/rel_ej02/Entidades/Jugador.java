package rel_ej02.Entidades;




public class Jugador {
    private Integer id;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Jugador(Integer id) {
        this.id = id;
        String ids = id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    //METODOS 
    
    public boolean disparo(RevolverAgua revolver){
        boolean tiro = false;
        if (revolver.mojar()) {
            tiro = true;
            mojado = true;  
        }
        revolver.nextChorro();
        return tiro;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
        
    

}
