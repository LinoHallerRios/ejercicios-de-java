/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */

public class Ejercicio15 {

  public static void main(String[] args) {
    
    
    int exponente;
    double potencia;
    int cont=1;
    int cont2=0;
    double base;
    int exp;
    
    System.out.printf("\nIntroduzca una base: ");
    base = Double.parseDouble(System.console().readLine());
    
    System.out.printf("\nIntroduzca un exponente: ");
    exp= Integer.parseInt(System.console().readLine());


    while (cont <= exp) {
      
      potencia = 0;
      exponente = cont;
      
      while (cont2 < exponente) {
      
        potencia = Math.pow(base,cont);
        cont2++;
        
      }
      
      System.out.printf("\n%.2f ^ %d = %.2f",base,cont,potencia);
      
      cont++;
      
    }


  }
}
