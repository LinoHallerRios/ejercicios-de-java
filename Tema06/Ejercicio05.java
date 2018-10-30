/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    
    int num=0;
    int numMax=100;
    int numMin=199;
    double suma=0;
    double media=0;
    
    for (int i=0; i < 50; i++) {
    
      num = (int)((Math.random() * 100) + 100);
    
      System.out.printf(" %d",num);
      
      suma += num;
      
      if (num < numMin) {
      
        numMin = num;
      
      }
      
      if (num > numMax) {
      
        numMax = num;
      
      }
      
      
    }
    
    System.out.printf("\n");
    
    media = suma / 50;
    
    System.out.printf("\n La media de todos los números es %.2f",media);
    System.out.printf("\n El máximo ha sido %d",numMax);
    System.out.printf("\n El mínimo ha sido %d",numMin);
    
    
  }
}
