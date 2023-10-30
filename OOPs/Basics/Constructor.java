class Person {
    private String name;
    private int age;
    private String education;

    Person() {
        name = null;
        age = 0;
        education = null;
    }

    Person(String name, int age, String education) {
        this.name = name;   //this keyword is used to refer to the current object
        this.age = age;
        this.education = education;
    }

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Education: " + education);
    }

}

public class Constructor {
    public static void main(String[] args) {
        // Person p = new Person();
        // Person p1 = new Person("Rahul", 20, "B.Tech");

        // p.introduce();
        // p1.introduce();

        Person p[] = new Person[3];

        p[0] = new Person();
        p[1] = new Person("Rahul", 20, "B.Tech");
        p[2] = new Person("Bharvi", 21, "Masters in UI/UX");

        for (Person i : p) {
            i.introduce();
            System.out.println();
        }

    }
}

/*
Constructor: They are the special methods which are used to initialize the object.

> Constructor name should be same as class name.
> Constructor should not have any return type.
> Constructor can have any access modifier. (public, private, protected)
> Constructor can have any number of parameters.

2 types of constructors:
1. Default constructor: It is the constructor which does not have any parameter.
2. Parameterized constructor: It is the constructor which has parameters.

Task:

1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.

2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

3. Rectangle Class: Implement a `Rectangle` class with constructors for its width and height, and include methods to calculate its area and perimeter.

4. Bank Account Class: Create a `BankAccount` class with a constructor to initialize an account with an account number and balance.

5. Student Class: Develop a `Student` class with a constructor to store a student's name, ID, and a list of courses they are enrolled in.

6. Car Class: Design a `Car` class with a constructor to set the car's make, model, and year of manufacture.

7. Employee Class: Implement an `Employee` class with a constructor to store an employee's name, employee ID, and salary.

8. Circle Class: Create a `Circle` class with a constructor to specify the radius and methods to compute its circumference and area.

9. Library Book Class: Design a `LibraryBook` class with a constructor that includes the book's title, author, and a boolean indicating whether it's checked out.

10. Computer Class: Create a `Computer` class with a constructor to store information about a computer, including its brand, model, and price.


*/