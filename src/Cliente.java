import java.util.LinkedList;

public class Cliente extends Persona{
    LinkedList<Auto> coleccionautoAuto;


    public Cliente(String apellido,String nombre,String direccion,String cuil) {
        this.apellido= apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.coleccionautoAuto = new LinkedList<Auto>();//crea una coleccion vacia
    }

    public void agregarAuto(Auto auto){
        coleccionautoAuto.add(auto);
    }

    public void agregarReserva(Reserva reserva){

    }

    public Cliente(LinkedList<Auto> coleccionautoAuto,LinkedList<Reserva> coleccionReserva) {
        this.coleccionautoAuto = coleccionautoAuto;

    }

    public LinkedList<Auto> getColeccionautoAuto() {
        return coleccionautoAuto;
    }

    public void setColeccionautoAuto(LinkedList<Auto> coleccionautoAuto) {
        this.coleccionautoAuto = coleccionautoAuto;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "coleccionautoAuto=" + coleccionautoAuto +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil=" + cuil +
                ", direccion='" + direccion + '\'' +
                '}'+"\n";
    }
}
