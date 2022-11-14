package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий день недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите текущий месяц: ");
        String monthName = in.nextLine();

        System.out.println("Введите сегодняшнее число: ");
        int date = in.nextInt();

        System.out.println("Сегодня: " + dayOfWeek + ", " + monthName + ", " + date + " число");
    }
}
