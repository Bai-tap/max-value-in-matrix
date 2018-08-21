import java.util.Random;
import java.util.Scanner;

public class MaxValueInMatrix {
    public static void main(String[] args) {
        int[][] array = getArray(getHeight(), getWidth());
        displayArray(array);
        System.out.println("Max value is: " + getMaxvalue(array));
    }

    private static int[][] getArray(int height, int width) {
        int[][] array = new int[height][width];
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(10000) + 1;
            }
        }
        return array;
    }

    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        return sc.nextInt();
    }

    private static int getHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        return sc.nextInt();
    }

    private static int getMaxvalue(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
