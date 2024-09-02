import java.awt.Component;
import javax.swing.JOptionPane;
public class e9 {
    public static void main(String[] args) {
        int b;
        double n1 = 0.0;
        double n2 = 0.0;
        double d = 0.0;
  
        do {
           try {
              try {
                 n1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el primer numero", "Division Aritmetica", 1));
              } catch (NumberFormatException var10) {
                 JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var10), "Error", 0);
              }
  
              try {
                 n2 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el segundo numero", "Division Aritmetica", 1));
              } catch (NumberFormatException var9) {
                 JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var9), "Error", 0);
              }
  
              d = n1 / n2;
              if (n2 == 0.0) {
                 throw new ArithmeticException();
              }
  
              JOptionPane.showMessageDialog((Component)null, "La divison es: " + d, "Division Aritmetica", 1);
           } catch (ArithmeticException var11) {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var11), "Error", 0);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Division Aritmetica", 0);
        } while(b == 0);
  
     }
}
