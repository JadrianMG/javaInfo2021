import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {

    List<Integer> numeros= new ArrayList<>();
    cargarLista(numeros);
  
  }

  public static void cargarLista(List<Integer> numeros) {
  //Recorre para llenar la lista con números aleatorios   

  for (int i = 0; i < 10; i++) {
    //numeros.add((int)(Math.random()*100+1));
    numeros.add(i);
    /*
    System.out.print(numeros.get(i)+ "❤ ");
    System.out.print(numeros.get(i)+ "♢ ");
    System.out.print(numeros.get(i)+ "♠️ ");
    System.out.print(numeros.get(i)+ "♧ ");
    */
  }
  

        // Esta línea es la que organiza el ArrayList
    /*
        Collections.sort(numeros);
        System.out.println();

        for (Integer integer : numeros) 
            System.out.print(integer + " " );
*/
      }
}






