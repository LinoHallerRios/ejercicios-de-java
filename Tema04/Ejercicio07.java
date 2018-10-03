/**
* Sentencia condicional ( if y switch )
*
* Programa que calcule la media de tres notas.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio07{
  public static void main(String[] args){
    
    String nota1;
    String nota2;
    String nota3;
    double media;
    double primera;
    double segunda;
    double tercera;
    
    
    System.out.printf("\nEste programa calcula la media de 3 notas.");
        
    System.out.printf("\n\nPorfavor, introduzca una nota: ");
        nota1 = System.console().readLine();

    System.out.printf("\nPorfavor, introduzca otra nota: ");
        nota2 = System.console().readLine();
        
    System.out.printf("\nPorfavor, introduzca la última nota: ");
        nota3 = System.console().readLine();
        
    primera = Double.parseDouble(nota1);
    segunda = Double.parseDouble(nota2);
    tercera = Double.parseDouble(nota3);
    
    media = (primera + segunda + tercera)/3;
        
        
    System.out.printf("\nLa media de las notas será: %.2f",media);
    
    
  }

}
