import java.awt.Component;
import javax.swing.JOptionPane;
public class e17 {
    public static void main(String[] args) {
        double lado1 = 0.0;
        double lado2 = 0.0;
        double lado3 = 0.0;
  
        int b;
        do {
           try {
              lado1 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingrese la longitud del primer lado:", "Entrada de Datos", 1));
              lado2 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingrese la longitud del segundo lado:", "Entrada de Datos", 1));
              lado3 = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Ingrese la longitud del tercer lado:", "Entrada de Datos", 1));
              if (lado1 <= 0.0 || lado2 <= 0.0 || lado3 <= 0.0) {
                 throw new IllegalArgumentException("Los lados deben ser mayores a 0.");
              }
  
              if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
                 throw new IllegalArgumentException("Las longitudes ingresadas no forman un triangulo valido.");
              }
  
              String tTriangulo;
              if (lado1 == lado2 && lado2 == lado3) {
                 tTriangulo = "Equilatero";
              } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                 tTriangulo = "Escaleno";
              } else {
                 tTriangulo = "Isosceles";
              }
  
              JOptionPane.showMessageDialog((Component)null, "El triangulo es " + tTriangulo, "Resultado", 1);
           } catch (NumberFormatException var9) {
              JOptionPane.showMessageDialog((Component)null, "Error: Ingrese valores numericos validos.", "Error", 0);
           } catch (IllegalArgumentException var10) {
              JOptionPane.showMessageDialog((Component)null, "Error: " + var10.getMessage(), "Error", 0);
           }
  
           b = JOptionPane.showConfirmDialog((Component)null, "¿Desea probar con otras longitudes?", "Continuar", 0);
        } while(b == 0);
  
     }
}
