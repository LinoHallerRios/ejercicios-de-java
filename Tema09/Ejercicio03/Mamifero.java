
package Ejercicio03;

/**
 *
 * @author Lino
 */
public abstract class Mamifero extends Animal {
    
    public Mamifero (String s) {
        super(s);
    }
    
    public void respirar() {
        System.out.println("Estoy respirando.");
    }
    
    public void caminar () {
        System.out.println("Estoy caminando.");
    }
          
}
