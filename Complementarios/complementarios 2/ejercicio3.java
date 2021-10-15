import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.Spring;

public class ejercicio3 {
  public static void main(String[] args) {
    List<String> numeros= new ArrayList<>();
    cargarLista(numeros);
    System.out.println("Baraja: "+numeros);
    imprimirBarajaInversa(numeros);
    desordenarBaraja(numeros);
    //imprimirBaraja(numeros);
    //System.out.println(numeros);
  }
  public static void cargarLista(List<String> numeros) {
    List<String> palo = new ArrayList<>();
    palo.add("❤ ");
    palo.add("♢ ");
    palo.add("♠️ ");
    palo.add("♧ ");    
    for (int j = 0; j < 4; j++) {
      for (int i = 1; i < 14; i++) {
        //numeros.add(i+ palo.get(j));
        numeros.add(i+ palo.get(j));  
      }
    }
    
  }
  public static void imprimirBarajaInversa(List<String> numeros) {
    List<String> numerosInversos= new ArrayList<>();
    for (int i = 52; i > 0; i--) {
      numerosInversos.add(numeros.get(i-1));

    }
    System.out.println("----------------------------------");
    System.out.println("Baraja Invertida: "+numerosInversos);
    }

  public static void desordenarBaraja(List<String> numeros) {
    String Palo[] = {"❤ ","♢ ","♠️ ","♧ "}; 
    int cantidad = 52;
    ArrayList<Baraja> barajas = new ArrayList<Baraja>();
    while (cantidad > 0) {
      int numero = ((int) Math.round(Math.random() * 12)) + 1; 
      int p = (int) Math.round(Math.random() * 3); 
      boolean existe = false;
      Baraja baraja = new Baraja(numero, Palo[p]); 
      for(int i = 0; i < barajas.size(); i++) {
        if(numero == barajas.get(i).getNumero() && Palo[p] == barajas.get(i).getPalo()) { 
          existe = true;
          break; 
        }
      }
      if(!existe) {
        barajas.add(baraja); 
        cantidad--;
      }
    }
  System.out.println("Cartas Desordenadas: ");
  barajas.forEach(baraja -> System.out.print( baraja.getNumero() + " " + baraja.getPalo()+"   "));
    
  }
  }








