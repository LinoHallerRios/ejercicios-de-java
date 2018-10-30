/**
 * 24/10/2018
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    
    int numeroPalo = (int)((Math.random() * 4) + 1 );
    int numeroFigura = (int)((Math.random() * 13) + 1 );
    String nombrePalo="";
    String nombreFigura="";
    
    switch (numeroPalo) {
    
      case 1:
        nombrePalo = "Corazones";
        break;
      case 2:
        nombrePalo = "Picas";
        break;
      case 3:
        nombrePalo = "Tréboles";
        break;
      case 4:
        nombrePalo = "Diamantes";
        break;
    }
    
    switch (numeroFigura) {
    
      case 1:
        nombreFigura = "As";
        break;
      case 11:
        nombreFigura = "J";
        break;
      case 12:
        nombreFigura = "Q";
        break;
      case 13:
        nombreFigura = "K";
        break;
      default:
        nombreFigura = String.valueOf(numeroFigura);
    
    }
    
    
    System.out.printf("\nSu carta generada es %s de %s.",nombreFigura,nombrePalo);
    
  
  }
}
