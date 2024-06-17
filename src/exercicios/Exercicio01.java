package exercicios;

public class Exercicio01 {
	public static void main(String[] args) {
        int numero = 11;
        boolean resultado = verificarPar(numero);

        if (resultado) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }
}