package ejercicio02;

/**
 *
 * @author Lino
 */
import java.util.ArrayList;

public class Ejercicio02 {

  public static void main(String[] args) {

    int suma = 0;
    int maximo = 0;
    int minimo = 100;
    int elementosLista = (int) (Math.random() * 11 + 10);

    ArrayList<Integer> lista = new ArrayList<>();

    for (int e = 0; e < elementosLista; e++) {
      lista.add((int) (Math.random() * 101));
    }

    for (int i = 0; i < elementosLista; i++) {
      suma += lista.get(i);

      if (lista.get(i) < minimo) {
        minimo = lista.get(i);
      }

      if (lista.get(i) > maximo) {
        maximo = lista.get(i);
      }

    }
    System.out.println();
    System.out.println(lista);
    System.out.println();
    System.out.printf("\nLa suma es: %d", suma);
    System.out.printf("\nEl máximo es: %d", maximo);
    System.out.printf("\nEl mínimo es: %d\n", minimo);

  }
}
