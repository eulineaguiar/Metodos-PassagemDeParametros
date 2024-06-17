package exercicios;

public class Exercicio08 {

	 public static void main(String[] args) {
	 int numero = 5;
	 long fatorial = calcularFatorial(numero);

	 System.out.println("O fatorial de " + numero + " é: " + fatorial);
	 }

	 public static long calcularFatorial(int numero) {
	 if (numero < 0) {
	 throw new IllegalArgumentException("O número não pode ser negativo.");
	 }
	        
	 long fatorial = 1;
	 for (int i = 1; i <= numero; i++) {
	 fatorial *= i;
	 }
	        
	 return fatorial;
  }
}