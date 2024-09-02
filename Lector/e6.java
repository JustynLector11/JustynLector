import java.awt.Component;
import javax.swing.JOptionPane;
public class e6 {
    public static void main(String[] args) {
        int b;
        double n1 = 0.0;
        double n2 = 0.0;
        double n3 = 0.0;
        double m = 0.0;
  
        do {
           n1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el primer numero", "Media de 3 numeros", 1));
           n2 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el segundo numero", "Media de 3 numeros", 1));
           n3 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el tercer numero", "Media de 3 numeros", 1));
           m = (n1 + n2 + n3) / 3.0;
           JOptionPane.showMessageDialog((Component)null, "Los numeros ingresados son: " + n1 + ", " + n2 + ", " + n3 + "\nLa media de los tres numeros ingresados es: " + m, "Media de 3 numeros", 1);
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Media de 3 numeros", 0);
        } while(b == 0);
  
     }
}
