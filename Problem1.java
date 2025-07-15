import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);
    }
}

class Calculator {
    public double calculate(double a, double b, String op) {
        switch (op.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return b != 0 ? a / b : 0;
            default:
                return 0;
        }
    }
}
