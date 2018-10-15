/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    
    int baseInt;
    int expInt;
    int potencia=1;
    int cont=0;
    String base;
    String exp;
    
    System.out.printf("\nIntroduzca una base(entero positiva): ");
    base = System.console().readLine();
    baseInt = Integer.parseInt(base);
  
    System.out.printf("\nIntroduzca un exponente(entero positivo): ");
    exp = System.console().readLine();
    expInt = Integer.parseInt(exp);
    
    
    if (expInt > 0) {
    
      while (cont < expInt) {
      
        potencia = potencia * baseInt;
        cont++;
      }

    }
    
    if (expInt < 0 || baseInt < 0) {
    
      System.out.printf("\nEl exponente/base no es entero positiv@ ");

    }
    
    if (expInt == 0) {
    
      potencia = 1;
    
    }
  
    System.out.printf("\n %d ^ %d = %d",baseInt,expInt,potencia);
  
  
  }
}
