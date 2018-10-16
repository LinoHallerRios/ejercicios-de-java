/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio27 {

  public static void main(String[] args) {
  
    System.out.printf("\nIntroduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
  
    int suma=0;
    int cont=0;

    System.out.printf("\nLos números múltiplos de 3 entre 1 y %d son: ",num);

    for (int i = 1; i != num; i++) {
      
      if ((i%3) == 0) {
      
        System.out.printf("\n%d",i);
        suma += i;
        cont++;
      
      }
    }

    System.out.printf("\nEntre el 1 y el %d hay %d múltiplos",num,cont);
    System.out.printf("\nLa suma de los múltiplos es: %d ",suma);
    

  }
}
