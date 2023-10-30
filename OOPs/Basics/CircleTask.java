// 8. Circle Class: Create a `Circle` class with a constructor to specify the radius and methods to compute its circumference and area.

import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void circumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    void area() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}


public class CircleTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        Circle c = new Circle(radius);

        c.area();
        c.circumference();
    }
}
