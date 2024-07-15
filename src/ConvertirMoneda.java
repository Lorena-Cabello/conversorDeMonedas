import java.util.Scanner;




public class ConvertirMoneda {

    public static void convertir (String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase +": ");

        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida= cantidad * monedas.conversion_rate();
        System.out.println(cantidad+ " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());

    }

}
