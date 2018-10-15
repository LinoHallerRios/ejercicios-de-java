/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    
    double num=1;
    double media;
    int cont=0;
    double suma=0;
    String numero;
    
    System.out.printf("\nEl programa calcula la media de los números introducidos.");
    
    
    while (num > 0) {
    
      System.out.printf("\nIntroduzca un número ");
      System.out.printf("(Si es negativo se termina el programa): ");
      numero = System.console().readLine();
      num = Double.parseDouble(numero);
      
      if (num > 0) {
      
        suma = suma + num;
        cont++;
      
      }
    
    }
    
    media = suma / cont;
    System.out.printf("\nLa media de los número es: %.2f",media);

  
  
  }
}
