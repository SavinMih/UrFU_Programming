package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println(String.format("Ваш год рождения %d", currentYear - age));
    }
}
