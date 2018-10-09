/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio22 {

  public static void main(String[] args) {
    
    int dia1;
    int hora1;
    int min1;
    String dia;
    String hora;
    String min;
    int minRestantes;
    int minutos;
    int total;
   
    
    System.out.printf("\nIntroduce un número del día de la semana(lunes a jueves): ");
    System.out.printf("\n1.Lunes");
    System.out.printf("\n2.Martes");
    System.out.printf("\n3.Miercoles");
    System.out.printf("\n4.Jueves\n\n");
    dia = System.console().readLine();
    dia1 = Integer.parseInt(dia);
    
    System.out.printf("\nIntroduce una hora:  ");
    hora = System.console().readLine();
    hora1 = Integer.parseInt(hora);
    
    System.out.printf("y ahora los minutos: ");
    min = System.console().readLine();
    min1 = Integer.parseInt(min);
    
   
    
    switch (dia1) {
      
      case 1:
      
      minRestantes = (15 * 60) + (60 * 24 * 4) ;
      minutos = (1 * 24 * 60) + (hora1 * 60) + min1;
      total = minRestantes - minutos;
      System.out.printf("\nQuedan %d minutos para el fin de semana.",total);
      break;
      
      case 2:
      
      minRestantes = (15 * 60) + (60 * 24 * 4) ;
      minutos = min1 + (2 * 24 * 60) + (hora1 * 60);
      total = minRestantes - minutos;
      System.out.printf("\nQuedan %d minutos para el fin de semana.",total);
      break;
      
      case 3:
      
      minRestantes = (15 * 60) + (60 * 24 * 4) ;
      minutos = (3 * 24 * 60) + (hora1 * 60) + min1;
      total = minRestantes - minutos;
      System.out.printf("\nQuedan %d minutos para el fin de semana.",total);
      break;
      
      case 4:
      
      minRestantes = (15 * 60) + (60 * 24 * 4) ;
      minutos = (4 * 24 * 60) + (hora1 * 60) + min1;
      total = minRestantes - minutos;
      System.out.printf("\nQuedan %d minutos para el fin de semana.",total);
      break;
      
    
    }
    

  }
}
