import java.awt.Component;
import javax.swing.JOptionPane;

public class e18 {
    public static void main(String[] args) {
        double rA = 0.0;
        double tipoI = 0.0;
  
        int b;
        do {
           try {
              String input = JOptionPane.showInputDialog((Component)null, "Ingrese su renta anual (en soles):", "Declaracion de la Renta", 1);
              rA = Double.parseDouble(input);
              if (input.isBlank()) {
                 throw new NullPointerException("El valor ingresado no puede estar vacio.");
              }
  
              if (rA < 0.0) {
                 throw new IllegalArgumentException("La renta anual debe ser mayor o igual a cero.");
              }
  
                if (rA < 10000.0) {
                 tipoI = 5.0;
                } else if (rA < 20000.0) {
                 tipoI = 15.0;
                } else if (rA < 35000.0) {
                 tipoI = 20.0;
                } else if (rA < 60000.0) {
                 tipoI = 30.0;
                } else {
                 tipoI= 45.0;
                }
  
              JOptionPane.showMessageDialog((Component)null, "Para una renta anual de S/ " + rA + ", el tipo impositivo es " + tipoI + "%.", "Resultado", 1);
           } catch (NumberFormatException var7) {
              JOptionPane.showMessageDialog((Component)null, "Error: Ingrese un valor numerico valido.", "Error", 0);
           } catch (NullPointerException | IllegalArgumentException var8) {
              JOptionPane.showMessageDialog((Component)null, "Error: " + var8.getMessage(), "Error", 0);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea realizar otro calculo?", "Continuar", 0);
        } while(b == 0);
  
    }
}
