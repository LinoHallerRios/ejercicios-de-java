package Ejercicio02;

/**
 *
 * @author Lino
 */
import java.util.Scanner;

public class PVehiculos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int respuesta = 1;
        int km1 = 0;
        int km2 = 0;
        String option;
        Coche coche1 = new Coche(200);
        Bicicleta bicicleta2 = new Bicicleta(12);

        while (respuesta != 0) {

            System.out.println();
            System.out.println("VEHICULOS");
            System.out.println("---------");
            System.out.println("1. Anda con la bicicleta\n"
                    + "2. Haz el caballito con la bicicleta\n"
                    + "3. Anda con el coche\n"
                    + "4. Quema rueda con el coche\n"
                    + "5. Ver kilometraje de la bicicleta\n"
                    + "6. Ver kilometraje del coche\n"
                    + "7. Ver kilometraje total\n"
                    + "8. Salir");
            System.out.println("Elige una opción: ");
            option = s.nextLine();

            switch (option) {

                case "1":
                    System.out.println("Cuantos Km va ha conducir: ");
                    km2 = s.nextInt();
                    bicicleta2.conducir(km2);
                    System.out.println();
                    break;
                case "2":
                    bicicleta2.hacerCaballito();
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Cuantos Km va ha conducir: ");
                    km1 = s.nextInt();
                    coche1.conducir(km1);
                    System.out.println();
                    break;
                case "4":
                    coche1.quemarRueda();
                    System.out.println();
                    break;
                case "5":
                    System.out.printf("\nLa bicicleta ha conducido: %s km", bicicleta2.getKilometrosRecorridos());
                    System.out.println();
                    break;
                case "6":
                    System.out.printf("\nEl coche ha conducido: %s km", coche1.getKilometrosRecorridos());
                    System.out.println();
                    break;
                case "7":
                    System.out.printf("\nEl total es: %s km", Vehiculo.getKilometrosTotales());
                    System.out.println();
                    break;
                case "8":
                    respuesta = 0;
                    break;

            }

        }

    }
}
