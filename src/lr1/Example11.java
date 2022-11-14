package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println(String.format("Вы %s и вам %d лет.", name, currentYear-birthYear));
    }
}
