package timus.task_2056;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int[] allMarks = new int[num];

        for (int i = 0; i < num; i++) {
            int mark = Integer.parseInt(in.nextLine());

            allMarks[i] = mark;
        }

        float avg = 0;

        for (int i = 0; i < num; i++) {
            avg += allMarks[i];
        }

        avg = avg / num;

        if (contains(allMarks, 3)) {
            System.out.println("None");
        } else if (avg == 5) {
            System.out.println("Named");
        } else if (avg >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
