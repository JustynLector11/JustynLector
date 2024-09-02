import java.awt.Component;
import javax.swing.JOptionPane;
public class e10 {
    public static void main(String[] args) {
        int b ;
        int n1 = 0;
  
        do {
           try {
              n1 = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingresar el numero", "Par o Impar", 1));
           } catch (NumberFormatException var4) {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var4), "Error", 0);
           }
  
           if (n1 % 2 == 0) {
              JOptionPane.showMessageDialog((Component)null, "El numero " + n1 + " es par.", "Par o Impar", 1);
           } else {
              JOptionPane.showMessageDialog((Component)null, "El numero " + n1 + " es impar.", "Par o Impar", 1);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Continuar", 0);
        } while(b == 0);
  
     }
}
