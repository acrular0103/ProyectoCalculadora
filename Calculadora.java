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
<<<<<<< HEAD
=======
            case "multiplicar":
                return multiplicar();
            case "dividir":
                return dividir();
>>>>>>> dividir
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

<<<<<<< HEAD
=======
    private int multiplicar() {
        return numero1 * numero2;
    }

    private int dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

>>>>>>> dividir
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
}