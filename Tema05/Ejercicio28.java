/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio28 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduzca un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
  
    int cont=0;
    int factorial=1;


    for (int i = 1; i != num + 1; i++) {
      
      factorial *= i;
      
    }

    System.out.printf("\n!6 = %d",factorial);
    

  }
}
