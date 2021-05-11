package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {

    /* Розробіть метод, який дозволяє знайти спільні елементи двох діапазонів цілих чисел, та вивести їх на екран.
    Приклад: діапазон з 5 до 11 та діапазон з 18 до 9. Спільні елементи - 9,10,11.*/

    public static void main(String[] args) {

        Integer[] range1 = {5, 6, 7, 8, 9, 10, 11};
        Integer[] range2 = {18, 17, 16, 15, 14, 13, 12, 11, 10, 9};
        List range1List = new ArrayList(Arrays.asList(range1));
        List range2List = Arrays.asList(range2);
        range1List.retainAll(range2List);
        System.out.println("Спільні елементи двох вибірок: " + range1List);
    }
}
