/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio32 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int suma=0;
    int pares=0;
    int alreves=0;
    
    while (num > 0) {
    
      alreves = num % 10 + alreves * 10;
      num = num / 10;
    
    }
    
    System.out.printf("\nLos dígitos pares son: ");
    
    while (alreves > 0) {
      
      pares = alreves % 10;
      
      if ((pares%2) == 0) {
      
        System.out.printf("%d",pares);
        suma = suma + pares;
      
      } 
      
      alreves = alreves / 10;
      
    } 
    
    System.out.printf("\nLa suma de los dígitos pares es: %d ",suma);

  }
}
