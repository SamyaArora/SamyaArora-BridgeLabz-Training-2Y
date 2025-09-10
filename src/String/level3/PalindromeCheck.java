package String.level3;
import java.util.Scanner;
public class PalindromeCheck { public static boolean isPalindromeIterative(String text) {
    int start = 0, end = text.length() - 1;
    while (start < end) {
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        int len = text.length();
        char[] rev = new char[len];
        for (int i = 0; i < len; i++) {
            rev[i] = text.charAt(len - 1 - i);
        }
        return rev;
    }

    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeArray(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative two-pointer): " + result1);
        System.out.println("Logic 2 (Recursive): " + result2);
        System.out.println("Logic 3 (Array Comparison): " + result3);
    }

}
