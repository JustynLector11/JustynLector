import java.awt.Component;
import javax.swing.JOptionPane;
public class e3 {
    public static void main(String[] args) {
        double c1 = 0.0;
        double c2 = 0.0;
  
        int b;
        do {
           try {
              c1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el primer cateto del triangulo rectangulo", "Calculo de Hipotenusa", 1));
           } catch (NumberFormatException var10) {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var10), "Error", 0);
           }
  
           try {
              c2 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingresar el segundo cateto del triangulo rectangulo", "Calculo de Hipotenusa", 1));
           } catch (NumberFormatException var9) {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var9), "Error", 0);
           }
  
           if (!(c1 <= 0.0) && !(c2 <= 0.0)) {
              double h = Math.sqrt(Math.pow(c1, 2.0) + Math.pow(c2, 2.0));
              JOptionPane.showMessageDialog((Component)null, "La medida de la hipotenusa es:\n" + h, "Calculadora de Hipotenusa", 1);
           } else {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado una incongruencia.\n Los catetos no pueden ser negativos ni iguales a cero", "Errores", 0);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "Desea repetir  la ejecucion del programa?", "Calculo de Hipotenusa", 0);
        } while(b == 0);
  
     }
}
