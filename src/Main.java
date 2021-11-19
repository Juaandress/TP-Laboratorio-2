import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Concesionario presta = new Concesionario("presta","23456785");


        LecturaArchivo accesoExternos = new LecturaArchivo();
        //accesoExternos.leeDatos();
        accesoExternos.paraArchivo(presta);
        //EscrituraArchivo escribeElArchivo = new EscrituraArchivo();
        //escribeElArchivo.escribir(presta.toString(),"Archivo1.txt");
        Menu menu = new Menu();
        //menu.iniciarMenu(presta);
        menu.iniciarMenu(presta);

    }
}
