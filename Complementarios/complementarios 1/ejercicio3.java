import java.util.Scanner;

public class ejercicio3 {
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese su numero: ");
        int numero = leer.nextInt();
        System.out.println("---------------------------- " );
        System.out.println("Numero ingresado: " + numero);
        int incremento=1;
        String mostrar = incremento + ""; 
        while (incremento < numero) {
            incremento+=1;
            System.out.println(mostrar);
            mostrar = mostrar + " "+ incremento ; 
        }

        System.out.println(mostrar);

        
    }
}