import java.util.LinkedList;
import java.util.Scanner;

public class Concesionario {
    String nombre;
    String cuil;
    static LinkedList<Auto> coleccionAuto;
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
    public static void modificarAuto(LinkedList<Auto> lista, String clave){
        Scanner scan = new Scanner(System.in);
        String modelo,color,marca,matricula,responsable;
        boolean disponibilidad;
        System.out.println("ingrese el nuevo color");
        color=scan.nextLine();
        System.out.println("ingrese el nuevo modelo");
        modelo=scan.nextLine();
        System.out.println("ingrese el nuevo marca");
        marca=scan.nextLine();
        System.out.println("ingrese el nuevo direccion");
        matricula=scan.nextLine();
        System.out.println("ingrese el nuevo responsable");
        responsable=scan.nextLine();
        System.out.println("ingrese 1 si esta disponible 2 si no lo esta");
        int x=scan.nextInt();
        if (x==1){
            disponibilidad=true;
        }else {
            disponibilidad=false;
        }

        for(Auto automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getMatricula().equals(clave)) {
                automovil.setColor(color);
                automovil.setDisponibilidad(disponibilidad);
                automovil.setMarca(marca);
                automovil.setMatricula(matricula);
                automovil.setModelo(modelo);
                automovil.setResponsable(responsable);
                System.out.println("auto modificado");
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (!bandera){
            System.out.println("Auto no encotrado");

        }

    }
    public static void modificarEmpleado(LinkedList<Empleado> lista, String clave){
        Scanner scan = new Scanner(System.in);
        String puesto,nombre,apellido,direccion,cuil;
        long sueldo;
        System.out.println("ingrese el nuevo nombre");
        nombre=scan.nextLine();
        System.out.println("ingrese el nuevo apellido");
        apellido=scan.nextLine();
        System.out.println("ingrese el nuevo puesto");
        puesto=scan.nextLine();
        System.out.println("ingrese la nueva direccion");
        direccion=scan.nextLine();
        System.out.println("ingrese el nuevo cuil");
        cuil=scan.nextLine();
        System.out.println("ingrese el nuevo sueldo");
        sueldo= scan.nextInt();
        for(Empleado automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(clave)) {
                automovil.setPuesto(puesto);
                automovil.setSalario(automovil.salario);
                automovil.setNombre(nombre);
                automovil.setApellido(apellido);
                automovil.setDireccion(direccion);
                automovil.setCuil(cuil);
                System.out.println("empleado modificado");
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (!bandera){
            System.out.println("Empleado no encotrado");

        }

    }

    public static void modificarCliente(LinkedList<Cliente> lista, String clave){
        Scanner scan = new Scanner(System.in);
        String puesto,nombre,apellido,direccion,cuil;
        long sueldo;
        System.out.println("ingrese el nuevo nombre");
        nombre=scan.nextLine();
        System.out.println("ingrese el nuevo apellido");
        apellido=scan.nextLine();
        System.out.println("ingrese la nueva direccion");
        direccion=scan.nextLine();
        System.out.println("ingrese el nuevo cuil");
        cuil=scan.nextLine();

        for(Cliente automovil : lista){
            // obtener el nombre del automovil para
            // compararlo con la clave si coincide retornar verdadero
            if(automovil.getCuil().equals(clave)) {
                automovil.setNombre(nombre);
                automovil.setApellido(apellido);
                automovil.setDireccion(direccion);
                automovil.setCuil(cuil);
                System.out.println("empleado modificado");
                bandera=true;
            }
        }
        // si no se encontró retornar falso
        if (!bandera){
            System.out.println("Empleado no encotrado");

        }

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

    public static void agregarAuto(Auto auto){
        coleccionAuto.add(auto);
    }
    public void agregarEmpleado(Empleado empleado){
        coleccionEmpleado.add(empleado);
    }
    public void agregarCliente(Cliente cliente){
        coleccionCliente.add(cliente);
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
