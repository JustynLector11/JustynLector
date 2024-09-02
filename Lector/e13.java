import java.awt.Component;
import javax.swing.JOptionPane;
public class e13 {
    public static void main(String[] args) {
        int b;
        do {
           int edad = 0;
           double salario = 0.0;
  
           try {
              edad = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingrese su edad", "Tributacion", 1));
              if (edad <= 0) {
                 throw new NumberFormatException();
              }
           } catch (NumberFormatException var7) {
              JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var7), "Error", 0);
           }
  
           if (edad >= 18) {
              try {
                 salario = (double)Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingrese su salario mensual.", "Tributacion", 1));
                 if (salario < 0.0) {
                    throw new NumberFormatException();
                 }
              } catch (NumberFormatException var6) {
                 JOptionPane.showMessageDialog((Component)null, "Se ha detectado un error \n" + String.valueOf(var6), "Error", 0);
              }
  
              if (salario >= 1300.0) {
                 JOptionPane.showMessageDialog((Component)null, "Usted tributa", "Tributacion", 1);
              } else {
                 JOptionPane.showMessageDialog((Component)null, "Usted no tributa", "Tributacion", 1);
              }
           } else {
              JOptionPane.showMessageDialog((Component)null, "Es menor de edad, usted no tributa", "Tributacion", 1);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Tributacion", 0);
        } while(b == 0);
  
     }
}
