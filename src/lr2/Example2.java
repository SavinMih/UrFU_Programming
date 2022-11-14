package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число для проверки: ");
        int num = input.nextInt();

        boolean divisionByFive = num%5 == 2;
        boolean divisionBySeven = num%7 == 1;

        if (divisionByFive && divisionBySeven) {
            System.out.println(String.format("Число %d удовлетворяет условиям проверки", num));
        } else {
            System.out.println(String.format("Число %d не удовлетворяет условиям проверки", num));
        }
    }
}
