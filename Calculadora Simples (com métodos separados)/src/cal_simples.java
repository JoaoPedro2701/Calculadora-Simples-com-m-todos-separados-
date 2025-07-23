import java.util.Scanner;

public class cal_simples {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        System.out.println("Divisão: " + dividir(num1, num2));

        sc.close();
    }
}
