//  - Switch Case 

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Din ka number daalo (1-7) : ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday");    break;
            case 2: System.out.println("Tuesday");   break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday");  break;
            case 5: System.out.println("Friday");    break;
            case 6: System.out.println("Saturday");  break;
            case 7: System.out.println("Sunday");    break;
            default: System.out.println("Galat number!");
        }

        // Simple Calculator
        System.out.print("Pehla number : ");
        int a = sc.nextInt();
        System.out.print("Dusra number : ");
        int b = sc.nextInt();
        System.out.print("Operator (+ - * /) : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Answer = " + (a + b)); break;
            case '-': System.out.println("Answer = " + (a - b)); break;
            case '*': System.out.println("Answer = " + (a * b)); break;
            case '/': System.out.println("Answer = " + (a / b)); break;
            default : System.out.println("Galat operator!");
        }

        sc.close();
    }
}
