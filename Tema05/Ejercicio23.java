/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio23 {

  public static void main(String[] args) {

    int cont = 0;
    double suma=0;
    double num;
    double media;
    
    while (suma < 1000 ) {
    
      System.out.printf("\nIntroduzca un número : ");
      num = Double.parseDouble(System.console().readLine());
      
      suma = suma + num;
      cont++;
    
    }
    
    
    media = suma / cont;
    
    System.out.printf("\nHas introducido %d números.",cont);
    System.out.printf("\nLa suma de todos es %.2f ",suma);
    System.out.printf("\nLa media de los números es %.2f ",media); 


  }
}
