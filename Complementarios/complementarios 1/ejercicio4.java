import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese su número: ");
        int numero = leer.nextInt();
        System.out.println("---------------------------- " );
        System.out.println("Numero ingresado: " + numero);

        List<Integer> factoriales = new ArrayList<>(numero); //versión abreviada
        int indice = 1;
        
        while (numero >= indice) {
            factoriales.add(indice);
            indice+=1;
            
        }

        int resultado=1;
        for (int i = 0; i <= factoriales.size()-1  ; i++) {
            resultado = resultado * factoriales.get(i);
            System.out.println("entre "+i+" da "+factoriales.get(i));
        }

        System.out.println("El factoral de "+numero+" es: " + resultado);
    }
}
