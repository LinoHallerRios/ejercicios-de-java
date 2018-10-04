/**
 * 4. Sentencia condicional ( if y switch )
 *
 * Cuestionario.
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    
    int contador = 0;
    
    System.out.printf("\nTest de infidelidad.");
    System.out.printf("\nResponde con si o no.");
    
    
    System.out.printf("\n\n1. Tu pareja parece estar ");
    System.out.printf("más inquieta de lo normal sin ningún motivo aparente.\n");
    String primeraPregunta = System.console().readLine();
    
    primeraPregunta = primeraPregunta.toUpperCase();
    
    if (primeraPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n2. Ha aumentado sus gastos de vestuario.\n");
    String segundaPregunta = System.console().readLine();
    
    segundaPregunta = segundaPregunta.toUpperCase();
    
    if (segundaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n3. Ha perdido el interés que mostraba");
    System.out.printf(" anteriormente por ti.\n");
    String terceraPregunta = System.console().readLine();
    
    terceraPregunta = terceraPregunta.toUpperCase();
    
    if (terceraPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n4. Ahora se afeita y se asea con más frecuencia");
    System.out.printf(" o se arregla el pelo y se asea)");
    System.out.printf(" con más frecuencia.\n");
    String cuartaPregunta = System.console().readLine();
    
    cuartaPregunta = cuartaPregunta.toUpperCase();
    
    if (cuartaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n5. No te deja que mires la agenda de");
    System.out.printf(" su teléfono móvil\n");
    String quintaPregunta = System.console().readLine();
    
    quintaPregunta = quintaPregunta.toUpperCase();
    
    if (quintaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n6. A veces tiene llamadas que dice no querer");
    System.out.printf(" contestar cuando estás tú delante.\n");
    String sextaPregunta = System.console().readLine();
    
    sextaPregunta = sextaPregunta.toUpperCase();
    
    if (sextaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n7. Últimamente se preocupa más en cuidar la");
    System.out.printf(" línea y/o estar bronceado/a.\n");
    String septimaPregunta = System.console().readLine();
    
    septimaPregunta = septimaPregunta.toUpperCase();
    
    if (septimaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n8. Muchos días viene tarde después");
    System.out.printf(" de trabajar porque dice tener mucho más trabajo.\n");
    String octavaPregunta = System.console().readLine();
    
    octavaPregunta = octavaPregunta.toUpperCase();
    
    if (octavaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n9. Has notado que últimamente se perfuma más.\n");
    String novenaPregunta = System.console().readLine();
    
    novenaPregunta = novenaPregunta.toUpperCase();
    
    if (novenaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    
    
    System.out.printf("\n\n10. Se confunde y te dice que ha estado");
    System.out.printf(" en sitios donde no ha ido contigo.\n");
    String decimaPregunta = System.console().readLine();
    
    decimaPregunta = decimaPregunta.toUpperCase();
    
    if (decimaPregunta.equals("SI")){
    
      contador = contador + 3;
    
    }
    

    if ((contador >= 0) && (contador <= 10) ) {
    
      System.out.printf("\n\nEnhorabuena tu pareja parece ser totalmente fiel.");
    
    }

    if ((contador >= 11) && (contador <= 22) ) {
    
      System.out.printf("\n\nQuizás exista el peligro de otra persona en ");
      System.out.printf("su vida o en su mente, aunque seguramente será algo ");
      System.out.printf("sin importancia. No bajes la guardia. ");
      
    }

    if ((contador > 22) && (contador <= 30) ) {
    
      System.out.printf("\n\nTu pareja tiene todos los ingredientes para");
      System.out.printf(" estar viviendo un romance con otra persona."); 
      System.out.printf("\nTe aconsejamos que indagues un poco más y averigües");
      System.out.printf(" que es lo que está pasando por su cabeza.");

    }


   
  
  }
}
