package Task1;

public class Task2 {

    /* Створіть метод, який приймає на вхід рядок та на виході змінює регістри букв на протилежні.
    Приклад - на вході "рУматРОн" на виході "РуМАТроН"*/

    public static String reverseCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ( Character.isUpperCase(c) ) {
                chars[i] = Character.toLowerCase(c);
            } else if ( Character.isLowerCase(c) ) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String text = "рУматРОн";
        System.out.println("Оригінальний текст: " + text);
        Task2 task2 = new Task2();
        System.out.println("Змінений текст: " + task2.reverseCase(text));

    }
}
