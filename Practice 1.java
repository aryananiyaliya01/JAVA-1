import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehla number likho: ");
        double num1 = sc.nextDouble();

        System.out.print("Dusra number likho: ");
        double num2 = sc.nextDouble();

        System.out.print("Sign chuno (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.println("Sahi sign nahi chuna!"); return;
        }

        System.out.println("Answer = " + result);
        sc.close();
    }
}
