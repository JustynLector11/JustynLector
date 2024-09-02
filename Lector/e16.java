import java.awt.Component;
import javax.swing.JOptionPane;
public class e16 {
    public static void main(String[] args) {
        int b;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        String m1 = "";
        String m2 = "";
        String m3 = "";
        boolean primo = false;
  
        do {
           try {
              n1 = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingresar el primer numero", "Datos", 3));
              if (n1 < 0) {
                 throw new IllegalArgumentException("No se admiten valores negativos");
              }
           } catch (IllegalArgumentException var13) {
              JOptionPane.showMessageDialog((Component)null, "Error: " + var13.getMessage(), "Error", 0);
           }
  
           try {
              n2 = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingresar el segundo numero", "Datos", 3));
              if (n2 < 0) {
                 throw new IllegalArgumentException("No se admiten valores negativos");
              }
           } catch (IllegalArgumentException var12) {
              JOptionPane.showMessageDialog((Component)null, "Error: " + var12.getMessage(), "Error", 0);
           }
  
           try {
              n3 = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Ingresar el tercer numero", "Datos", 3));
              if (n3 < 0) {
                 throw new IllegalArgumentException("No se admiten valores negativos");
              }
           } catch (IllegalArgumentException var11) {
              JOptionPane.showMessageDialog((Component)null, "Error: " + var11.getMessage(), "Error", 0);
           }
  
           if (n1 % 2 == 0) {
              m1 = "El numero " + n1 + " es par";
           } else {
              m1 = "El numero " + n1 + " es impar";
           }
  
           if (n2 % 2 == 0) {
              m2 = "El numero " + n2 + " es par";
           } else {
              m2 = "El numero " + n2 + " es impar";
           }
  
           if (n3 % 2 == 0) {
              m3 = "El numero " + n3 + " es par";
           } else {
              m3 = "El numero " + n3 + " es impar";
           }
  
           int i;
           for(i = 2; (double)i <= Math.sqrt((double)n1); ++i) {
              primo = true;
              if (n1 % i == 0) {
                 primo = false;
                 break;
              }
           }
  
           if (primo) {
              m1 = m1 + " y es primo";
           } else {
              m1 = m1 + " y no es primo";
           }
  
           for(i = 2; (double)i <= Math.sqrt((double)n2); ++i) {
              primo = true;
              if (n2 % i == 0) {
                 primo = false;
                 break;
              }
           }
  
           if (primo) {
              m2 = m2 + " y es primo";
           } else {
              m2 = m2 + " y no es primo";
           }
  
           for(i = 2; (double)i <= Math.sqrt((double)n3); ++i) {
              primo = true;
              if (n3 % i == 0) {
                 primo = false;
                 break;
              }
           }
  
           if (primo) {
              m3 = m3 + " y es primo";
           } else {
              m3 = m3 + " y no es primo";
           }
  
           JOptionPane.showMessageDialog((Component)null, "Resultados:\n" + m1 + "\n" + m2 + "\n" + m3);
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Números primos", 0);
        } while(b == 0);
  
     }
}
