public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int cuil;
    protected String direccion;

    public int getCuil() {
        return cuil;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.cuil = legajo;
    }

    public void modificarDatos (int cuil,String nom,String ape,String dire){
        this.apellido = ape;
        this.nombre = nom;
        this.cuil = cuil;
        this.direccion = dire;
    }

}