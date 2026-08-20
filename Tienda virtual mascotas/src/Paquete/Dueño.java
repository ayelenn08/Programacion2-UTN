package Paquete;

public class Dueño {
    private String nombre;
    private int telefono;

    public Dueño(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String infoDueño ()
    {
        return "Nombre del dueño: "+nombre+" telefono: "+telefono;
    }
}
