import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese frase: ");
        String frase = leer.nextLine();

        System.out.print("ingrese una letra: ");
        String letra = leer.next();
        
        while (letra.length()>1) {
            System.out.print("ingrese UNA letra: ");
            letra = leer.next();
        }
        
        
        System.out.println("------------------- ");


        int pos =0;
        int contador=0;
        pos=frase.indexOf(letra);

        while (pos != -1) {
            contador++;
            pos= frase.indexOf(letra,pos+1);
        }

        System.out.println(contador);
    }
}
