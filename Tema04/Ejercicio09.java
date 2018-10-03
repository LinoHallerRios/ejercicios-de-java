/**
 * 4. Sentencia condicional ( if y switch )
 *
 * Programa que resuelve una ecuación de segundo grado
 * del tipo (ax2 + bx + c = 0)
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio09 {

  public static void main(String[] args) {
    
    double primeraX;
    double segundaX;
    double discriminante;
    
    System.out.printf("\nPor favor, introduzca los valores de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.printf("\nPor favor, introduzca los valores de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.printf("\nPor favor, introduzca los valores de c:");
    double c = Double.parseDouble(System.console().readLine());
    
    discriminante = Math.pow(b,2.0) - (4 * a * c);
  
    
    if ((c == 0) && (b == 0) && (a == 0)) {
      System.out.printf("\nLa ecuación tiene infinitas soluciones.");
    }
    
    if ((a != 0) && (b != 0) && (c == 0)) {
      segundaX = (-b / a) ;
      System.out.printf("x1 = 0");
      System.out.printf("x2 = %.2f ",segundaX);
    }

    if ((c != 0) && (b == 0) && (a == 0)) {
      System.out.printf("\nNo tiene solución.");
    }
      
    if ((a == 0) && (b != 0) && (c != 0)) {
      primeraX = -c / b ;
      System.out.printf("\nx = %.2f ",primeraX);
    }
    
    if (discriminante < 0) {
      double b2 = b*b;
      System.out.printf("\nDiscriminate = %.2f - 4 * %.2f * %.2f = %.2f",b2,a,c,discriminante);
      System.out.printf("\nNo tiene raices.");

    }
    
    if ((a != 0) && (b != 0) && (c != 0) && (discriminante >= 0)) {
      
      primeraX = (-b + Math.sqrt(discriminante))/(2 * a);
      segundaX = (-b - Math.sqrt(discriminante))/(2 * a);
        
      System.out.printf("x1 = %.2f ",primeraX );
      System.out.printf("x2 = %.2f ",segundaX );

    }
    
    

  }
}
