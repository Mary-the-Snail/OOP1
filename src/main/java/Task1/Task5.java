package Task1;

public class Task5 {

    /* Створіть метод, який знаходить суму цифр будь якого числа int. */
    public static void main(String[] args) {

        int n = 256;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Сума цифр числа 256: "+sum);
    }
}