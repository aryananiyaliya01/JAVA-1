// 07 - Loops 

public class Loops {
    public static void main(String[] args) {

        // for loop - 1 se 10
        System.out.println("For Loop :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop - table of 5
        System.out.println("\nWhile Loop (Table of 5) :");
        int i = 1;
        while (i <= 10) {
            System.out.println("5 x " + i + " = " + (5 * i));
            i++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop :");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

        // sum of 1 to 100
        int sum = 0;
        for (int k = 1; k <= 100; k++) {
            sum = sum + k;
        }
        System.out.println("\n1 se 100 ka sum = " + sum);
    }
}
