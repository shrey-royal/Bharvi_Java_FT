import java.util.Scanner;

public class IfElse_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //ladder if else
        // System.out.println("Enter your marks(0-100): ");
        // int marks = sc.nextInt();
        
        // if(marks >= 90) System.out.println("Grade A");
        // else if(marks >= 80 && marks < 90) System.out.println("Grade B");
        // else if(marks >= 70 && marks < 80)
        //     System.out.println("Grade C");
        // else if(marks >= 60 && marks < 70)
        //     System.out.println("Grade D");
        // else if(marks >= 50 && marks < 60)
        //     System.out.println("Grade E");
        // else
        //     System.out.println("Grade F");

        //nested if else
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18) { //outer if
            System.out.println("You are eligible to vote");
            if(age >= 60) { //inner if
                System.out.println("You are a senior citizen");
            }
            else {
                System.out.println("You are not a senior citizen");
            }
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
}