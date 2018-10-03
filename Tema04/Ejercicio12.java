/**
 * 4. Sentencia condicional ( if y switch )
 *
 * Cuestionario.
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    
    
    System.out.printf("\nCuestionario.");
    
    System.out.printf("\n1.¿Para que sirve / n en java? : ");
    System.out.printf("\na) Para cerrar el programa.");
    System.out.printf("\nb) Para hackear el pentágono.");
    System.out.printf("\nc) Para hacer un salto de línea.\n\n");
    String primeraPregunta = System.console().readLine();
    
    System.out.printf("\n2.¿Como se llama el S.O que utilizamos?");
    System.out.printf("\na) Windows.");
    System.out.printf("\nb) Ubuntu.");
    System.out.printf("\nc) Ninguno.\n\n");
    String segundaPregunta = System.console().readLine();
    
    System.out.printf("\n3.¿Que sentencias condicionales hemos visto? ");
    System.out.printf("\na) If y Dump");
    System.out.printf("\nb) Switch");
    System.out.printf("\nc) If y Switch\n\n");
    String terceraPregunta = System.console().readLine();
    
    System.out.printf("\n4.¿De que asignatura va a ser la última pregunta? ");
    System.out.printf("\na) De Lenguaje de Marcas. ");
    System.out.printf("\nb) De Entornos de desarrollo.");
    System.out.printf("\nc) De ninguna de las otras dos.\n\n");
    String cuartaPregunta = System.console().readLine();
    
    System.out.printf("\n5.¿Con que etiqueta de html se pone negrita la letra?");
    System.out.printf("\na) <strong>");
    System.out.printf("\nb) <i>");
    System.out.printf("\nc) <b>\n\n");
    String quintaPregunta = System.console().readLine();
    
    System.out.printf("\n6.¿Para qué sirve el ratón? ");
    System.out.printf("\na) Para mover el puntero.");
    System.out.printf("\nb) Para darle de comer al gato.");
    System.out.printf("\nc) Para borrar el S.O\n\n");
    String sextaPregunta = System.console().readLine();
    
    System.out.printf("\n7.¿Que es SQL? : ");
    System.out.printf("\na) Es un lenguaje diseñado para administrar SGBD relacionales.");
    System.out.printf("\nb) La nueva hamburguesa del Burguer King.");
    System.out.printf("\nc) Un SGBD\n\n");
    String septimaPregunta = System.console().readLine();
    
    System.out.printf("\n8.¿Porque estás haciendo este cuestionario?");
    System.out.printf("\na) Me han obligado.");
    System.out.printf("\nb) No tenía nada que hacer.");
    System.out.printf("\nc) PIPO\n\n");
    String octavaPregunta = System.console().readLine();
    
    System.out.printf("\n9.¿Como se llama el programa que ejecuta el cuestionario ? : ");
    System.out.printf("\na) Emulador de terminal.");
    System.out.printf("\nb) Rectángulo negro.");
    System.out.printf("\nc) PFETCS\n\n");
    String novenaPregunta = System.console().readLine();
    
    System.out.printf("\n10.¿Que es CSS?");
    System.out.printf("\na) Es una sigla militar.");
    System.out.printf("\nb) Es un lenguaje de diseño gráfico.");
    System.out.printf("\nc) El nombre de un libro de Stephen King.\n\n");
    String decimaPregunta = System.console().readLine();
    
    int contador = 0;
    
    if (primeraPregunta.equals("c")) {
      contador++;
    }
      
    if (segundaPregunta.equals("b")) {
      contador++;
    }
    
    if (terceraPregunta.equals("c")) {
      contador++;
    }
    
    if (cuartaPregunta.equals("a")) {
      contador++;
    }
    
    if (quintaPregunta.equals("a") || quintaPregunta.equals("c")) {
      contador++;
    }
    
    if (sextaPregunta.equals("a")) {
      contador++;
    }
    
    if (septimaPregunta.equals("a")) {
      contador++;
    }
    
    if (octavaPregunta.equals("c")) {
      contador++;
    }
    
    if (novenaPregunta.equals("a")) {
      contador++;
    }
    
    if (decimaPregunta.equals("b")) {
      contador++;
      }
    
System.out.printf("\n\nEl total de puntos conseguidos es %d",contador);
   
  
  }
}
