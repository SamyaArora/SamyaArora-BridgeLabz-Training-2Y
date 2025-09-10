package String.level2;
import java.util.Scanner;
public class StringLengthFinder {  public static int getStringLength(String str) {
    int count = 0;
    try {
        while (true) {
            str.charAt(count);
            count++;
        }
    } catch (StringIndexOutOfBoundsException e) {
    }
    return count;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = getStringLength(input);
        int builtinLength = input.length();
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtinLength);
        sc.close();
    }

}
