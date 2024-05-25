public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 3);

        System.out.println("Suma: " + calc.realizarOperacion("suma"));
        System.out.println("Resta: " + calc.realizarOperacion("resta"));
        System.out.println("Módulo: " + calc.realizarOperacion("modulo"));
    }
}
