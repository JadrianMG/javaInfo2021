import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese primer número: ");
        int numeroUno = leer.nextInt();
        System.out.print("ingrese segundo número: ");
        int numeroDos = leer.nextInt();
        System.out.println("------------------- ");

        int resultado = 1;
        for (int i = 0; i < numeroDos; i++) {
            resultado= resultado * numeroUno;
        }
        System.out.println(numeroUno+" elevado a "+numeroDos+ " es igual a: " + resultado);
        


        
    }
}
