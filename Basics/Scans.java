import java.util.Scanner; // Import the Scanner class

public class Scans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int a = sc.nextInt();
        // System.out.println("Int: " + a);

        // System.out.print("Enter a float: ");
        // float b = sc.nextFloat();
        // System.out.println("Float: " + b);

        // System.out.print("Enter a double: ");
        // double c = sc.nextDouble();
        // System.out.println("Double: " + c);

        // System.out.print("Enter a boolean: ");
        // boolean d = sc.nextBoolean();
        // System.out.println("Boolean: " + d);

        // sc.nextLine(); //to prevent the nextLine() from taking the previous input
        // System.out.print("Enter a string: ");
        // String e = sc.nextLine();   //will scan the whole line
        // System.out.println("String: " + e);

        // System.out.println("Enter a word: ");
        // String f = sc.next();   //will scan only one word
        // System.out.println("Word: " + f);

        // System.out.println("Enter a byte: ");
        // byte g = sc.nextByte();
        // System.out.println("Byte: " + g);

        System.out.println("Enter a character: ");
        char h = sc.next().charAt(0);
        System.out.println("Character: " + h);

        sc.close(); //prevent resource leak
    }
}
/*

Scanner Class in Java is used to take inputs from the user.

> Scanner class is present in java.util package.
> To use the object of Scanner, we need to import java.util.Scanner class.

> Scanner sc = new Scanner(System.in);

here, sc is the object of Scanner class.
> System.in is the standard input stream which is by default the keyboard.

> While declaring the object of Scanner we have to give the source from where we want to take input.
> We can pass InputStream, File, Path etc.

Methods of Scanner class:

1. next() -> It is used to get the input as String. (It reads only one word)
2. nextLine() -> It is used to get the input as String. (It reads the whole line)
3. nextInt() -> It is used to get the input as Integer.
4. nextFloat() -> It is used to get the input as Float.
5. nextDouble() -> It is used to get the input as Double.
6. nextBoolean() -> It is used to get the input as Boolean.
7. nextByte() -> It is used to get the input as Byte.
8. nextShort() -> It is used to get the input as Short.
9. nextLong() -> It is used to get the input as Long.

*/