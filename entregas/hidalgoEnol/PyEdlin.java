import java.util.Scanner;

public class PyEdlin {

    public static void mostrarLineas(String[] lineas, int activa) {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < lineas.length; i++) {
            String marca = (i == activa) ? "*" : " ";
            System.out.println(i + ":" + marca + "| " + lineas[i]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] lineas = new String[10];
        for (int i = 0; i < lineas.length; i++) lineas[i] = "";

        int lineaActiva = 0;

        while (true) {
            mostrarLineas(lineas, lineaActiva);
            System.out.print("Comando (S para salir): ");
            String cmd = sc.nextLine().toUpperCase();

            if (cmd.equals("S")) break;
        }
    }
}