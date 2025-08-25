package programming_elements.level2;

import java.util.Scanner;

public class SquareSide {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking user input
    System.out.print("Enter the perimeter of the square: ");
    double perimeter = sc.nextDouble();

    // Formula: Perimeter = 4 * side
    double side = perimeter / 4;

    // Output
    System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    sc.close();
}

}
