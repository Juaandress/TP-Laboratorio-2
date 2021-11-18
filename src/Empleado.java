public class Empleado extends Persona{
    String puesto;
    long salario;

    public Empleado(String nombre,String apellido,String direccion,String cuil,String puesto, long salario) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuil = cuil;
        this.direccion = direccion;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil=" + cuil +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
