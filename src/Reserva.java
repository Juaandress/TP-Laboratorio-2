import java.util.LinkedList;

public class Reserva {
    LinkedList<Auto> coleccionAuto;
    LinkedList<Cliente> coleccionCliente;
    String fechainicio;
    String fechafin;
    boolean precio;

    public Reserva(String fechainicio, String fechafin, boolean precio) {
        this.coleccionAuto = new LinkedList<Auto>();
        this.coleccionCliente = new LinkedList<Cliente>();
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.precio = precio;
    }

    public Reserva(LinkedList<Auto> coleccionAuto, LinkedList<Cliente> coleccionCliente, String fechainicio, String fechafin, boolean precio) {
        this.coleccionAuto = coleccionAuto;
        this.coleccionCliente = coleccionCliente;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.precio = precio;
    }

    public LinkedList<Auto> getColeccionAuto() {
        return coleccionAuto;
    }

    public void setColeccionAuto(LinkedList<Auto> coleccionAuto) {
        this.coleccionAuto = coleccionAuto;
    }

    public LinkedList<Cliente> getColeccionCliente() {
        return coleccionCliente;
    }

    public void setColeccionCliente(LinkedList<Cliente> coleccionCliente) {
        this.coleccionCliente = coleccionCliente;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public boolean isPrecio() {
        return precio;
    }

    public void setPrecio(boolean precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "coleccionAuto=" + coleccionAuto +
                ", coleccionCliente=" + coleccionCliente +
                ", fechainicio='" + fechainicio + '\'' +
                ", fechafin='" + fechafin + '\'' +
                ", precio=" + precio +
                '}';
    }
}
