import java.util.Scanner;

public class ejercicio8 {
    

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese primer Nombre y Apellido: ");
        String nombre = leer.nextLine();
        System.out.print("ingrese segundo Edad: ");
        String edad = leer.nextLine();
        System.out.print("ingrese segundo Dirección: ");
        String dirección = leer.nextLine();
        System.out.print("ingrese segundo Ciudad: ");
        String ciudad = leer.nextLine();
        System.out.println("------------------- ");

        System.out.println(ciudad+" - "+dirección+" - "+edad+" - "+nombre );
    }
}
