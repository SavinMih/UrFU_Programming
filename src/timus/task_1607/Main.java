package timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nums = in.nextLine().split(" ");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        int d = Integer.parseInt(nums[3]);

        while (a < c) {
            a += b;
            if (a < c) {
                c -= d;
            }
        }

        System.out.println(a);
    }
}
