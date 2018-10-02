/**
* Sentencia condicional ( if y switch )
*
* Programa en que dado un número del 1 a 7 escriba el 
* correspondiente nombre del día de la semana.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio03{
  public static void main(String[] args){
    
    String numero;
    int diaNumero;
    
    System.out.printf("\nIntroduce un número del 1 al 7: ");
    numero = System.console().readLine();
    
    diaNumero = Integer.parseInt(numero);
    
    switch (diaNumero) {
    
      case 1:
        System.out.printf("\nEl %d corresponde al Lunes.",diaNumero);
        break;
    
      case 2:
        System.out.printf("\nEl %d corresponde al Martes.",diaNumero);
        break;
        
      case 3:
        System.out.printf("\nEl %d corresponde al Miércoles.",diaNumero);
        break;
        
      case 4:
        System.out.printf("\nEl %d corresponde al Jueves.",diaNumero);
        break;
        
      case 5:
        System.out.printf("\nEl %d corresponde al Viernes.",diaNumero);
        break;
        
      case 6:
        System.out.printf("\nEl %d corresponde al Sábado.",diaNumero);
        break;
        
      case 7:
        System.out.printf("\nEl %d corresponde al Domingo.",diaNumero);
        break; 
      
      default:
        System.out.printf("\nEse número no corresponde a ningún día.");
        break;
    }
    
    
  }

}
