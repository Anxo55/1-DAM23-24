package repasoExamen2;

public class MCDIterativo {
    public static int mcdIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int resultadoIterativo = mcdIterativo(num1, num2);
        System.out.println("MCD de " + num1 + " y " + num2 + " (Iterativo): " + resultadoIterativo);
    }
}
