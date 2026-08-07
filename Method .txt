// 10 - Methods

public class Methods {

    // bina return ka method
    static void greet() {
        System.out.println("Hello! Welcome to Java.");
    }

    // parameter wala method
    static void printName(String name) {
        System.out.println("Aapka naam : " + name);
    }

    // return karne wala method
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int n) {
        return n * n;
    }

    // factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        greet();
        printName("Rahul");

        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("Square of 6 = " + square(6));
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
