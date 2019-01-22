package ejercicio03;

/**
 *
 * @author Lino Haller Ríos
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String mayor = "0";
    ArrayList<String> listaNumeros = new ArrayList<>();
    ArrayList<String> listaNumerosOrdenada = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      listaNumeros.add(sc.nextLine());
    }

    for (int i = 0; i < 10; i++) {
      mayor = "0";
      for (String n : listaNumeros) {
        if (Integer.parseInt(n) > Integer.parseInt(mayor)) {
          mayor = n;
        }
      }
      
      listaNumerosOrdenada.add(mayor);
      listaNumeros.remove(mayor);
    }
    
    System.out.println(listaNumerosOrdenada);
    
  }
}
