/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio25 {

  public static void main(String[] args) {
    
    String altura1;
    double altura;
    String anchura1;
    double anchura;
    double size;
    double envio=3.25;
    double precio;
    double escudo=0;
    double total;
    String bordado;
    
    System.out.printf("\nIntroduzca la altura de la bandera en cm: ");
    altura1 = System.console().readLine();
    altura = Integer.parseInt(altura1);
    
    System.out.printf("\nAhora introduzca la anchura: ");
    anchura1 = System.console().readLine();
    anchura = Integer.parseInt(anchura1);

    System.out.printf("\n¿Quiere escudo bordado? (s/n): ");
    bordado = System.console().readLine();
    
    size = altura * anchura;
    precio = size * 0.01; 
    
    
    if (bordado.equals("s")) {
      
      escudo = 2.50;
      total = precio + envio + escudo;
      
      System.out.printf("\nGracias. Aquí tiene la factura.");
      System.out.printf("\nBandera de %.2f cm2",size);
      System.out.printf("\nCon escudo: 2,50 €");
      System.out.printf("\nGastos de envío: 3,25 €");
      System.out.printf("\nTotal: %.2f €",total);
    
    }else{
    
    total = precio + envio + escudo;
    System.out.printf("\nGracias. Aquí tiene la factura.");
    System.out.printf("\nBandera de %.2f cm2",size);
    System.out.printf("\nSin escudo: 0,00 €");
    System.out.printf("\nGastos de envío: 3,25 €");
    System.out.printf("\nTotal: %.2f €",total);
  }
    
    


  }
}
