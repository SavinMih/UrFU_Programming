package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        String dayOfWeek = input.nextLine();

        switch (dayOfWeek.toLowerCase()) {
            case "понедельник" -> System.out.println(1);
            case "вторник" -> System.out.println(2);
            case "среда" -> System.out.println(3);
            case "четверг" -> System.out.println(4);
            case "пятница" -> System.out.println(5);
            case "суббота" -> System.out.println(6);
            case "воскресение" -> System.out.println(7);
            default -> System.out.println("Вы ввели неверное значение");
        }
    }

    public static void ifStatement(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        String dayOfWeek = input.nextLine();

        if ("понедельник".equals(dayOfWeek.toLowerCase())) {
            System.out.println(1);
        } else if ("вторник".equals(dayOfWeek.toLowerCase())) {
            System.out.println(2);
        } else if ("среда".equals(dayOfWeek.toLowerCase())) {
            System.out.println(3);
        } else if ("четверг".equals(dayOfWeek.toLowerCase())) {
            System.out.println(4);
        } else if ("пятница".equals(dayOfWeek.toLowerCase())) {
            System.out.println(5);
        } else if ("суббота".equals(dayOfWeek.toLowerCase())) {
            System.out.println(6);
        } else if ("воскресение".equals(dayOfWeek.toLowerCase())) {
            System.out.println(7);
        } else {
            System.out.println("Вы ввели неверное значение");
        }
    }
}
