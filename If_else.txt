// 05 - If Else 

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Marks daalo (0-100) : ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade : A+");
        } else if (marks >= 75) {
            System.out.println("Grade : A");
        } else if (marks >= 60) {
            System.out.println("Grade : B");
        } else if (marks >= 35) {
            System.out.println("Grade : Pass");
        } else {
            System.out.println("Grade : Fail");
        }

        // Even ya Odd
        System.out.print("Koi number daalo : ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " Even hai");
        else
            System.out.println(n + " Odd hai");

        sc.close();
    }
}
