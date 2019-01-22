
package ejercicio03;

/**
 *
 * @author Lino
 */
public abstract class Ave extends Animal{
    
    public Ave (String s) {
        super(s);
    }
    
    public void volar() {
        System.out.println("Estoy volando.");
    }
    
    public void ponerHuevos() {
        System.out.println("Estoy poniendo huevos.");
    }
}
