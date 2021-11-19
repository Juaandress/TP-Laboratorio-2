import java.util.LinkedList;

public class Concesionario {
    String nombre;
    String cuil;
    LinkedList<Auto> coleccionAuto;
    LinkedList<Empleado> coleccionEmpleado;
    LinkedList<Cliente> coleccionCliente;
    static boolean bandera=false;

    public static void eliminarCliente(LinkedList<Cliente> lista, String cuil) {
        for(Cliente automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(cuil)) {
                lista.remove();
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (bandera) {
            System.out.println("Cliente no encotrado");
            bandera=false;
        }
    }
    public static void eliminarEmpleado(LinkedList<Empleado> lista, String cuil) {
        for(Empleado automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(cuil)) {
                lista.remove();
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (bandera) {
            System.out.println("Empleado no encotrado");
            bandera=false;
        }
    }
    public static void eliminarAuto(LinkedList<Auto> lista, String cuil) {
        for(Auto automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getMatricula().equals(cuil)) {
                lista.remove();
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (bandera) {
            System.out.println("Auto no encotrado");
            bandera=false;
        }
    }

    public static void listarDisponible(LinkedList<Auto> lista){

        for(Auto automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.isDisponibilidad()) {
                bandera=true;
                System.out.println(automovil.toString());
            };
        }
        // si no se encontró retornar falso
        if (!bandera) {
            System.out.println("Auto no encotrado");
            bandera=false;
        }
    }

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

    public static Auto buscarAuto(LinkedList<Auto> lista, String clave){

        for(Auto automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getMatricula().equals(clave)) return automovil;
        }
        // si no se encontró retornar falso
        System.out.println("Auto no encotrado");
        return null;
    }

    public static Empleado buscarEmpleado(LinkedList<Empleado> lista, String clave){

        for(Empleado automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(clave)) return automovil;
        }
        // si no se encontró retornar falso
        System.out.println("Empleado no encotrado");
        return null;
    }

    public static Cliente buscarCliente(LinkedList<Cliente> lista, String clave){

        for(Cliente automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(clave)) return automovil;
        }
        // si no se encontró retornar falso
        System.out.println("Cliente no encotrado");
        return null;
    }

    public Concesionario(String nombre, String cuil) {
        this.nombre= nombre;
        this.cuil=cuil;
        this.coleccionAuto = new LinkedList<Auto>();//crea una coleccion vacia
        this.coleccionCliente = new LinkedList<Cliente>();//crea una coleccion vacia
        this.coleccionEmpleado = new LinkedList<Empleado>();//crea una coleccion vacia

    }

    public void agregarAuto(Auto auto){
        coleccionAuto.add(auto);
    }
    public void agregarEmpleado(Empleado empleado){
        coleccionEmpleado.add(empleado);
    }
    public void agregarCliente(Cliente cliente){
        coleccionCliente.add(cliente);
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

    public Concesionario(String nombre, String cuil, LinkedList<Auto> coleccionAuto, LinkedList<Empleado> coleccionEmpleado, LinkedList<Cliente> coleccionCliente) {
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

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
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
