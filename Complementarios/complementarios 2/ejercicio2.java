import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    List<Integer> numeros= new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    cargarNumeros(numeros);
		System.out.println("tamaño de la lista: "+numeros.size()); 
    agregarExtremos(numeros);
    iterarNumeros(numeros);
		System.out.println("tamaño de la lista: "+numeros.size()); 

  }

  private static void cargarNumeros(List<Integer> numeros){
    Scanner lect= new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println("Ingresar numero "+(i+1)+":"); 
      numeros.add(lect.nextInt());  
    }
  }

  private static void agregarExtremos(List<Integer> numeros){
      Scanner lect= new Scanner(System.in);
      System.out.println("Ingresar numero inicial:"); 
      numeros.add(0,lect.nextInt());
      System.out.println("Ingresar numero Final:"); 
      numeros.add(lect.nextInt());
  }

  private static void iterarNumeros(List<Integer> numeros) {
      Scanner lect= new Scanner(System.in);
      System.out.println("¿Cuantas veces quiere iterar? :"); 
      int cant=lect.nextInt();
      for (int i = 1; i <= cant; i++) {
				System.out.println(numeros); 
      }
  }

	private static void name() {
		
	}

    
}






