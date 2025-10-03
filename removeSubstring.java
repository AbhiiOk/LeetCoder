import java.util.Scanner;

public class removeSubstring {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();
        
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
            
            if (sb.length() >= m) {
                String sub = sb.substring(sb.length() - m);
                if (sub.equals(part)) {
                    sb.setLength(sb.length() - m); // remove part
                }
            }
        }
        return sb.toString();
    }

    // main method to run the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter the main string: ");
        String s = sc.nextLine();

        System.out.print("Enter the substring to remove: ");
        String part = sc.nextLine();

        // call method
        removeSubstring obj = new removeSubstring();
        String result = obj.removeOccurrences(s, part);

        // print result
        System.out.println("Result after removal: " + result);

        sc.close();
    }
}
