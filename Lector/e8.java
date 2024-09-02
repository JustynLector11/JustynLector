
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;


public class e8 {

    public static void main(String[] args) {

        boolean c = true;

     while(c){
        // Solicitar el total de la compra al usuario
        String totalStr = JOptionPane.showInputDialog("Ingrese el total de la compra:");
        
        // Convertir el total de la compra a un número de punto flotante
        double tc;
        try {
            tc = Double.parseDouble(totalStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            System.exit(0);
            return;
        }

        // Calcular el monto del descuento (15% del total de la compra)
        double descuento = tc * 0.15;
        // Calcular el total después del descuento
        double totalConDescuento = tc - descuento;

        // Crear el mensaje para mostrar al usuario
        String mensaje = String.format(
            "Total de la compra: "+tc+"\n"+
            "Descuento (15%%): " +descuento+"\n" +
            "Total a pagar después del descuento: " +totalConDescuento);

        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
         int respuesta = showConfirmDialog(null, "¿Desea realizar más saludos?", "Continuar",YES_NO_OPTION);
            // Si la respuesta es NO, salir del bucle
           if (respuesta == NO_OPTION) {
            c = false;
           
        }
    } 
    }
}





