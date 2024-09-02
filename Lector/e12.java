import javax.swing.JOptionPane;

public class e12 {

    public static void main(String[] args) {
        boolean realizarOtroPedido = true;

        while (realizarOtroPedido) {
            double pb = 0;
            double pHelada = 0;
            String bebida = "";
            String mpago = "";
            String mensaje;

            // Menú de bebidas
            String[] opcionesBebida = {"Gaseosa", "Jugo", "Agua"};
            int opcionBebida = JOptionPane.showOptionDialog(
                null,
                "Elija una bebida:",
                "Menú de Bebidas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcionesBebida,
                opcionesBebida[0]
            );

            switch (opcionBebida) {
                case 0: // Gaseosa
                    String[] opGaseosa = {"Inka Cola - S/.3.00", "Coca Cola - S/.3.00", "Fanta - S/.2.50", "Sprint - S/.2.50"};
                    int opcionGaseosa = JOptionPane.showOptionDialog(
                        null,
                        "Elija una marca de gaseosa:",
                        "Gaseosas",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opGaseosa,opGaseosa[0]);

                    switch (opcionGaseosa) {
                        case 0:
                            pb = 3.00;
                            bebida = "Inka Cola";
                            break;
                        case 1:
                            pb = 3.00;
                            bebida = "Coca Cola";
                            break;
                        case 2:
                            pb = 2.50;
                            bebida = "Fanta";
                            break;
                        case 3:
                            pb = 2.50;
                            bebida = "Sprite";
                            break;
                    }
                    break;
                case 1: // Jugo
                    String[] opJugo = {"Surtido - S/.2.50", "Fresa - S/.2.00", "Papaya - S/.2.00", "Plátano - S/.2.00"};
                    int opcionJugo = JOptionPane.showOptionDialog(
                        null,
                        "Elija un tipo de jugo:",
                        "Jugos",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opJugo,opJugo[0]);

                    switch (opcionJugo) {
                        case 0:
                            pb = 2.50;
                            bebida = "Surtido";
                            break;
                        case 1:
                            pb = 2.00;
                            bebida = "Fresa";
                            break;
                        case 2:
                            pb = 2.00;
                            bebida = "Papaya";
                            break;
                        case 3:
                            pb = 2.00;
                            bebida = "Plátano";
                            break;
                    }
                    break;
                case 2: // Agua
                    String[] opAgua = {"Con gas - S/.1.50", "Sin gas - S/.1.00"};
                    int opcionAgua = JOptionPane.showOptionDialog(
                        null,
                        "Elija si desea el agua con gas o sin gas:",
                        "Agua",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opAgua,opAgua[0]);
                        
                    switch (opcionAgua) {
                        case 0:
                            pb = 1.50;
                            bebida = "Agua con gas";
                            break;
                        case 1:
                            pb = 1.00;
                            bebida = "Agua sin gas";
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    System.exit(0);
            }

            // Preguntar si desea la bebida helada o sin helar
            String[] opTemperatura = {"Helada - S/.0.50", "Sin helar - S/.0.00"};
            int opcionTemperatura = JOptionPane.showOptionDialog(
                null,
                "Elija si desea la bebida helada o sin helar:",
                "Temperatura de la Bebida",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opTemperatura,opTemperatura[0] );

            switch (opcionTemperatura) {
                case 0:
                    pHelada = 0.50;
                    break;
                case 1:
                    pHelada = 0.00;
                    break;
            }

            // Preguntar medio de pago
            String[] oppago = {"Efectivo", "Tarjeta", "Yape o Plin"};
            int opcionpago = JOptionPane.showOptionDialog(
                null,
                "Opción de pago:",
                "Medio de pago",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                oppago,oppago[0] );

            switch (opcionpago) {
                case 0:
                    mpago = "Efectivo";
                    break;
                case 1:
                    mpago = "Tarjeta";
                    break;
                case 2:
                    mpago = "Yape o Plin";
            }

            // Calcular el total
            double total = pb + pHelada;

            // Construir el mensaje
            String temperatura = (opcionTemperatura == 0) ? "Helada" : "Sin helar";
            mensaje = "Su pedido es:\n" +
                      "Bebida: " + bebida + "\n" +
                      "Medio de pago: " + mpago + "\n"+
                      "Temperatura: " + temperatura + "\n\n" +
                      "Total a pagar: S/." + total;

            // Mostrar el mensaje
            JOptionPane.showMessageDialog(null, mensaje);

            // Preguntar si desea realizar otro pedido
            int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Desea realizar otro pedido?",
                "Realizar Otro Pedido",
                JOptionPane.YES_NO_OPTION);

            if (respuesta != JOptionPane.YES_OPTION) {
                realizarOtroPedido = false;
            }
        }

        // Mensaje de despedida
        JOptionPane.showMessageDialog(null, "Gracias por su pedido. ¡Hasta luego!");
        System.exit(0);
    }
}
