//  Strings 

public class Strings {
    public static void main(String[] args) {

        String s = "Hello Java World";

        System.out.println("String      : " + s);
        System.out.println("Length      : " + s.length());
        System.out.println("Upper Case  : " + s.toUpperCase());
        System.out.println("Lower Case  : " + s.toLowerCase());
        System.out.println("Char at 4   : " + s.charAt(4));
        System.out.println("Substring   : " + s.substring(6, 10));
        System.out.println("Replace     : " + s.replace("Java", "Python"));
        System.out.println("Index of Java : " + s.indexOf("Java"));
        System.out.println("Contains Java : " + s.contains("Java"));

        // Compare
        String a = "abc", b = "abc";
        System.out.println("Equals : " + a.equals(b));

        // Reverse
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse : " + rev);

        // Palindrome check
        String word = "madam";
        String r = new StringBuilder(word).reverse().toString();
        if (word.equals(r))
            System.out.println(word + " Palindrome hai");
        else
            System.out.println(word + " Palindrome nahi hai");
    }
}
