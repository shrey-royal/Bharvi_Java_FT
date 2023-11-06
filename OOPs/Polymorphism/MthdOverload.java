public class MthdOverload {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) { // Method Overloading
        return a + b + c;
    }

    public static double add(double a, double b) { // Method Overloading
        return a + b;
    }

    public static float add(float a, float b) { // Method Overloading
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(11.5f, 20.5f));
    }
}
/*
Method Overloading: When a class has multiple methods with same name but different parameters, it is known as Method Overloading.

Task:

1. Create a Java program that demonstrates method overloading by defining multiple methods with the same name but different parameter types to calculate the area of different geometric shapes (e.g., circle, rectangle, triangle).

2. Develop a class in Java that uses method overloading to perform arithmetic operations (addition, subtraction, multiplication, division) on different data types (int, double, float).

3. Implement a library system in Java that uses method overloading to search for books by either title, author, or publication year.

4. Design a class for a calculator application in Java with overloaded methods for performing basic operations (addition, subtraction, multiplication, division) on integers and floating-point numbers.

5. Create a Java program to calculate the volume and surface area of various 3D shapes (e.g., sphere, cube, cylinder) using method overloading to handle different input parameters.

6. Build a banking system in Java with overloaded methods for processing different types of transactions (e.g., deposit, withdrawal, transfer) for various account types (savings, checking, loan).

7. Develop a multimedia player application in Java with overloaded methods for playing media files of different formats (e.g., MP3, AVI, MP4).

8. Design a restaurant ordering system in Java that uses method overloading to handle orders for different meal types (breakfast, lunch, dinner) and payment methods (cash, credit card).

9. Create a time utility class in Java with overloaded methods for converting time between different units (e.g., seconds to minutes, minutes to hours, hours to days).

10. Implement a shape sorting program in Java that uses method overloading to sort and display a list of shapes based on their area, perimeter, or volume.

These problem statements should provide a good starting point for practicing method overloading in Java. You can customize and expand upon them as needed for your coding exercises or assignments.
*/