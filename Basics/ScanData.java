import java.util.Scanner;

public class ScanData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer: ");
        int number = sc.nextInt();

        System.out.println("Enter any float: ");
        float floatingNumber = sc.nextFloat();

        System.out.println("Enter any double: ");
        double doubleNumber = sc.nextDouble();
        
        sc.nextLine();  // to clear the buffer
        System.out.println("Enter any string: ");
        // String string = sc.next();   // it will only take one word
        String stringLine = sc.nextLine();  // it will take whole line
        // sc.nextLine();  // to clear the buffer

        System.out.println("Enter any boolean: ");
        boolean bool = sc.nextBoolean();

        System.out.println("Integer: " + number);
        System.out.println("Float: " + floatingNumber);
        System.out.println("Double: " + doubleNumber);
        // System.out.println("String: " + string);
        System.out.println("String Line: " + stringLine);
        System.out.println("Boolean: " + bool);
    }
}
/*
Scanner Class in java:

> Scanner class is used to scan data from console or user input.
> It is present in java.util package.
> It is used to read data from console or user input.

Methods of Scanner class: 

1. nextByte() : It is used to scan the next token of the input as a byte.
2. nextShort() : It is used to scan the next token of the input as a short.
3. nextInt() : It is used to scan the next token of the input as an int.
4. nextLong() : It is used to scan the next token of the input as a long.
5. nextFloat() : It is used to scan the next token of the input as a float.
6. nextDouble() : It is used to scan the next token of the input as a double.
7. next() : It is used to scan the next token of the input as a string.
8. nextLine() : It is used to scan the next line of the input as a string.
9. nextBoolean() : It is used to scan the next token of the input as a boolean.

How to create object of Scanner class?

> Scanner sc = new Scanner(System.in);

> we can scan data or take input form different sources:
    1. System.in : It is used to take input from keyboard.
    2. System.out : It is used to take input from console.
    3. File : It is used to take input from file.
    4. String : It is used to take input from string object.
    5. Path : It is used to take input from path object.

> Syntax:
className objectName = new className(parameters);
*/