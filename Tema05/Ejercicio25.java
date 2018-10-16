/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio25 {

  public static void main(String[] args) {

    int alreves=0;
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());

    while (num > 0) {
    
      alreves = num % 10 + alreves * 10;
      num = num / 10;
    
    }
    
    System.out.printf("\nEl número al revés será: %d ",alreves);

  }
}
