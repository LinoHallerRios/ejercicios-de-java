/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    
    int cont=0;
    int num1=0;
    int num2=0;
    int num3=0;
    
    num1 = (int)((Math.random() * 7) + 1);
    num2 = (int)((Math.random() * 7) + 1);
    num3 = (int)((Math.random() * 7) + 1);
    
    int suma = num1+num2+num3;
      
    System.out.printf("\nEl dado ha sacado %d",num1);
    System.out.printf("\nEl dado ha sacado %d",num2);
    System.out.printf("\nEl dado ha sacado %d",num2);
    System.out.printf("\nLa suma es %d",suma);
      
      cont++;
    
    
    
    
  }
}
