package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите колличество чисел: ");
        int num = input.nextInt();

        String[] array = new String[num];

        int iterable = 0;

        for (int iterator = 0; iterator < num; iterator++) {
            while (iterable % 5 != 2) {
                iterable++;
            }

            array[iterator] = Integer.toString(iterable);

            iterable++;
        }

        System.out.println(String.join(", ", array));
    }
}
