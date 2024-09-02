
import static javax.swing.JOptionPane.*;
public class e11 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        boolean continuar=true;

        while(continuar){
          // Leer los coeficientes de la ecuación cuadrática
            String aInput = showInputDialog("Ingrese la variable a: ");
            String bInput = showInputDialog("Ingrese la variable b: ");
            String cInput = showInputDialog("Ingrese la variable c: ");
    
          if (aInput != null){

            try{
              double a = Double.parseDouble(aInput);
              double b = Double.parseDouble(bInput);
              double c = Double.parseDouble(cInput);
            
             // Calcular el discriminante
            double discriminante = b * b - 4 * a * c;
        
            // Mostrar el discriminante
             showMessageDialog(null,"El discriminante es: " + discriminante);
        
            // Calcular las raíces según el discriminante
             if (discriminante > 0) {
             // Dos raíces reales y diferentes
             double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
             double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
             showMessageDialog(null,"Las raíces son: " + raiz1 + "\n" + " y " + raiz2);
             } else if (discriminante == 0) {
              // Una raíz real doble
              double raiz = -b / (2 * a);
             showMessageDialog(null,"La raíz doble es: " + raiz);
              } else {
             // Discriminante negativo, raíces complejas
             double parteReal = -b / (2 * a);
             double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
             showMessageDialog(null,"Las raíces son: " + parteReal + " ± " + parteImaginaria + "i");
             }
            }catch(NumberFormatException e){
                showMessageDialog(null,  "Por favor, ingrese un número válido.", "Error", ERROR_MESSAGE);
            }
          } else {
            // Mensaje si el usuario cancela la entrada
            showMessageDialog(null, "No se ingresó ninguna variable.", "Información", INFORMATION_MESSAGE);
          }
            int respuesta = showConfirmDialog(null, "¿Desea realizar más cálculos?", "Continuar",YES_NO_OPTION);
            // Si la respuesta es NO, salir del bucle
           if (respuesta == NO_OPTION) {
            continuar = false;
           
        }
    }
    }
}

