import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Concesionario presta = new Concesionario("presta","23456785");
        Auto auto1 = new Auto("Blanco","Corola","Toyota","DC 456 CD",true,"1234567890");
        Auto auto2 = new Auto("Negro","Civic","Honda","DC 457 CD",false,"1234567890");
        presta.agregarAuto(auto1);//agrega el auto nuevo
        presta.agregarAuto(auto2);

        Empleado empleado1 = new Empleado("fede", "lezcano", "Obligado1246","12001231231", "jefe",50000);
        presta.agregarEmpleado(empleado1);
        Cliente cliente1 = new Cliente("jose","jose","calle falsa 123","1234564648");
        presta.agregarCliente(cliente1);

        //System.out.println(presta.toString());
        Reserva reserva1 = new Reserva("19/05/05","19/05/11",50000);
        reserva1.agregarAuto(auto1);
        reserva1.agregarCliente(cliente1);


        LecturaArchivo accesoExternos = new LecturaArchivo();
        accesoExternos.leeDatos();
        EscrituraArchivo escribeElArchivo = new EscrituraArchivo();
        escribeElArchivo.escribir(presta.toString());
        accesoExternos.paraArchivo(presta);
        System.out.println("-------------------------");
        System.out.println(presta.toString());

    }
}
