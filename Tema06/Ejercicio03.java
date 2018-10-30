/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    
    int numeroPalo = (int)((Math.random() * 4) + 1 );
    int numeroFigura = (int)((Math.random() * 12) + 1 );
    String nombrePalo="";
    String nombreFigura="";
    
    switch (numeroPalo) {
    
      case 1:
        nombrePalo = "Espada";
        break;
      case 2:
        nombrePalo = "Bastos";
        break;
      case 3:
        nombrePalo = "Oro";
        break;
      case 4:
        nombrePalo = "Copa";
        break;
    }
    
    switch (numeroFigura) {
    
      case 1:
        nombreFigura = "1";
        break;
      case 10:
        nombreFigura = "Sota";
        break;
      case 11:
        nombreFigura = "Caballo";
        break;
      case 12:
        nombreFigura = "Rey";
        break;
      default:
        nombreFigura = String.valueOf(numeroFigura);
    
    }
    
    System.out.printf("\nSu carta generada es %s de %s.",nombreFigura,nombrePalo);
  
  }
}
