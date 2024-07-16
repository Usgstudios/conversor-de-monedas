import java.io.IOException;
import java.util.Scanner;

public class Divisas {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        String divisa1 = "";
        String divisa2 = "";

        Scanner teclado = new Scanner(System.in);

        while (true) {
            String menu = """
                    ** Escriba el número de la conversión deseada **
                    1 - Pesos Mexicanos - Dólar
                    2 - Dólar - Pesos Mexicanos
                    3 - Euros - Dólar
                    4 - Dólar - Euros
                    5 - Yenes - Dólar
                    6 - Dólar - Yenes
                    7 - Dólar Canadiense - Dólar
                    8 - Historial
                    9 - Regresar
                    0 - Salir
                    ************************************************
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    divisa1 = "MXN";
                    divisa2 = "USD";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 2:
                    divisa1 = "USD";
                    divisa2 = "MXN";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 3:
                    divisa1 = "EUR";
                    divisa2 = "USD";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 4:
                    divisa1 = "USD";
                    divisa2 = "EUR";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 5:
                    divisa1 = "JPY";
                    divisa2 = "USD";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 6:
                    divisa1 = "USD";
                    divisa2 = "JPY";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 7:
                    divisa1 = "CAD";
                    divisa2 = "USD";

                    mensajePrintln(divisa1,divisa2);
                    break;
                case 8:
                    HistorialDConsulta historialDConsulta = new HistorialDConsulta();
                    historialDConsulta.historialConsulta();
                    break;
                case 9:
                    System.out.println("Regresando al menú anterior.");
                    return;
                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }


    }
    public static void mensajePrintln(String divisa1, String divisa2) throws IOException, InterruptedException {
        int valor = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a convertir");
        valor = teclado.nextInt();

        ConvercionDivisa convercionDivisa = new ConvercionDivisa();
        convercionDivisa.resultadoConvercion(divisa1,divisa2,valor);
    }
}
