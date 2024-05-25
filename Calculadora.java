// Clase Calculadora
public class Calculadora {
    // Atributos
    private int numero1;
    private int numero2;

    // Constructor
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para realizar una operación
    public int realizarOperacion(String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return suma();
            default:
                throw new IllegalArgumentException("Operación no soportada: " + operacion);
        }
    }

    // Método para realizar la suma
    private int suma() {
        return numero1 + numero2;
    }

    // Métodos getter para los atributos (opcional, por si los necesitas más adelante)
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
}
