package lr9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            int[][] matrix = new int[][]{
                    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                    {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                    {41, 42, 43, 44, 54, 64, 74, 48, 49, 50},
                    {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                    {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                    {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                    {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                    {91, 92, 93, 94, 95, 96, 97, 98, 99, 100},
            };
            Scanner input = new Scanner(System.in);

            System.out.println("Введите номер столбца:");
            int columnNumber = input.nextInt();

            System.out.println("Числа в столбце:");
            for (int[] array : matrix) {
                System.out.println(array[columnNumber]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Номер столбца должен быть числом");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В матрице нет столбца с таким номером");
        }
    }
}
