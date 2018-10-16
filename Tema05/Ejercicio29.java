/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio29 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduzca un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.printf("\nIntroduzca otro número entero: ");
    int numDivision = Integer.parseInt(System.console().readLine());
  
    int suma=0;
    int cont=0;

    System.out.printf("\nLos números menores que");
    System.out.printf(" %d y no divisibles entre %d son: ",num,numDivision);

    for (int i = 0; i != num; i++) {
      
      if ((i%numDivision) != 0) {
      
        System.out.printf("\n%d",i);

      }
    }

  }
}
