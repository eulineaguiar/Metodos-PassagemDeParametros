package exercicios;

public class Exercicio10 {

    public static void main(String[] args) {
        int numero1 = 17;
        int numero2 = 20;

        System.out.println(numero1 + " é primo? " + verificarPrimo(numero1));
        System.out.println(numero2 + " é primo? " + verificarPrimo(numero2));
    }

    public static String verificarPrimo(int numero) {
        if (numero <= 1) {
            return "falso";
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "falso";
            }
        }

        return "verdadeiro"; 
    }
}