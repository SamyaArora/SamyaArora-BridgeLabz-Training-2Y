package java_fundamentals;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double volume=Math.PI*r*r*h;
        System.out.println("Area is "+volume);
    }
}
