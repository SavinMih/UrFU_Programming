package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число для проверки: ");
        int num = input.nextInt();

        boolean divisiveByThree = num%3 == 0;

        if (divisiveByThree) {
            System.out.println(String.format("Число %d кратно трём", num));
        } else {
            System.out.println(String.format("Число %d не делится на три", num));
        }
    }
}
