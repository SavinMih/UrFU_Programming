package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String monthName = in.nextLine();

        System.out.println("Введите колличество дней в месяце: ");
        int dayAmount = in.nextInt();

        System.out.println(monthName + " содержит " + dayAmount + " дней");
    }
}
