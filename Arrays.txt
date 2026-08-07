//  Arrays 

public class Arrays {
    public static void main(String[] args) {

        int[] num = {45, 12, 78, 23, 90};

        System.out.println("Saare elements :");
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }

        // for-each loop
        System.out.print("\nFor-each se : ");
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Sum aur Average
        int sum = 0;
        for (int x : num) sum += x;
        System.out.println("\nSum     = " + sum);
        System.out.println("Average = " + (sum / num.length));

        // Bada aur chhota
        int max = num[0], min = num[0];
        for (int x : num) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Sabse bada  = " + max);
        System.out.println("Sabse chhota= " + min);

        // 2D Array
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("\n2D Array :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
