import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Collections;


public class prueba {
    
    
        public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5); 
        lista.add(7); 
        lista.add(3);
    
        Collections.sort(lista);
    
        for (Integer numero: lista) {
            System.out.println(numero);
        }   
    
        

				CopyOnWriteArrayList<Integer> numeros = new CopyOnWriteArrayList<>();

        //Recorre para llenar la lista con números aleatorios   
        for (int i = 0; i < 40; i++) {
            numeros.add((int)(Math.random()*100+1));
            System.out.print(numeros.get(i)+ "❤ ");
        }

        // Esta línea es la que organiza el ArrayList
        Collections.sort(numeros);
        System.out.println();

        for (Integer integer : numeros) 
            System.out.print(integer + " " );

}
}