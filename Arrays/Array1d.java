// import java.util.Scanner;
// import java.util.Random;

import java.util.*; //this will import all the classes from java.util package

public class Array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        // int[] array1 = {1, 2, 3, 4, 5};

        // arr[0] = 1;
        // arr[1] = 2;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);

        //Generate 10 random number and store it in the array
        Random r = new Random();
        for(int i=0; i<size; i++) {
            arr[i] = r.nextInt(1000);   // 0 - 999
        }

        //Print the array
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        String[] names = new String[5];
        for(int i=0; i<5; i++) {
            System.out.println("Enter the name: ");
            names[i] = sc.next();   //word
        }

        //advanced for loop / enhanced for loop / for each loop
        for (String n : names) {
            System.out.println(n);
        }
    }
}
/*
Array 1D: one dimensional arrays

How to create an object of an array:
syntax:
datatype[] arrayName = new datatype[size];


datatype[] arrayName -> declaration
new datatype[size] -> instantiation -> the memory gets allocated

int[] arr = new int[5]; // declaration
int []arr;
int arr[];

// arr = new int[5];

2d array -> 2 dimensional array

datatype[][] arrayName = new datatype[rowSize][columnSize];

int[][] arr = new int[3][3];

int[][] arr -> declaration
new int[3][3] -> instantiation

int[][] arr = new int[3][3];
int [][]arr;
int []arr[];
int[] arr[];
int[] []arr;

// arr = new int[3][3];

Tasks:

> Write a Java program to find the maximum and minimum value of an array.
> Write a Java program to reverse an array of integer values.
> Write a Java program to find duplicate values in an array of integer values.
> Write a Java program to find duplicate values in an array of string values.
> Write a Java program to find common elements between two arrays (string values).
> Write a Java program to find common elements between two integer arrays.
> Write a Java program to remove duplicate elements from an array.
> Write a Java program to find the second largest element in an array.
> Write a Java program to find the second smallest element in an array.

Test Cases:

1. Find the maximum and minimum value of an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: Maximum: 9, Minimum: 1

int[] array2 = {0, 0, 0, 0, 0};
// Test case 2
// Expected output: Maximum: 0, Minimum: 0


2. Reverse an array of integer values:

int[] array = {1, 2, 3, 4, 5};
// Test case 1
// Expected output: [5, 4, 3, 2, 1]

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: [50, 40, 30, 20, 10]


3. Find duplicate values in an array of integer values:

int[] array = {1, 2, 2, 3, 4, 4, 5};
// Test case 1
// Expected output: [2, 4]

int[] array2 = {10, 20, 30, 10, 40, 30, 50};
// Test case 2
// Expected output: [10, 30]


4. Find duplicate values in an array of string values:

String[] array = {"apple", "banana", "cherry", "banana", "date"};
// Test case 1
// Expected output: ["banana"]

String[] array2 = {"apple", "banana", "cherry", "date", "apple"};
// Test case 2
// Expected output: ["apple"]


5. Find common elements between two arrays (string values):

String[] array1 = {"apple", "banana", "cherry", "date"};
String[] array2 = {"banana", "date", "grape", "kiwi"};
// Test case 1
// Expected output: ["banana", "date"]

String[] array3 = {"apple", "banana", "cherry"};
String[] array4 = {"date", "grape", "kiwi"};
// Test case 2
// Expected output: []


6. Find common elements between two integer arrays:

int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {4, 5, 6, 7, 8};
// Test case 1
// Expected output: [4, 5]

int[] array3 = {1, 2, 3};
int[] array4 = {4, 5, 6};
// Test case 2
// Expected output: []


7. Remove duplicate elements from an array:

int[] array = {1, 2, 2, 3, 4, 4, 5};
// Test case 1
// Expected output: [1, 2, 3, 4, 5]

int[] array2 = {10, 20, 30, 10, 40, 30, 50};
// Test case 2
// Expected output: [10, 20, 30, 40, 50]


8. Find the second largest element in an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: 7

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: 40


9. Find the second smallest element in an array:

int[] array = {5, 3, 9, 1, 7};
// Test case 1
// Expected output: 3

int[] array2 = {10, 20, 30, 40, 50};
// Test case 2
// Expected output: 20

*/