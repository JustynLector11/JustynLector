

import java.awt.Component;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class e14 {

   public static void main(String[] args) {
      String[] Genero = new String[]{"MASCULINO", "FEMENINO"};
      char primera_letra = 0;

      int b;
      do {
         try {
            String apellido = JOptionPane.showInputDialog((Component)null, "Ingrese su primer apellido", "Seleccion de salon", 1);
            if (apellido == null || apellido.isBlank()) {
               throw new NullPointerException("El apellido no puede estar vacio.");
            }

            if (!apellido.matches("[a-zA-Z]+")) {
               throw new IllegalArgumentException("El apellido no puede contener numeros ni caracteres especiales.");
            }

            primera_letra = apellido.toUpperCase(Locale.ROOT).charAt(0);
         } catch (IllegalArgumentException | NullPointerException var7) {
            JOptionPane.showMessageDialog((Component)null, "Error: " + var7.getMessage(), "Error", 0);
         }

         int g = JOptionPane.showOptionDialog((Component)null, "Escoja su genero", "Seleccion de salon", -1, 1, (Icon)null, Genero, Genero[0]);
         String grupo = (g != 0 || primera_letra <= 'N') && (g != 1 || primera_letra >= 'M') ? "B" : "A";
         JOptionPane.showMessageDialog((Component)null, "Usted se encuentra en el grupo " + grupo, "Seleccion de salon", 1);
         b = JOptionPane.showConfirmDialog((Component)null, "¿Desea volver a ejecutar el programa?", "Seleccion de salon", 0);
      } while(b == 0);

      // Mensaje de despedida
      JOptionPane.showMessageDialog(null, "Gracias por usar el programa. ¡Hasta luego!");
      System.exit(0);
   }
}