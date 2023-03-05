package lr9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Введите колличество элементов массива: ");
            int arrayLength = input.nextInt();

            int[] intArray = new int[arrayLength];

            for (int iterator = 0; iterator < arrayLength; iterator++) {
                System.out.println("Введите следующее число:");
                intArray[iterator] = input.nextInt();
            }

            int avg = 0;
            int posNum = 0;
            for (int number : intArray) {
                if (number > 0) {
                    avg += number;
                    posNum ++;
                }
            }
            avg /= posNum;

            System.out.println("Среднее значение:");
            System.out.println(avg);
        } catch (InputMismatchException e) {
            System.out.println("В массив разрешено вводить только числа");
        } catch (NegativeArraySizeException e) {
            System.out.println("Колличество чисел должно быть положительным");
        } catch (ArithmeticException e) {
            System.out.println("В массиве отсутствуют положительные значения");
        }
    }
}
