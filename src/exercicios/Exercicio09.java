package exercicios;

public class Exercicio09 {

    public static void main(String[] args) {
        double base = 5.0;
        double altura = 3.0;

        double areaRetangulo = calcularAreaRetangulo(base, altura);
        System.out.println("A área do retângulo é: " + areaRetangulo);
    }

    public static double calcularAreaRetangulo(double base, double altura) {
        
        return base * altura;
    }
}