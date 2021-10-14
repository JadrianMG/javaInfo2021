import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese primer número: ");
        int numeroUno = leer.nextInt();
        System.out.print("ingrese segundo número: ");
        int numeroDos = leer.nextInt();
        System.out.println("------------------- ");
        System.out.println(numeroUno+" + "+numeroDos+ " = " + (numeroUno+numeroDos));
        System.out.println(numeroUno+" - "+numeroDos+ " = " + (numeroUno-numeroDos));
        System.out.println(numeroUno+" * "+numeroDos+ " = " + (numeroUno*numeroDos));
        System.out.println(numeroUno+" / "+numeroDos+ " = " + (numeroUno/numeroDos));
        System.out.println(numeroUno+" % "+numeroDos+ " = " + (numeroUno%numeroDos));
        
    }
}