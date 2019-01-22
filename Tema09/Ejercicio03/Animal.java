package ejercicio03;

/**
 *
 * @author Lino
 */
public abstract class Animal {

    private String sexo;

    Animal (String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return this.sexo;
    }
    
    public void dormir() {
         System.out.println("Zzzzzzz");
    }
    
    public void comer(String comida) {
    System.out.println("Estoy comiendo " + comida);
  }

}
