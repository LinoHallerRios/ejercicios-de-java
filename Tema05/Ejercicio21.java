/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    
    double num=1;
    double mediaPar;
    double mediaImpar;
    int contPar=0;
    int contImpar=0;
    double suma=0;
    double pares=0;
    double impares=0;
    String numero;
    
    System.out.printf("\nEl programa calcula la media de los números introducidos.");
    
    
    while (num >= 0) {
    
      System.out.printf("\nIntroduzca un número ");
      System.out.printf("(Si es negativo se termina el programa): ");
      numero = System.console().readLine();
      num = Double.parseDouble(numero);
      
      if (num >= 0) {
        
        if ((num % 2) == 0) {
        pares = pares + num;
        contPar++;
        }else {
          
          impares = impares + num;
          contImpar++;
      
        }
        
      }
    
    }
    
    mediaPar = pares / contPar;
    mediaImpar = impares / contImpar;
    
    System.out.printf("\nSe han introducido %d números pares.",contPar);
    System.out.printf("\nLa media de los números pares es: %.2f",mediaPar);
    System.out.printf("\n\nSe han introducido %d números impares.",contImpar);
    System.out.printf("\nLa media de los números impares es: %.2f",mediaImpar);
    
  }
}
