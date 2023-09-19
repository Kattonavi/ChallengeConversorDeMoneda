import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero");
        double cantidad = Double.parseDouble(input);

        String[] moneda = {
                "COP a USD",
                "COP a EUR",
                "COP a GBP",
                "COP a JPY",
                "COP a KRW ",
                "USD a COP",
                "EUR a COP",
                "GBP a COP",
                "JPY a COP",
                "KRW a COP",
                "Exit"
        };

        String mensaje = "Seleccione la conversión deseada\n";
        for (int i = 0; i < moneda.length; i++) {
            mensaje += (i + 1) + ". " + moneda[i] + "\n";
        }

        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        double tasaDolarAPesosColombianos = 4018;
        double tasaEuroAPesosColombianos = 4305;
        double tasaLibraAPesosColombianos = 5009;
        double tasaYenAPesosColombianos = 27;
        double tasaWonAPesosColombianos = 3;

        double resultado = 0.0;

        switch (seleccion) {
            case 1:
                resultado = cantidad / tasaDolarAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos = " + resultado + " Dólares");
                break;
            case 2:
                resultado = cantidad / tasaEuroAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos = " + resultado + " Euros");
                break;
            case 3:
                resultado = cantidad / tasaLibraAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos = " + resultado + " Libras Esterlinas");
                break;
            case 4:
                resultado = cantidad / tasaYenAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos = " + resultado + " Yen Japonés");
                break;
            case 5:
                resultado = cantidad / tasaWonAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos = " + resultado + " Won sul-coreano");
                break;
            case 6:
                resultado = cantidad * tasaDolarAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Dólares = " + resultado + " Pesos Colombianos");
                break;
            case 7:
                resultado = cantidad * tasaEuroAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Euros = " + resultado + " Pesos Colombianos");
                break;
            case 8:
                resultado = cantidad * tasaLibraAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Libras Esterlinas = " + resultado + " Pesos Colombianos");
                break;
            case 9:
                resultado = cantidad * tasaYenAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Yen Japonés = " + resultado + " Pesos Colombianos");
                break;
            case 10:
                resultado = cantidad * tasaWonAPesosColombianos;
                JOptionPane.showMessageDialog(null, cantidad + " Won sul-coreano = " + resultado + " Pesos Colombianos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Haz salido del conversor de monedas");
                System.exit(0);
        }
    }
}




