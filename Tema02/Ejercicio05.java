/**
* Variables
* 
* Conversor de pesetas a euros. La cantidad en euros que se quiere
* convertir está almacenada en una variable.
*
* @author Lino Haller Ríos
*/
public class Ejercicio05 {
  public static void main(String[] args){
    
    double x;
    double y;
    
    x=600;
    y=600 / 166.386;
    
    System.out.printf("\n Tengo %.0f pesetas.",x);
    System.out.printf("\n %.0f pesetas serán %.3f euros.",x,y);

  }

}
