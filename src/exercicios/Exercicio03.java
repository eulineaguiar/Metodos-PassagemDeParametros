package exercicios;

public class Exercicio03 {

    public static String verificarNumero(double numero) {
        if (numero > 0) {
            return "O n�mero � positivo.";
        } else if (numero < 0) {
            return "O n�mero � negativo.";
        } else {
            return "O n�mero � zero.";
        }
    }

    public static void main(String[] args) {
        double numero1 = 10.5;
        double numero2 = -7.2;
        double numero3 = 0.0;

        System.out.println(verificarNumero(numero1));
        System.out.println(verificarNumero(numero2));
        System.out.println(verificarNumero(numero3));
    }
}