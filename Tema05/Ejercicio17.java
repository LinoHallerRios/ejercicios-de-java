/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    int num;
    int cont;
    int suma=0;
    String numero;

    System.out.printf("\nIntroduzca un número : ");
    numero = System.console().readLine();
    num = Integer.parseInt(numero);
    
    if (num < 0) {
    
      System.out.printf("\nEl número no es positivo.");

    }else {
      
      cont = num;
      num = num + 100;
      while (cont < num) {
      
       suma = suma + cont;
       cont++;
      
      }

      System.out.printf("La suma de los 100 números siguientes es %d",suma);
    
    
    }
    
    
    
    
  }
}
