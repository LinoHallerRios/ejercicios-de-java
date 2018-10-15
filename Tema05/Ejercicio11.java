/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    int num;
    int cont=1;
    int cubo;
    int cuadrado;
    String numero;
    
    System.out.printf("\nIntroduzca un número: ");
    numero = System.console().readLine();
    num = Integer.parseInt(numero);
    
    System.out.printf("\n Número--------Cuadrado------Cubo\n");
    
    while (cont < 6) {
    
      cuadrado  =num * num;
      cubo = num * num * num;
      
      System.out.printf("\n  %d  --------  %d  --------  %d",num,cuadrado,cubo);
      
      num++;
      cont++;
    
      

    }
  

  }
}
