public class Switch_Case {
    public static void main(String[] args) {
        
    }
}
/*
// The user will enter a number and you have to count the number of times every digit appears in that number.
Input: 1212121
Expected Output: 1: 4 times
                 2: 3 times
Answer:

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Close the scanner
        scanner.close();

        // Call the countDigits method to count the digits
        countAndPrintDigits(number);
    }

    public static void countAndPrintDigits(long number) {
        // Handle negative numbers by converting them to positive
        number = Math.abs(number);

        // Initialize counts for digits 0 to 9
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0,
                count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;

        // Count the digits using a switch statement
        while (number > 0) {
            int digit = (int) (number % 10); // Get the last digit
            switch (digit) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
            }
            number /= 10; // Remove the last digit
        }

        // Print the results
        printDigitCount(0, count0);
        printDigitCount(1, count1);
        printDigitCount(2, count2);
        printDigitCount(3, count3);
        printDigitCount(4, count4);
        printDigitCount(5, count5);
        printDigitCount(6, count6);
        printDigitCount(7, count7);
        printDigitCount(8, count8);
        printDigitCount(9, count9);
    }

    public static void printDigitCount(int digit, int count) {
        if (count > 0) {
            System.out.println(digit + ": " + count + " times");
        }
    }
}

*/