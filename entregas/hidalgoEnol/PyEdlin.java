public class PyEdlin {
    public static void main(String[] args) {
        System.out.println("Bienvenido a pyEdlin");
    }
}
String[] lineas = new String[10];

for (int i = 0; i < lineas.length; i++) {
    lineas[i] = "";
}
public static void mostrarLineas(String[] lineas, int activa) {
    System.out.println("--------------------------------------------------");
    for (int i = 0; i < lineas.length; i++) {
        String marca = (i == activa) ? "*" : " ";
        System.out.println(i + ":" + marca + "| " + lineas[i]);
    }
    System.out.println("--------------------------------------------------");
}