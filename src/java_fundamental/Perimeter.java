package java_fundamentals;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double l=sc.nextDouble();
            double w=sc.nextDouble();
            double perimeter= 2*(l+w);
            System.out.println("Perimeter is "+perimeter);

    }
}
