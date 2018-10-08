/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio21 {

  public static void main(String[] args) {
    
    double nota1;
    double nota2;
    double media;
    String recuperacion;
    String recuperacion1;
    String notaUno;
    String notaDos;
    
    System.out.printf("\nIntroduzca la nota del primer examen: ");
    notaUno = System.console().readLine();
    nota1 = Double.parseDouble(notaUno);
    
    System.out.printf("\nIntroduzca la nota del segundo examen: ");
    notaDos = System.console().readLine();
    nota2 = Double.parseDouble(notaDos);
    
    media = (nota1 + nota2)/2;
    
    
    if (media  >= 5) {
      
      System.out.printf("\nLa media de la nota es: %.2f ", media);
      
    }
    
    if (media < 5) {
      
      System.out.printf("\n¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      recuperacion = System.console().readLine();
      
      recuperacion1 = recuperacion.toUpperCase();
      
      if (recuperacion1.equals("APTO")) {
      
        System.out.printf("\nLa media es 5");
      
      }
      
      if (recuperacion1.equals("NO APTO")) {
      
        System.out.printf("\nLa media es %.2f ",media);
      
      }
      
      
    }
    
    
  }
}
