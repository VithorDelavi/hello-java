import java.util.Scanner;

public class Calculator {

    // Soma
    public static double soma(double a, double b) {
        return a + b;
    }

    // Subtração
    public static double subtracao(double a, double b) {
        return a - b;
    }

    // Multiplicação
    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    // Divisão
    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA EM JAVA ===");
        System.out.println("Dois Numeros e depois escolhe a operação!");

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = soma(numero1, numero2);
                break;
            case 2:
                resultado = subtracao(numero1, numero2);
                break;
            case 3:
                resultado = multiplicacao(numero1, numero2);
                break;
            case 4:
                resultado = divisao(numero1, numero2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nResultado: " + resultado);

        scanner.close();
    }
}