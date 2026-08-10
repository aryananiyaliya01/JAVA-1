// 03 - Operators in Java

public class Operators { public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("AND : " + (a > 5 && b < 5));
        System.out.println("OR  : " + (a < 5 || b < 5));
        System.out.println("NOT : " + !(a > 5));

        a++;
        System.out.println("a++ ke baad : " + a);
        b--;
        System.out.println("b-- ke baad : " + b);
    }

}
