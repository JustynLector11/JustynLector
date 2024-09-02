import java.awt.Component;
import javax.swing.JOptionPane;
public class e7 {
    public static void main(String[] args) {
        int b;
       
        do {
           int i = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingrese la cantidad de minutos", "Conversor de minutos", 1));
           int h = i / 60;
           int m = i % 60;
           if (i > 0) {
              if (h > 1) {
                 JOptionPane.showMessageDialog((Component)null, "La conversion de: " + i + " minutos\nEs: " + h + " horas y " + m + " minutos");
              } else {
                 JOptionPane.showMessageDialog((Component)null, "La conversion de: " + i + " minutos\nEs: " + h + " hora y " + m + " minutos");
              }
           } else {
              JOptionPane.showMessageDialog((Component)null, "Ha ingresado un valor negativo.", "Error", 0);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Conversor de minutos", 0);
        } while(b == 0);
  
     }
}
