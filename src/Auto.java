public class Auto {
    String color;
    String modelo;
    String marca;
    String matricula;
    boolean disponibilidad;
    int responsable;

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", responsable=" + responsable +
                '}';
    }

    public Auto(String color, String modelo, String marca, String matricula, boolean disponibilidad, int responsable) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
        this.responsable = responsable;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }
}
