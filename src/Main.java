public class Main {
    public static void main(String[] args) {

        Concesionario presta = new Concesionario("presta",23456785);
        Auto auto1 = new Auto("Blanco","Corola","Toyota","DC 456 CD",true,1234567890);
        presta.agregarAuto(auto1);//agrega el auto nuevo
        System.out.println(presta.toString());
    }
}
