/**
* Sentencia condicional ( if y switch )
*
* Ordena 3 números de mayor a menor.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio13{
  public static void main(String[] args){
    
    String num1;
    String num2;
    String num3;
    double primerNum;
    double segundoNum;
    double tercerNum;
    
    
    System.out.printf("\nEste programa ordena 3 números de mayor a menor.");
        
    System.out.printf("\n\nPorfavor, introduzca un número: ");
        num1 = System.console().readLine();

    System.out.printf("\nPorfavor, introduzca otro número: ");
        num2 = System.console().readLine();
        
    System.out.printf("\nPorfavor, introduzca el último número: ");
        num3 = System.console().readLine();
        
    primerNum = Double.parseDouble(num1);
    segundoNum = Double.parseDouble(num2);
    tercerNum = Double.parseDouble(num3);
    
    if ((primerNum > segundoNum) && (primerNum > tercerNum)){
    
      if (segundoNum > tercerNum){
      
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f ",primerNum,segundoNum,tercerNum);
        
      } else {
        
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f",primerNum,tercerNum,segundoNum);
        
        }
    }
    
    if ((segundoNum > primerNum) && (segundoNum > tercerNum)){
    
      if (primerNum > tercerNum){
      
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f",segundoNum,primerNum,tercerNum);
        
      } else {
        
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f",segundoNum,tercerNum,primerNum);
        
        }
    }
    
    if ((tercerNum > primerNum) && (tercerNum > segundoNum)){
    
      if (primerNum > segundoNum){
      
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f",tercerNum,primerNum,segundoNum);
        
      } else {
        
        System.out.printf("\nEl orden de los números será: ");
        System.out.printf("%.2f > %.2f > %.2f",tercerNum,segundoNum,primerNum);
        
        }
    }
    

  }

}
