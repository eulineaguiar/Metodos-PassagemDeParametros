package exercicios;

public class Exercicio06 {
	public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 27;

        int maximo = encontrarMaximo(numero1, numero2);
        System.out.println("O máximo entre " + numero1 + " e " + numero2 + " é: " + maximo);
    }

    public static int encontrarMaximo(int num1, int num2) {
        
        return (num1 > num2) ? num1 : num2;
    }
}