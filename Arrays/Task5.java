// Write a Java program to find common elements between two arrays (string values).

public class Task5 {

    public static String[] findCommonElements(String[] array1, String[] array2) {
        int count = 0;

        //count the number of common elements
        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    count++;
                    break;//break the inner loop
                }
            }
        }

        //create an array to store the common elements
        String[] commonElements = new String[count];
        int index = 0;

        //Fill the common elements array
        for(int i=0; i<array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    commonElements[index] = array1[i];
                    index++;
                    break;//break the inner loop
                }
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"banana", "date", "grape", "kiwi"};

        String[] commonElements1 = findCommonElements(array1, array2);
        System.out.println("Test Case 1");
        System.out.print("Expected Output: [");
        for (int i = 0; i < commonElements1.length; i++) {
            System.out.print("\"" + commonElements1[i] + "\"");
            if(i<commonElements1.length-1) {    //it will skip the last comma
                System.out.print(", ");
            }
        }
        System.out.println("]");

        String[] array3 = {"apple", "banana", "cherry"};
        String[] array4 = {"date", "grape", "kiwi"};

        String[] commonElements2 = findCommonElements(array3, array4);
        System.out.println("\nTest Case 2");
        System.out.print("Expected Output: [");
        for (int i = 0; i < commonElements2.length; i++) {
            System.out.print("\"" + commonElements2[i] + "\"");
            if(i<commonElements2.length-1) {    //it will skip the last comma
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

/*
5. Find common elements between two arrays (string values):

String[] array1 = {"apple", "banana", "cherry", "date"};
String[] array2 = {"banana", "date", "grape", "kiwi"};
// Test case 1
// Expected output: ["banana", "date"]

String[] array3 = {"apple", "banana", "cherry"};
String[] array4 = {"date", "grape", "kiwi"};
// Test case 2
// Expected output: []
*/