package timus.task_1196;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int[] tnums = new int[num];

        for (int i = 0; i < num; i++) {
            tnums[i] = Integer.parseInt(in.nextLine());
        }

        num = Integer.parseInt(in.nextLine());

        int sum = 0;

        for (int i = 0; i < num; i++) {
            if (contains(tnums, Integer.parseInt(in.nextLine()))) {
                sum++;
            }
        }

        System.out.println(sum);
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
