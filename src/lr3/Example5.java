package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите колличество чисел в сумме: ");
        int num = input.nextInt();

        String[] sumParts = new String[num];

        Random random = new Random();
        int sum = 0;

        for (int iterator = 0; iterator < num; iterator++) {
            int sumPart = random.nextInt(0, 1_000);

            while ((sumPart % 5 != 2) || (sumPart % 3 != 1)){
                sumPart = random.nextInt(0, 1_000);
            }

            sumParts[iterator] = Integer.toString(sumPart);
            sum += sumPart;
        }

        System.out.println(String.join(" + ", sumParts) + " = " + sum);
    }
}
