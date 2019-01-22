package ejercicio01;

/**
 *
 * @author Lino Haller Rios
 */
import java.util.ArrayList;

public class Ejercicio01 {

  public static void main(String[] args) {

    ArrayList<String> classmates = new ArrayList<String>();

    classmates.add("Borja");
    classmates.add("José Ángel");
    classmates.add("Iván");
    classmates.add("Jorge");
    classmates.add("Rafa");
    classmates.add("José Robles");

    System.out.println();

    for (String nombres : classmates) {
      System.out.println(nombres);
    }

  }

}
