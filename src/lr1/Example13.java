package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое слагаемое: ");
        int x = in.nextInt();

        System.out.println("Введите второе слагаемое: ");
        int y = in.nextInt();

        System.out.println(String.format("Сумма чисел %d и %d равна %d", x, y, x+y));
    }
}
