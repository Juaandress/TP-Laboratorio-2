import java.util.LinkedList;

public class Concesionario {
    String nombre;
    int cuil;
    LinkedList<Auto> coleccionAuto;
    LinkedList<Empleado> coleccionEmpleado;
    LinkedList<Cliente> coleccionCliente;

    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombre + '\'' +
                ", cuil=" + cuil +
                "\nColeccion de autos=\n"+ coleccionAuto +
                "\n Empleados=\n"+ coleccionEmpleado +
                "\n Clientes=\n" + coleccionCliente +
                '}'+"\n";
    }

    public Concesionario(String nombre, int cuil) {
        this.nombre= nombre;
        this.cuil=cuil;
        this.coleccionAuto = new LinkedList<Auto>();//crea una coleccion vacia
        this.coleccionCliente = new LinkedList<Cliente>();//crea una coleccion vacia
        this.coleccionEmpleado = new LinkedList<Empleado>();//crea una coleccion vacia

    }

    public void agregarAuto(Auto auto){
        coleccionAuto.add(auto);
    }

    public void eliminarAuto(String matriculaAuto) {
        boolean bandera = false;
        for (Auto auto : coleccionAuto) {
            if (auto.getMatricula().equals(matriculaAuto)) {
                coleccionAuto.remove(auto);
                bandera = true;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontró el auto a eliminar");
        }else{System.out.println("No se encontró el auto a eliminar");}
    }

    public void encontrarAuto(String matriculaAuto) {
        boolean bandera = false;
        Auto auto1 = new Auto(null,null,null,null,false,0);
        for (Auto auto : coleccionAuto) {
            if (auto.getMatricula().equals(matriculaAuto)) {
                bandera = true;
                auto1=auto;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontró el auto");
            auto1.toString();
        }else{System.out.println("No se encontró el auto");}
    }

    public Concesionario(String nombre, int cuil, LinkedList<Auto> coleccionAuto, LinkedList<Empleado> coleccionEmpleado, LinkedList<Cliente> coleccionCliente) {
        this.nombre = nombre;
        this.cuil = cuil;
        this.coleccionAuto = coleccionAuto;
        this.coleccionEmpleado = coleccionEmpleado;
        this.coleccionCliente = coleccionCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public LinkedList<Auto> getColeccionAuto() {
        return coleccionAuto;
    }

    public void setColeccionAuto(LinkedList<Auto> coleccionAuto) {
        this.coleccionAuto = coleccionAuto;
    }

    public LinkedList<Empleado> getColeccionEmpleado() {
        return coleccionEmpleado;
    }

    public void setColeccionEmpleado(LinkedList<Empleado> coleccionEmpleado) {
        this.coleccionEmpleado = coleccionEmpleado;
    }

    public LinkedList<Cliente> getColeccionCliente() {
        return coleccionCliente;
    }

    public void setColeccionCliente(LinkedList<Cliente> coleccionCliente) {
        this.coleccionCliente = coleccionCliente;
    }
}
