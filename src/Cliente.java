import java.util.LinkedList;

public class Cliente extends Persona{
    LinkedList<Auto> coleccionautoAuto;
    LinkedList<Reserva> coleccionReserva;

    public Cliente(String apellido,String nombre,String direccion,int cuil) {
        this.apellido= apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuil = cuil;
        this.coleccionautoAuto = new LinkedList<Auto>();//crea una coleccion vacia
        this.coleccionReserva = new LinkedList<Reserva>();//crea una coleccion vacia
    }

    public Cliente(LinkedList<Auto> coleccionautoAuto,LinkedList<Reserva> coleccionReserva) {
        this.coleccionautoAuto = coleccionautoAuto;
        this.coleccionReserva = coleccionReserva;
    }

    public LinkedList<Auto> getColeccionautoAuto() {
        return coleccionautoAuto;
    }

    public void setColeccionautoAuto(LinkedList<Auto> coleccionautoAuto) {
        this.coleccionautoAuto = coleccionautoAuto;
    }

    public LinkedList<Reserva> getColeccionReserva() {
        return coleccionReserva;
    }

    public void setColeccionReserva(LinkedList<Reserva> coleccionReserva) {
        this.coleccionReserva = coleccionReserva;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "coleccionautoAuto=" + coleccionautoAuto +
                ", coleccionReserva=" + coleccionReserva +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil=" + cuil +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
