import java.util.*;

class Baraja {
    private String palo;
    private int numero;

  public static void Baraja() {

  }

  public Baraja(int _numero, String _palo) {
    this.numero = _numero;
    this.palo = _palo;
  }

  public String getPalo() {
    return this.palo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setPalo(String _palo) {
    this.palo = _palo;
  }

  public void setNumero(int _numero) {
    this.numero = _numero;
  }
}

public class prueba{

  public static void main(String[] args) {
    String Palo[] = {"Oros","Bastos","Espadas","Copas"}; //Array con el valor de los palos de la baraja
    Scanner sc = new Scanner(System.in);
    System.out.println("Diga el número de cartas que desea:");
    int cantidad = sc.nextInt();
    ArrayList<Baraja> barajas = new ArrayList<Baraja>();
    while (cantidad > 0) {
      int numero = ((int) Math.round(Math.random() * 11)) + 1; // produce números entre 1 y 12 aleatoriamente
      int p = (int) Math.round(Math.random() * 3); // produce números entre 0 y 3 aleatoriamente
      boolean existe = false;
      Baraja baraja = new Baraja(numero, Palo[p]); // Creamos la baraja
      for(int i = 0; i < barajas.size(); i++) {
        if(numero == barajas.get(i).getNumero() && Palo[p] == barajas.get(i).getPalo()) { // comparamos la baraja con las ya almacenadas
          existe = true;
          break; // Si la baraja ya fue seleccionada no se sigue verificando
        }
      }
      if(!existe) {
        barajas.add(baraja); // solo añadimos la baraja si es diferente a todas las ya escogidas
        cantidad--;
      }
    }
  barajas.forEach(baraja -> System.out.println("Baraja: " + baraja.getNumero() + " de " + baraja.getPalo()));
  }
}