package Paquete;

public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;
    private Dueño mascotaDueño;

    public Mascota(String nombre, String tipo, int edad, String nombreDueño, int telefono) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.mascotaDueño = new Dueño(nombreDueño, telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDueño() {
        return mascotaDueño.getNombre();
    }

    public int getDueñoTelefono() {
        return this.mascotaDueño.getTelefono();
    }

    public boolean esAdulta(int edad)
    {
        if (this.edad >= edad)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String infoMascota ()
    {
        return "nombre de la mascota: "+nombre+" tipo: "+tipo+" edad: "+edad+ " " +this.mascotaDueño.infoDueño();
    }
}
