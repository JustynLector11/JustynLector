import java.awt.Component;
import javax.swing.JOptionPane;
public class e2 {
    public static void main(String[] args) {
        int t;
        do {
           double b = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingrese la base del rectanngulo", "Calculadora de área y perimetro", 1));
           double h = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingrese la altura del rectangulo", "Calculadora de área y perimetro", 1));
           double p = 2.0 * b + 2.0 * h;
           double a = (b * h)/2;
           JOptionPane.showMessageDialog((Component)null, "El perimetro del rectangulo es: " + p + "\nEl área del rectangulo es:" + a + "\n", "Calculadora de área y perímetro", 1);
           t = JOptionPane.showConfirmDialog((Component)null, "\nDesea repetir  la ejecución del programa?", "Calculadora de área y perímetro", 1);
        } while(t == 0);
  
     }
}
