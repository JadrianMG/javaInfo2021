import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    System.out.print("ingrese palabra: ");
    String nombre = leer.nextLine();   
    String resultado="";
    for ( int i = 0; i < nombre.length(); ++i ) {
        char c = nombre.charAt( i );
        int j = (int) c;     
        if ((96<j) &&(j<123)) {
            char c2 = (char) (j -32);
            resultado= resultado + c2 ;
        } else{  
            resultado= resultado + c ;
        }
    }
    System.out.println(resultado);
}
}
