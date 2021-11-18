import java.util.LinkedList;

public class Reserva {
    LinkedList<Auto> coleccionAuto;
    Cliente coleccionCliente;
    String fechainicio;
    String fechafin;
    long precio;

    public void agregarCliente(Cliente cliente){
        this.coleccionCliente= cliente;
    }

    public void agregarAuto(Auto auto){
        coleccionAuto.add(auto);
    }

    public Reserva(String fechainicio, String fechafin, long precio) {
        this.coleccionAuto = new LinkedList<Auto>();//crea una coleccion vacia
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.precio = precio;
    }

    public Reserva(LinkedList<Auto> coleccionAuto, Cliente coleccionCliente, String fechainicio, String fechafin, long precio) {
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

    public Cliente getColeccionCliente() {
        return coleccionCliente;
    }

    public void setColeccionCliente(Cliente coleccionCliente) {
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

    public long isPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
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
                '}'+"\n";
    }
}
