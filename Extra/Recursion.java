public class Recursion {
    public static void main(String[] args) {
        // Call the factorial method
        System.out.println("Factorial of 5 is " + factorial(5));
    }

    public static int factorial(int num) {
        //Base case: 0! = 1
        // if (num == 0) {
        //     return 1;
        // }
        
        //Recursive case: multiply n with factorial of n - 1
        // return num * factorial(num - 1);

        // (condition)?true:false;
        return (num == 0) ? 1 : num * factorial(num - 1);
    }
}