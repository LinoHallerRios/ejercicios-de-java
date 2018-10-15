/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    int num;
    int cont=0;
    String numero;

    System.out.printf("\nIntroduzca un número : ");
    numero = System.console().readLine();
    num = Integer.parseInt(numero);
    
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        cont = 1;
      }
    }
      
    if (cont == 1) {
      System.out.printf("\nEl número no es primo.");
    } else {
      System.out.printf("\nEl número es primo.");
    }

  }
}
