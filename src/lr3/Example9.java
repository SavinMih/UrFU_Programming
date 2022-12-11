package lr3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        for (int iterator = 0; iterator < 10; iterator++) {
            array[iterator] = random.nextInt(1, 1_000);
        }

        System.out.println("Массив:");
        for (int num : array){
            System.out.println(num);
        }

        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        for (int iterator = 0; iterator < 10; iterator++) {
            if (array[iterator] == min) {
                System.out.println(String.format("Минимальное значение %d по индексу %d", array[iterator], iterator));
            }
        }
    }
}
