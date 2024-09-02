import static javax.swing.JOptionPane.*;

public class e5 {
  /**
 * @param args
 */
public static void main(String[] args) {
    
    boolean continuar=true;
    
    while(continuar){
        //Pedir al usuario los grados F
        String g_fInput = showInputDialog("Ingrese la temperatura en grados Fahrenheit:");
    
        if (g_fInput != null) {
          try{
            //Cambiar los variable a double
            double g_f = Double.parseDouble(g_fInput);
            //Convertir grados F a grados C
            double g_c = (g_f - 32) * 5 / 9;
            showMessageDialog(null,+g_f+" grados Fahrenheit son " +g_c+ " en grados Celsius", "Respuesta",PLAIN_MESSAGE);
            }catch(NumberFormatException e){
               showMessageDialog(null,  "Por favor, ingrese un número válido.", "Error", ERROR_MESSAGE);
            }
        } else {
          // Mensaje si el usuario cancela la entrada
          showMessageDialog(null, "No se ingresó ninguna temperatura.", "Información", INFORMATION_MESSAGE);
        }
        int respuesta = showConfirmDialog(null, "¿Desea realizar más cálculos?", "Continuar",YES_NO_OPTION);

           // Si la respuesta es NO, salir del bucle
           if (respuesta == NO_OPTION) {
                continuar = false;
           }
        }
        showMessageDialog(null, "Gracias por usar el convertidor de temperatura. ¡Hasta luego!"); 
    } 
}


