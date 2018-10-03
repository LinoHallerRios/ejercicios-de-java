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
public class Ejercicio06{
  public static void main(String[] args){
    
    String altura;
    double h;
    double t;
    double g;
    
    System.out.printf("\nEste programa calcula el tiempo que tarda en caer");
        System.out.printf(" un objeto desde una altura h. ");
        
    System.out.printf("\nPorfavor, introduzca el valor de h en metros: ");
        altura = System.console().readLine();
        h = Double.parseDouble(altura);
        g = 9.81;
        t = Math.sqrt((2*h)/g);
        
    System.out.printf("\nTardará %.2f segundos.",t);
    
    
  }

}
