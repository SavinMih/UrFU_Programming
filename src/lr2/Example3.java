package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число для проверки: ");
        int num = input.nextInt();

        boolean divisiveByFour = num%4 == 0;

        if (divisiveByFour && num >= 10) {
            System.out.println(String.format("Число %d удовлетворяет условиям проверки", num));
        } else {
            System.out.println(String.format("Число %d не удовлетворяет условиям проверки", num));
        }
    }
}
