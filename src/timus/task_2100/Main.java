package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int count = 2;

        for (int i = 0; i < num; i++) {
            String guest = in.nextLine();
            if (guest.endsWith("+one")) {
                count++;
            }
            count++;
        }

        if (count == 13) {
            count ++;
        }

        count *= 100;

        System.out.println(count);
    }
}
