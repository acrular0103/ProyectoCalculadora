public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int realizarOperacion(String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return suma();
            case "resta":
                return resta();
            case "modulo": // Agregar operación módulo
                return modulo();
            default:
                throw new IllegalArgumentException("Operación no soportada: " + operacion);
        }
    }

    private int suma() {
        return numero1 + numero2;
    }

    private int resta() {
        return numero1 - numero2;
    }

    private int modulo() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 % numero2;
    }
}
