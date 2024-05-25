// Clase PruebaCalculadora
public class PruebaCalculadora {
    public static void main(String[] args) {
        // Crear una instancia de Calculadora
        Calculadora calculadora = new Calculadora(10, 20);

        // Probar la suma
        try {
            int resultado = calculadora.realizarOperacion("suma");
            System.out.println("El resultado de la suma es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
