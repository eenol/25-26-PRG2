public class PyEdlin {

    public static void mostrarLineas(String[] lineas) {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < lineas.length; i++) {
            System.out.println(i + ": | " + lineas[i]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {

        String[] lineas = new String[10];

        for (int i = 0; i < lineas.length; i++) {
            lineas[i] = "";
        }

        mostrarLineas(lineas);
    }
}