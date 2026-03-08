import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    private static final String API_KEY = "c5c63f745db4acd53ceb569f";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   CONVERSOR DE MONEDAS");
            System.out.println("==============================");
            System.out.println("1) Dólar -> Peso argentino");
            System.out.println("2) Peso argentino -> Dólar");
            System.out.println("3) Dólar -> Real brasileño");
            System.out.println("4) Real brasileño -> Dólar");
            System.out.println("5) Dólar -> Peso colombiano");
            System.out.println("6) Peso colombiano -> Dólar");
            System.out.println("0) SALIR");
            System.out.println("==============================");

            int option;

            while (true) {
                System.out.print("Seleccione una opción: ");
                String input = scanner.nextLine();

                try {
                    option = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Opción inválida. Ingrese un número.");
                }
            }

            if (option == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            String base = "";
            String target = "";

            switch (option) {
                case 1: base = "USD"; target = "ARS"; break;
                case 2: base = "ARS"; target = "USD"; break;
                case 3: base = "USD"; target = "BRL"; break;
                case 4: base = "BRL"; target = "USD"; break;
                case 5: base = "USD"; target = "COP"; break;
                case 6: base = "COP"; target = "USD"; break;
                default:
                    System.out.println("Opción fuera del menú.");
                    continue;
            }

            double amount;

            while (true) {

                System.out.print("Ingrese la cantidad a convertir: ");
                String input = scanner.next();

                try {
                    amount = Double.parseDouble(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Ingrese un número válido.");
                }

            }

            try {

                String url = "https://v6.exchangerate-api.com/v6/" +
                        API_KEY + "/latest/" + base;

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .GET()
                        .build();

                HttpResponse<String> response =
                        client.send(request, HttpResponse.BodyHandlers.ofString());

                String body = response.body();



                int currencyIndex = body.indexOf("\"" + target + "\"");

                if (currencyIndex == -1) {
                    System.out.println("Currency not found in API response.");
                    continue;
                }

                int colon = body.indexOf(":", currencyIndex);
                int comma = body.indexOf(",", colon);

                if (comma == -1) {
                    comma = body.indexOf("}", colon);
                }

                String rateText = body.substring(colon + 1, comma).trim();
                double rate = Double.parseDouble(rateText);

                double result = amount * rate;

                System.out.println("\nResult:");
                System.out.println(amount + " " + base + " = " + result + " " + target);

            } catch (Exception e) {
                System.out.println("Error contacting API.");
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
