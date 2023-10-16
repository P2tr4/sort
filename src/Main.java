import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[3];
        for (int i = 0; i<array1.length; i++){
            array1[i] = random.nextInt(19-0+1) + 0;
        }
        System.out.println("no sort: " + Arrays.toString(array1));
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    // Обмен значений
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("no sort: " + Arrays.toString(array1));

        System.out.println("Двумерный массив: ");

        int[][] array2D = new int[320][500];

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = random.nextInt(500);
            }
        }

        System.out.println("no sort:");
        for (int[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }

        for (int row = 0; row < array2D.length; row++) {
            for (int i = 0; i < array2D[row].length - 1; i++) {
                for (int j = 0; j < array2D[row].length - 1 - i; j++) {
                    if (array2D[row][j] > array2D[row][j + 1]) {
                        int temp = array2D[row][j];
                        array2D[row][j] = array2D[row][j + 1];
                        array2D[row][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("sort:");
        for (int[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
    }
}