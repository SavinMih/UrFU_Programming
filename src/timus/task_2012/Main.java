package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstHourTasks = in.nextInt();

        int minutesLeft = 4 * 60;
        int allTasks = 12;

        for (int i = 0; i < allTasks - firstHourTasks; i++) {
            minutesLeft -= 45;
        }

        if (minutesLeft > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
