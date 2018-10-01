/**
* Sentencia condicional ( if y switch )
*
* Programa que calcule el salario semanal de un
* trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
* trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
* euros la hora.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio04{
  public static void main(String[] args){
    
    String horas;
    int horasTrabajadas;
    int dineroHoras;
    int diferencia;
    
    
    System.out.printf("\nIntroduce las horas que has");
    System.out.printf(" trabajado durante la semana: ");
    horas = System.console().readLine();
    
    horasTrabajadas = Integer.parseInt(horas);
    
    if (horasTrabajadas <= 40){
      
      dineroHoras = Integer.parseInt(horas) * 12 ;
      System.out.printf("\nEl sueldo semanal que");
      System.out.printf(" le corresponde es de %d € ",dineroHoras);
    }
    
    
    if (horasTrabajadas > 40){
      
      diferencia = horasTrabajadas - 40;
      dineroHoras = 480 + (diferencia * 16);
      System.out.printf("\nEl sueldo semanal que");
      System.out.printf(" le corresponde es de %d € ",dineroHoras);
    }
   
    
  }

}
