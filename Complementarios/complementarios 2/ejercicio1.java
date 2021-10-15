import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    List<String> ciudades= new ArrayList<>();
    System.out.print("¿Cuantas ciudades va a cargar?: ");
    Scanner leer = new Scanner(System.in);
    int cant= leer.nextInt();
    
    cargarCiudades(ciudades,cant);
    mostrarCiudades(ciudades,cant);
    }
    
    private static void cargarCiudades(List<String> ciudades, int cant){
    Scanner lect= new Scanner(System.in);
    for (int i = 0; i < cant; i++) {
        System.out.print("Ingresar ciudad:"); 
        ciudades.add(lect.nextLine());  
    }
    
    }
    
    private static void mostrarCiudades(List<String> ciudades,int cant){
        for (int i = 0; i < cant; i++) {
            System.out.println("#"+(i+1)+" - "+ciudades.get(i)); 
        }
    } 
    
}






