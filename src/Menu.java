import java.util.Objects;
import java.util.Scanner;

public class Menu {
    int opcion=0;
    Scanner scan = new Scanner(System.in);
    String nombre,apellido,cuil,direccion,matricula,marca,modelo,color,puesto,responsable;
    long salario;

    public void iniciarMenu(Concesionario concesionario){
        while (opcion!=14){
            System.out.println("Seleccione el NUMERO de la accion que desea realizar?");
            System.out.println("1 - Agregar un cliente");
            System.out.println("2 - Agregar un empleado");
            System.out.println("3 - Agregar un auto");
            System.out.println("4 - buscar un auto");
            System.out.println("5 - buscar un cliente");
            System.out.println("6 - buscar un empleado");
            System.out.println("7 - eliminar un cliente");
            System.out.println("8 - eliminar un empleado");
            System.out.println("9 - eliminar un auto");
            System.out.println("10 - listar autos disponibles");
            System.out.println("11 - midificar un auto");
            System.out.println("12 - modificar un cliente");
            System.out.println("13 - modificar un empleado");
            System.out.println("14 - Terminar");
            opcion=scan.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("ingrese el nombre");
                    nombre=scan.nextLine();
                    System.out.println("ingrese el apellido");
                    apellido=scan.nextLine();
                    System.out.println("ingrese el cuil");
                    cuil=scan.nextLine();
                    System.out.println("ingrese el direccion");
                    direccion=scan.nextLine();
                    Cliente cliente1= new Cliente(apellido,nombre,direccion,cuil);
                    concesionario.agregarCliente(cliente1);

                    break;
                case 2:
                    System.out.println("ingrese el nombre");
                    nombre=scan.nextLine();
                    System.out.println("ingrese el apellido");
                    apellido=scan.nextLine();
                    System.out.println("ingrese el cuil");
                    cuil=scan.nextLine();
                    System.out.println("ingrese el direccion");
                    direccion=scan.nextLine();
                    System.out.println("ingrese el puesto");
                    puesto=scan.nextLine();
                    System.out.println("ingrese el salario");
                    salario= scan.nextInt();
                    Empleado empleado1= new Empleado(nombre,apellido,direccion,cuil,puesto,salario);
                    concesionario.agregarEmpleado(empleado1);
                    break;
                case 3:
                    System.out.println("ingrese el color");
                    color=scan.nextLine();
                    System.out.println("ingrese el modelo");
                    modelo=scan.nextLine();
                    System.out.println("ingrese la marca");
                    marca=scan.nextLine();
                    System.out.println("ingrese la matricula");
                    matricula=scan.nextLine();
                    System.out.println("ingrese el cuil del responsable del auto");
                    responsable=scan.nextLine();
                    Auto auto1 = new Auto(color,modelo,marca,matricula,true,responsable);
                    Concesionario.agregarAuto(auto1);
                    break;
                case 4:
                    System.out.println("ingrese el auto a buscar");
                    matricula=scan.nextLine();
                    System.out.println(Objects.requireNonNull(Concesionario.buscarAuto(Concesionario.coleccionAuto, matricula)).toString());
                    break;
                case 5:
                    System.out.println("ingrese el cuil del cliente a buscar");
                    cuil= scan.nextLine();
                    System.out.println(Objects.requireNonNull(Concesionario.buscarCliente(concesionario.coleccionCliente, cuil)).toString());
                    break;
                case 6:
                    System.out.println("ingrese el cuil del emplead a buscar");
                    cuil= scan.nextLine();
                    System.out.println(Objects.requireNonNull(Concesionario.buscarEmpleado(concesionario.coleccionEmpleado, cuil)).toString());
                    break;
                case 7:
                    System.out.println("ingrese el cuil del cliente a eliminar");
                    cuil= scan.nextLine();
                    Concesionario.eliminarCliente(concesionario.coleccionCliente, cuil);
                    break;
                case 8:
                    System.out.println("ingrese el cuil del empleado a eliminar");
                    cuil= scan.nextLine();
                    Concesionario.eliminarEmpleado(concesionario.coleccionEmpleado, cuil);
                    break;

                case 9:
                    System.out.println("ingrese la matricula del auto a eliminar");
                    matricula= scan.nextLine();
                    Concesionario.eliminarAuto(Concesionario.coleccionAuto, matricula);
                    break;
                case 10:
                    Concesionario.listarDisponible(Concesionario.coleccionAuto);
                    break;
                case 11:
                    System.out.println("ingrese el auto a modificar");
                    matricula=scan.nextLine();
                    Concesionario.modificarAuto(concesionario.getColeccionAuto(),matricula);
                    break;
                case 12:
                    System.out.println("ingrese el cliente a modificar");
                    cuil=scan.nextLine();
                    Concesionario.modificarCliente(concesionario.getColeccionCliente(),cuil);
                    break;
                case 13:
                    System.out.println("ingrese el empleado a modificar");
                    cuil=scan.nextLine();
                    Concesionario.modificarEmpleado(concesionario.coleccionEmpleado,cuil);
                    break;
                default:
                    break;
            }
        }
    }
}
