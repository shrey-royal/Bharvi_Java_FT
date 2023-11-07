import java.util.Scanner;

class Shape {
    protected int length, breadth, radius;
    
    public void calculateArea() {
        System.out.println("Area of shape: 0");
    }
}

class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override   //Annotation: it makes sure that the method is overridden from the parent class
    public void calculateArea() {
        System.out.println("Area of rectangle: " + length * breadth);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle: " + 3.14 * radius * radius);
    }
}


public class MthdOverride {
    public static void main(String[] args) {
        // @SuppressWarnings("unused")
        // MthdOverride obj = new MthdOverride();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Rectangle rect = new Rectangle(length, breadth);
        rect.calculateArea();

        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();

        Circle cir = new Circle(radius);
        cir.calculateArea();

        sc.close(); //here the sc object will be destroyed and the memory will be freed and also it helps in preventing memory leak
    }
}

/*
1. Bank Account Inheritance:

   Create a class hierarchy for bank accounts, including a base class `BankAccount` and subclasses like `SavingsAccount` and `CheckingAccount`. The base class should have a method `calculateInterest()` that calculates and returns the interest on the account balance. Subclasses should override this method to calculate interest specific to their account type. Additionally, implement a method `displayAccountInfo()` in each subclass to display relevant account information. Demonstrate method overriding by creating instances of different account types, calculating interest, and displaying account information.

2. Employee Inheritance:

   Create a class hierarchy for employees in an organization. Start with a base class `Employee` and subclasses like `Manager` and `Engineer`. The base class should have a method `calculateSalary()` that calculates and returns the salary. Subclasses should override this method to calculate the salary based on their specific roles. Demonstrate method overriding by creating instances of different employees and calculating their salaries.

3. Vehicle Polymorphism:

   Implement a class hierarchy for vehicles, including a base class `Vehicle` and subclasses like `Car` and `Motorcycle`. The base class should have a method `startEngine()` that prints a message like "Engine started." Subclasses should override this method to provide specific messages. Create instances of different vehicles and demonstrate method overriding by calling the `startEngine()` method on them.

*/