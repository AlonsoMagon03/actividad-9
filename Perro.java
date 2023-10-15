import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Perro {
    private String tipo;
    private String ladrar;
    private String nombre;
    private String raza;
    private double gramos;
    private double edad;

    public Perro() {
    }

    public Perro(String tipo, String ladrar, String nombre, String raza, double gramos, double edad) {
        this.tipo = tipo;
        this.ladrar = ladrar;
        this.nombre = nombre;
        this.raza = raza;
        this.gramos = gramos;
        this.edad = edad;
    }

    public String getcomida() {
        this.tipo = JOptionPane.showInputDialog((Component)null, "Selecciona el tipo de comida que consume tu perro", "Comida", -1, (Icon)null, new Object[]{"Seleccion", "mariscos", "croquetas", "carne", "comida casera"}, "Selecciona").toString();

        try {
            double var1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "¿Cuántos gramos de " + this.tipo + " consume tu perro al día?", "Cantidad"));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, "Introduce un número válido para los gramos de comida.", "ERROR", 0, (Icon)null);
        }

        return this.tipo;
    }

    public String Ladrar() {
        JOptionPane.showMessageDialog((Component)null, "Guau Guau");
        return this.ladrar;
    }

    public String getnombre() {
        String nombre = JOptionPane.showInputDialog((Component)null, "¿Cuál es el nombre de tu perro?");
        return nombre;
    }

    public String getraza() {
        String raza = JOptionPane.showInputDialog((Component)null, "¿Cuál es la raza de tu perro?");
        return raza;
    }

    public double getedad() {
        try {
            double var1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "¿Cuál es la edad de tu perro (años) ?"));
        } catch (Exception var3) {
            JOptionPane.showMessageDialog((Component)null, "Introduce un número válido para la edad.", "ERROR", 0, (Icon)null);
        }

        return this.edad;
    }
}
