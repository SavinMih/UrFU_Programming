package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();

        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        System.out.println(String.format("%d+%d=%d\n%d-%d=%d", x, y, x+y, x, y, x-y));
    }
}
