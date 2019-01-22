package ejercicio04;

/**
 *
 * @author Lino Haller Ríos
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String mayor = "";
    ArrayList<String> listaNumeros = new ArrayList<>();
    ArrayList<String> listaNumerosOrdenada = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce una palabra: ");
      listaNumeros.add(sc.nextLine());
    }

    for (int i = 0; i < 10; i++) {
      mayor = "";
      for (String n : listaNumeros) {
        if (n.length() > mayor.length()) {
          mayor = n;
        }
      }
      
      listaNumerosOrdenada.add(mayor);
      listaNumeros.remove(mayor);
    }
    System.out.println();
    System.out.println(listaNumerosOrdenada);
    
  }
}
