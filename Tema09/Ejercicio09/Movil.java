package ejercicio09;

/**
 *
 * @author Lino Haller Ríos
 */
import java.text.DecimalFormat;
public class Movil extends Terminal2 {

    private String tarifa;
    private double tarificados;

    public Movil(String n, String t) {
        super(n);
        this.tarifa = t;
        this.tarificados = 0;
    }

    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.numero + " - " + this.segundos + "s de conversación" + " - " + "tarificados " + formatoEuros.format(this.tarificados) + "€";
    }

    public void llama(Movil m, int seg) {
      
        if (this.tarifa.equals("rata")) {
            this.tarificados += (seg / 60.0) * (6.0 / 100); 
        }
        if (this.tarifa.equals("mono")) {
            this.tarificados += (seg / 60.0) * (12.0 / 100); 
        }
        if (this.tarifa.equals("bisonte")) {
            this.tarificados += (seg / 60.0) * (30.0 / 100); 
        }
        this.segundos += seg;
        m.segundos += seg;
    }

    
}
