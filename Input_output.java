//  - Input / Output in Java

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Apna naam likho : ");
        String name = sc.nextLine();

        System.out.print("Apni age likho  : ");
        int age = sc.nextInt();

        System.out.print("Marks likho     : ");
        double marks = sc.nextDouble();

        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("Aapki age  : " + age);
        System.out.println("Aapke marks: " + marks);

        sc.close();
    }
}
