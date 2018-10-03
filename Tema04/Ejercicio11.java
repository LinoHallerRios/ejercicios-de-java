/**
 * 4. Sentencia condicional ( if y switch )
 *
 * Cuantos segundos faltan para medianoche.
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    String hora;
    String minutos;
    int horas1;
    int minutos1;
    int segundos;
    int total;
    
    
    System.out.printf("\nPor favor, introduzca una hora: ");
    hora = System.console().readLine();
    
    System.out.printf("\nAhora los minutos: ");
    minutos = System.console().readLine();
    
    horas1 = Integer.parseInt(hora);
    minutos1 = Integer.parseInt(minutos);
    
    segundos = (horas1 * 3600) + (minutos1 * 60);
    total = (24 * 3600) - segundos;
    
    
    System.out.printf("\nQuedan %d segundos para medianoche.", total);
   
  
  }
}
