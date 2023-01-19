package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int iterator = 1;

        int sum = 1;

        while (iterator != num) {
            iterator = implement(num, iterator);
            sum += iterator;
        }

        System.out.println(sum);
    }

    private static int implement(int required, int iterator) {
        if (required > iterator) {
            iterator++;
        } else if (required < iterator) {
            iterator--;
        }
        return iterator;
    }
}
