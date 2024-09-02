
import java.awt.Component;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class e1 {

   public static void main(String[] args) {
      boolean c = true;
      String Name = "";

      
      while(c) {
         Name = JOptionPane.showInputDialog((Component)null, "Ingresar su nombre completo", "Programa de Saludos", 1);
         int time = LocalDateTime.now().getHour();
         if (Name.isBlank()) {
            JOptionPane.showMessageDialog((Component)null, "No ha ingresado ningún nombre", "Programa de Saludos", 0);
         } else if (time >= 18) {
            JOptionPane.showMessageDialog((Component)null, "Buenas noches " + Name);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Buenos días " + Name);
         }

         int respuesta = showConfirmDialog(null, "¿Desea realizar más saludos?", "Continuar",YES_NO_OPTION);
            // Si la respuesta es NO, salir del bucle
           if (respuesta == NO_OPTION) {
            c = false;
           
        }
    } 
   
   }
}
