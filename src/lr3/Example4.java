package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = input.nextInt();

        System.out.println("Введите второе число: ");
        int secondNum = input.nextInt();

        for (int currentNum = (Math.min(secondNum, firstNum)); currentNum <= (Math.max(secondNum, firstNum)); currentNum++) {
            System.out.println(currentNum);
        }
    }

    public static void withWhile(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = input.nextInt();

        System.out.println("Введите второе число: ");
        int secondNum = input.nextInt();

        int currentNum = (Math.min(secondNum, firstNum));
        while (currentNum <= (Math.max(secondNum, firstNum))) {
            System.out.println(currentNum);
            currentNum++;
        }
    }
}
