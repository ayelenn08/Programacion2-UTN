import Paquete.Mascota;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Mascota arregloDeMascotas [] = new Mascota[4]; ///Declaramos un arreglo de tipo mascota con dimension 4.

        /// forma si pedimos datos al usuario.
        /// Variables para pedir los datos al usuario.
        String nombreDuenio;
        int telefono;
        String nombreMascota;
        String tipoAnimal;
        int edad;

        int validos=0;
        char seguir='s';

        while(seguir=='s' && validos<arregloDeMascotas.length){

            System.out.println("Ingrese nombre del dueño");
            nombreDuenio = scanner.nextLine();
            System.out.println("Ingrese un telefono");
            telefono = scanner.nextInt();

            scanner.nextLine(); ///Limpia buffer

            System.out.println("Ingrese nombre de la mascota");
            nombreMascota = scanner.nextLine();
            System.out.println("Ingrese la especie de animal");
            tipoAnimal = scanner.nextLine();
            System.out.println("Ingrese edad");
            edad = scanner.nextInt();

            arregloDeMascotas[validos] = new Mascota(nombreMascota,tipoAnimal,edad,nombreDuenio,telefono);
            validos++;

            System.out.println("Desea cargar otra mascota?");
            seguir = scanner.next().charAt(0);
            scanner.nextLine();
        }

        /// forma hardcodeada
        arregloDeMascotas[0] = new Mascota("Nina", "Perro",1,"Ayelen", 12345);
        arregloDeMascotas[1] = new Mascota("Rocco", "Perro",12,"Juan", 5478);
        arregloDeMascotas[2] = new Mascota("Lolo", "Gato",6,"Maria", 9875);
        arregloDeMascotas[3] = new Mascota("Tuki", "Loro",9,"Pepe", 8524);

        //a)
        for (int j = 0; j < arregloDeMascotas.length; j++) {
            System.out.println(arregloDeMascotas[j].infoMascota());
        }

        //b
        String palabra = "perro";
        for (int j = 0; j < arregloDeMascotas.length; j++) {
            if (palabra.equalsIgnoreCase(arregloDeMascotas[j].getTipo())) {
                System.out.println(arregloDeMascotas[j].infoMascota());
            }
        }

        //c)
        String nombrebuscar = "ayelen";
        for (int j = 0; j < arregloDeMascotas.length; j++) {
            if (nombrebuscar.equalsIgnoreCase(arregloDeMascotas[j].getNombreDueño()))
            {
                System.out.println(arregloDeMascotas[j].infoMascota());
            }
        }

        /// Realizamos los ultimos 2 ejercicios en metodos.
        //d)
        mostrarMascotasMayores(arregloDeMascotas, arregloDeMascotas.length);
        //e)
        mostrarPorletra(arregloDeMascotas, arregloDeMascotas.length, 'N');


    }

    public static void mostrarMascotasMayores (Mascota m[], int validos)
    {
        for (int j = 0; j < validos; j++) {
            if (m[j].esAdulta(4))
            {
                System.out.println(m[j].infoMascota());
            }
        }

    }

    public static void mostrarPorletra (Mascota arreglo [], int validos, char buscada)
    {
        for(Mascota m: arreglo)
        {
            if (m.getNombre().toLowerCase().charAt(0)==buscada || m.getNombre().toUpperCase().charAt(0)==buscada)
            {
                System.out.println(m.infoMascota());
            }
        }
    }
}