package lr9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Введите колличество элементов массива: ");
            int arrayLength = input.nextInt();
            byte[] byteArray = new byte[arrayLength];

            for (int iterator = 0; iterator < arrayLength; iterator++) {
                System.out.println("Введите следующее число:");
                byteArray[iterator] = (byte) input.nextInt();
            }

            byte sum = 0;

            for (byte element : byteArray) {
                sum += element;
            }

            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("Введите число");
        } catch (NegativeArraySizeException e) {
            System.out.println("Колличество элементов должно быть положительным");
        }
    }

}
