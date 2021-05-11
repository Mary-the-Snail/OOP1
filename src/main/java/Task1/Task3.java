package Task1;

import java.util.Arrays;

public class Task3 {
    /* Створіть метод, який сортує будь який масив int[] методом вибору. */
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {

                if ( arr[j] < min ) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if ( i != min_i ) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 2, 56, 13, 0, -6, 9, 9};
        System.out.println("Оригінальний масив:\n" + Arrays.toString(arr));
        System.out.println("Відсортований масив:");
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
