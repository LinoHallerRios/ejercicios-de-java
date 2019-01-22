
package ejercicio09;

/**
 *
 * @author Lino Haller Rios
 */
public abstract class Terminal2 {
    public String numero;
    public int segundos;
    
    public Terminal2(String n){
        this.numero = n;
        this.segundos = 0;
    }
    
    String getNumero(){
        return this.numero;
    }
    
}
