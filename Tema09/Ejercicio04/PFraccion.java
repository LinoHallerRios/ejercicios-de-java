package Ejercicio04;

/**
 *
 * @author Lino Haller Ríos
 */
public class PFraccion {

    public static void main(String[] args) {
        
        // Utilizar solo fracciones positivas.
        Fraccion f1 = new Fraccion(4, 8);
        Fraccion f2 = new Fraccion(3, 6);

        System.out.printf("La fracion 1 es : %d/%d y la fraccion 2 es: %d/%d  \n\n", f1.getNumerador(), f1.getDenominador(), f2.getNumerador(), f2.getDenominador());

        System.out.println("La fracción1 x 5 es: " + f1.multiplica(5).getNumerador() + "/" + f1.multiplica(5).getDenominador());
        System.out.println("La fracción2 x 5 es: " + f2.multiplica(5).getNumerador() + "/" + f2.multiplica(5).getDenominador());

        System.out.println("La fracción1 / 2 es: " + f1.divide(2).getNumerador() + "/" + f1.divide(2).getDenominador());
        System.out.println("La fracción2 / 2 es: " + f2.divide(2).getNumerador() + "/" + f2.divide(2).getDenominador());

        System.out.println("La fracción1 invertida es: " + f1.invierte().getNumerador() + "/" + f1.invierte().getDenominador());
        System.out.println("La fracción2 invertida es: " + f2.invierte().getNumerador() + "/" + f2.invierte().getDenominador());

        System.out.println("La fracción1 simplificada es: " + f1.simplifica().getNumerador() + "/" + f1.simplifica().getDenominador());
        System.out.println("La fracción2 simplificada es: " + f2.simplifica().getNumerador() + "/" + f2.simplifica().getDenominador());

    }
}
