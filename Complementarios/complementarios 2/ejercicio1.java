import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();

        cargarCiudades

        mostrarCiudades
        
    }
        
        
        
    private static void cargarCiudades(List<String> ciudades) {
        System.out.println("Tus ciudades favoritas son:");
        String salir= "";
        
                while (salir!="") {
                    System.out.print("ingrese ciudad: ");
                    Scanner leer = new Scanner(System.in);
                    ciudades.add(leer.nextLine());
                    cont++;
                }



        
    }
        
        int cont=0;
        ArrayList<String> list1 = new ArrayList<String>();
        
        for (int i = 0; i < cont-1; i++) {
            System.out.println("#"+ i + "-" + list1.get(i+1));
        }
    }






