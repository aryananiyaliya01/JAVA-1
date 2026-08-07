// 02 - Data Types in Java

public class DataTypes { public static void main(String[] args) {

        byte a = 100;
        short b = 5000;
        int c = 100000;
        long d = 100000000L;

        float e = 5.75f;
        double f = 19.99;

        char g = 'X';
        boolean h = false;

        System.out.println("byte    : " + a);
        System.out.println("short   : " + b);
        System.out.println("int     : " + c);
        System.out.println("long    : " + d);
        System.out.println("float   : " + e);
        System.out.println("double  : " + f);
        System.out.println("char    : " + g);
        System.out.println("boolean : " + h);

        // Type casting
        int x = (int) 9.99;
        System.out.println("double se int : " + x);
    }

}
