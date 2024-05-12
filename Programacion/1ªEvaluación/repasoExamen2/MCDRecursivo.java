package repasoExamen2;

public class MCDRecursivo {
    public static int mcdRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcdRecursivo(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int resultadoRecursivo = mcdRecursivo(num1, num2);
        System.out.println("MCD de " + num1 + " y " + num2 + " (Recursivo): " + resultadoRecursivo);
    }
}
