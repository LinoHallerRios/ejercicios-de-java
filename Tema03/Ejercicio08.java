/**
* Lectura de datos desde teclado
*
* Programa que calcula el salario semanal de un empleado en base
* a las horas trabajadas, a razón de 12 euros la hora.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio08 {
  public static void main(String[] args){
    
    String horas;
    int dineroHoras;
    
    System.out.printf("\nIntroduce las horas que has trabajado en una semana:");
    horas = System.console().readLine();
    
    dineroHoras = Integer.parseInt(horas) * 12;
   
    System.out.printf("\nGanas %d euros a la semana ",dineroHoras);
  

  }

}
