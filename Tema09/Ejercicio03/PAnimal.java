package ejercicio03;

/**
 *
 * @author Lino Haller Ríos
 */
public class PAnimal {

    public static void main(String[] args) {

        Perro perro1 = new Perro("macho", "Tuco");
        System.out.println("WOUF WOUF Me llamo " + perro1.getNombre());
        perro1.setRaza("Bodeguero");
        perro1.respirar();
        perro1.comer("hueso");
        perro1.correr();
        perro1.ladrar();
        
        System.out.println();
        
        Canario canario1 = new Canario("Hembra", "Carmen");
        System.out.println("Me llamo " + canario1.getNombre());
        canario1.dormir();
        canario1.volar();
        canario1.ponerHuevos();
        canario1.cantar();
        canario1.setEdad(6);
        canario1.comer("pienso");

    }

}
