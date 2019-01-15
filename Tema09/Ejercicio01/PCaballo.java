
/**
 *
 * @author Lino Haller Ríos
 */
public class PCaballo {

    public static void main(String[] args) {

        Caballo caballo1 = new Caballo("Pepe", "negro", "Pura Sangre", 20);
        Caballo caballo2 = new Caballo("José", "blanco", "Percherón", 26);

        System.out.printf("Os presentamos a los dos caballos del establo: \n\n");
        System.out.printf("El primero es: %s\n", caballo1.getNombre());
        caballo1.bufar();
        caballo1.relinchar();
        System.out.printf("\n\n");
        System.out.printf("Y por último pero no menos importante tenemos a: %s\n", caballo2.getNombre());
        caballo2.relinchar();
        caballo2.cabalgar();
    }
}
