package repasoExamen2;

public class MCMRecursivo {
    public static int mcdRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcdRecursivo(b, a % b);
        }
    }

    public static int mcmRecursivo(int a, int b) {
        return (a * b) / mcdRecursivo(a, b);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int resultadoRecursivoMCM = mcmRecursivo(num1, num2);
        System.out.println("MCM de " + num1 + " y " + num2 + " (Recursivo): " + resultadoRecursivoMCM);
    }
}
