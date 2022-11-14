package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число для проверки: ");
        int num = input.nextInt();

        System.out.println(String.format("В числе %d - %d тысяч", num, (num/1000)%10));
    }
}
