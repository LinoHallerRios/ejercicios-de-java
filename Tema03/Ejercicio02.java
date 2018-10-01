/**
* Lectura de datos desde teclado
*
* Conversor de euros a pesetas.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio02{
  public static void main(String[] args){
    
    String euro;
    Double pesetas;
    
    System.out.printf("\nIntroduce una cantidad de euros: ");
    euro = System.console().readLine();
    
    pesetas = Integer.parseInt(euro) * 166.386;
    
    System.out.printf("\nLos %d euros serán",Integer.parseInt(euro));
    System.out.printf(" %.3f pesetas",pesetas);
    
    
    
  }

}
