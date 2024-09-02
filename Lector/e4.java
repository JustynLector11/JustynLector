
import java.awt.Component;
import javax.swing.JOptionPane;

public class e4 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int b;
        do {
           n1 = (int) (Math.random() * 100 + 1);
           n2 = (int) (Math.random() * 100 + 1);
           JOptionPane.showMessageDialog((Component)null, "Los numeros son\n" + n1 + " y " + n2, "Operaciones Matematicas", 1);
           JOptionPane.showMessageDialog((Component)null, "Operaciones:\nSuma: " + (n1 + n2) + "\nResta: " + (n1 - n2) + "\nMultiplicacion: " + n1 * n2 + "\nDivision: " + n1 / n2);
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea repetir  la ejecucion del programa?", "Operaciones Matematicas", 0);
        } while(b == 0);
  
     }
}
