package exercicios;

public class Exercicio02 {

    public static void main(String[] args) {
        int numero = 5;
        int quadrado = calcularQuadrado(numero);
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
    }

    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }
}