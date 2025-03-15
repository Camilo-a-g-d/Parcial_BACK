package models;

public class Reserva {
    private static int contador = 1; // Contador para generar IDs únicos
    private int id;
    private String nombre;
    private String fecha;
    private String espacio;
    private int duracion;

    // Constructor
    public Reserva(String nombre, String fecha, String espacio, int duracion) {
        this.id = contador++;
        this.nombre = nombre;
        this.fecha = fecha;
        this.espacio = espacio;
        this.duracion = duracion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
