package exercicios;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println(verificarPalindromo("arara"));
        System.out.println(verificarPalindromo("anotaram a data"));
        System.out.println(verificarPalindromo("java"));
    }

    public static String verificarPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        int esquerda = 0;
        int direita = palavra.length() - 1;
        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return "falso";
            }
            esquerda++;
            direita--;
        }
        return "verdadeiro";
    }
}