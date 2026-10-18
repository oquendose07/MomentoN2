import java.util.Scanner;

public class CajaRegistradora {

    public static void main(String[] args) {
        // Declaración variables y constantes
        Scanner leer = new Scanner(System.in);

        final double PRECIO_BASICO = 15000;
        final double PRECIO_MEDIO = 30000;
        final double PRECIO_PREMIUM = 50000;
        final double iva = 0.19;

        double totalBruto = 0;
        int totalArticulos = 0;
        int totalArticulosPremium = 0;
        double porcentajePremium = 0;
        int opcionMenu = 0;

        // Creación del ciclo y menú
        do {
            System.out.println("----- MENÚ CATÁLOGO -----");
            System.out.println("1. Producto Básico");
            System.out.println("2. Producto Medio");
            System.out.println("3. Producto Premium");
            System.out.println("4. Finalizar compra");
            System.out.println("Productos registrados: " + totalArticulos);

            System.out.println("Elija una opción: ");

            opcionMenu = leer.nextInt();

            if (opcionMenu == 1) {
                totalBruto += PRECIO_BASICO;
                totalArticulos++;
            } else if (opcionMenu == 2) {
                totalBruto += PRECIO_MEDIO;
                totalArticulos++;
            } else if (opcionMenu == 3) {
                totalBruto += PRECIO_PREMIUM;
                totalArticulos++;
                totalArticulosPremium++;
            } else if (opcionMenu != 4) {
                System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcionMenu != 4);

    }
}