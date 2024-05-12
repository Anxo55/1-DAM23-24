package repasoExamen2;

public class MCMIterativo {
    public static int mcdIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int mcmIterativo(int a, int b) {
        int mcd = mcdIterativo(a, b);
        return (a * b) / mcd;
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int resultadoIterativoMCM = mcmIterativo(num1, num2);
        System.out.println("MCM de " + num1 + " y " + num2 + " (Iterativo): " + resultadoIterativoMCM);
    }
}
