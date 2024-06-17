package exercicios;

public class Exercicio05 {
	 public static void main(String[] args) {
	 int ano = 2024;
	 boolean ehBissexto = verificarAnoBissexto(ano);

	 if (ehBissexto) {
	 System.out.println(ano + " � um ano bissexto.");
	 } else {
	 System.out.println(ano + " n�o � um ano bissexto.");
	 }
	 }

	 public static boolean verificarAnoBissexto(int ano) {
	       
	 return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	 }
}