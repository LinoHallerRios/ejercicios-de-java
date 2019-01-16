
package Ejercicio08;

/**
 *
 * @author Lino Haller Rios
 */
public class Terminal {
    
    private String numero;
    private int segundos;
    
    public Terminal(String n){
        this.numero = n;
        this.segundos = 0;
    }
    
    String getNumero(){
        return this.numero;
    }
    
    public Terminal llama(Terminal t, int seg) {
        this.segundos += seg;
        t.segundos += seg;
        return null;
    }
    
    public String toString() {
        return "Nº " + this.numero + " - " + this.segundos + "s de conversación";
    }
    
}
