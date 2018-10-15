/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    int num;
    int cont=1;
    int positivo=0;
    int negativo=0;
    String numero;
    
    
    while (cont <= 10) {
    
      System.out.printf("\nIntroduzca un número: ");
      numero = System.console().readLine();
      num = Integer.parseInt(numero);
    
      if (num < 0) {
      
        negativo++;
      
      }else {
      
        positivo++;
      
      }

      cont++;
    
    }
    
    System.out.printf("\nHay %d números positivos.",positivo);
    System.out.printf("\nY %d números negativos.",negativo);

  }
}
