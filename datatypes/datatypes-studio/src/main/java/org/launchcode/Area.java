package org.launchcode;

public class Area {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius? ");
        int radius = input.nextDouble();
        //double area = Math.PI * radius * radius;
        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area );
    }
}
