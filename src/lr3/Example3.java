package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите колличество повторений: ");
        int num = input.nextInt();

        if (num >= 1) {
            System.out.println("1");
        }

        if (num >= 2) {
            System.out.println("1");
        }

        int num1 = 1;
        int num2 = 1;

        for (int iterator = 2; iterator < num; iterator++) {
            int sum = num1 + num2;
            System.out.println(sum);
            num2 = num1;
            num1 = sum;
        }
    }
}
