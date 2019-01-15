
package Ejercicio03;

/**
 *
 * @author Lino
 */
public class Perro extends Mamifero {
    
    private String color, raza, nombre;
    private int edad;
    
    public Perro (String s, String n) {
        super(s);
        this.nombre = n;
    }
    
    void setColor (String c) {
        this.color = c;
    }
   
     void setRaza (String r) {
        this.raza = r;
    }
     
    void setEdad (int e) {
        this.edad = e;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getColor() {
        return this.color;
    }
    public void ladrar() {
        System.out.println("GUAU GUAU");
    }
    
    public void correr() {
        System.out.println("Estoy corriendo.");
    }
   
}
