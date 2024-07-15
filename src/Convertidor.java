import java.util.Scanner;

public class Convertidor {

    public static void main (String[] args){
        Scanner lectura =new Scanner(System.in);
        ConsultarMoneda consultar = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 7){
            System.out.println("*********************************\n" +
            "Bienvenido Al Conversor de Monedas  \n\n" +
            "Ingrese la conversion que desea realizar \n\n" +
            "1. Dolar a Peso Argentino \n" +
            "2. Peso Argentino a Dolar \n"+
            "3. Dolar a Real Brasileño \n"+
            "4. Real Brasilero a Dolar \n"+
            "5. Dolar a Peso Colombiano \n"+
            "6. Peso Colombiano a Dolar \n"+
            "7. Salir" );

        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion){
            case 1:
                ConvertirMoneda.convertir("USD","ARS", consultar, lectura );
                break;
            case 2:
                ConvertirMoneda.convertir("ARS","USD", consultar, lectura );
                break;
            case 3:
                ConvertirMoneda.convertir("USD","USD", consultar, lectura );
                break;
            case 4:
                ConvertirMoneda.convertir("BRL","USD", consultar, lectura );
                break;
            case 5:
                ConvertirMoneda.convertir("USD","COP", consultar, lectura );
                break;
            case 6:
                ConvertirMoneda.convertir("COP", "USD", consultar, lectura );
                break;
            case 7:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opcion NO Valida");
                break;
        }

        }
    }

}
