import java.util.Random;

public class Aaray2d {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        
        Random r = new Random();

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + ", ");
            }
            System.out.println("\b\b ");
        }
    }
}
/*
2 Dimensional array : row and column

int[][] arr = new int[2][3];

*/