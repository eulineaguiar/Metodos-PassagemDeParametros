package exercicios;

public class Exercicio04 {
	 public static void main(String[] args) {
	 double numero1 = 10.5;
	 double numero2 = 7.2;
	 double numero3 = 5.1;

	 double media = calcularMedia(numero1, numero2, numero3);
	 System.out.println("A m�dia dos n�meros �: " + media);
	 }

	 public static double calcularMedia(double num1, double num2, double num3) {
	 
	 return (num1 + num2 + num3) / 3;
   }
}