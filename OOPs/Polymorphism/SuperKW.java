/*
class Animal {                      //base, parent, super class
    String color = "White";

    Animal() {
        System.out.println("Animal is created");
    }

    void eat() {
        System.out.print("Eating ");
    }
}

class Dog extends Animal {          //derived, child, sub class
    String color = "black";

    Dog() {
        super();                    //super keyword is used to call the parent class' constructor
        System.out.println("Dog is created");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);    //super keyword is used to call the parent class' variable
    }

    void eat() {
        super.eat();                        //super keyword is used to call the parent class' method
        System.out.println("bread...");
    }
}

public class SuperKW {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();

        dog.eat();
    }
}
*/

/*
Super Keyword: used to call parent class' methods, constructors and variables.
    1. super() is used to call the parent class' constructor. (super() should be the first statement in the constructor)
    2. super.variable is used to call the parent class' variable.
    3. super.method() is used to call the parent class' method.

Advantages: 

1. Access to Superclass Methods and Properties: It allows a subclass to access and utilize methods and properties from its superclass.

2. Method Overriding: Facilitates method overriding by providing a way to explicitly call the superclass version of a method in a subclass.

3. Constructor Chaining: Enables calling constructors of the superclass from the subclass, aiding in constructor chaining for proper initialization of inherited attributes.

4. Preventing Ambiguity: Helps in differentiating between superclass and subclass methods or variables when they share the same name.

5. Maintaining Inheritance Hierarchy: Supports maintaining the integrity of the inheritance hierarchy by preserving the functionality of the superclass within subclasses.

*/

class Person {
    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    Student(String name, int age, int id) {
        super(id, name, age);   //super keyword is used to call the parent class' constructor
    }

    void display() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age);
    }
}

class Employee extends Person {
    String designation;
    float salary;

    Employee(String name, int age, int id, String designation, float salary) {
        super(id, name, age);   //super keyword is used to call the parent class' constructor
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nDesignation: " + designation + "\nSalary: " + salary);
    }
}

public class SuperKW {
    public static void main(String[] args) {
        Student s = new Student("Bharvi", 24, 1);
        s.display();

        Employee e = new Employee("Pallavi Ma'am", 25, 99, "Admin", 100000);
        e.display();
    }
}