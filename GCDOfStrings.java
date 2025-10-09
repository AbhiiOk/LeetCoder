import java.util.*;

public class GCDOfStrings {

    // Function to find GCD string
    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if both have the same repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // no common pattern
        }

        // Step 2: Find gcd of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to find GCD of two numbers
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Main method for VS Code input/output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = gcdOfStrings(str1, str2);

        if (result.isEmpty()) {
            System.out.println("No common divisor string exists.");
        } else {
            System.out.println("GCD of strings: " + result);
        }

        sc.close();
    }
}
