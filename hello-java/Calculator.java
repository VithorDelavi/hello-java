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

        System.out.println("=== CALCULADORA JAVA ===");
        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = soma(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = multiplicacao(n1, n2);
                break;
            case 4:
                resultado = divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nResultado: " + resultado);

        scanner.close();
    }
}