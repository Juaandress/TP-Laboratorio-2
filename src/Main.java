import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Concesionario presta = new Concesionario("presta",23456785);
        Auto auto1 = new Auto("Blanco","Corola","Toyota","DC 456 CD",true,1234567890);
        Auto auto2 = new Auto("Negro","Civic","Honda","DC 457 CD",false,1234567890);
        presta.agregarAuto(auto1);//agrega el auto nuevo
        presta.agregarAuto(auto2);
        //System.out.println(presta.toString());

        LecturaArchivo accesoExternos = new LecturaArchivo();
        accesoExternos.leeDatos();
        EscrituraArchivo escribeElArchivo = new EscrituraArchivo();
        escribeElArchivo.escribir(presta.toString());

    }
}
