/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio26 {

  public static void main(String[] args) {
    
    System.out.printf("\nIntroduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.printf("\nIntroduzca el dígito del que desea saber la posción: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    int alreves=0;
    int numero;

    while (num > 0) {
    
      alreves = num % 10 + alreves * 10;
      num = num / 10;
    
    }

    for (int i = 1; alreves > 0; i++) {
      
      numero = alreves % 10;
    
      if (numero == digito) {
        
        System.out.printf("\nEl dígito %d está en la posición %d",digito,i);
      
      }
      
      alreves /= 10; 
    
    }
  
  
  
  }
}
