package timus.task_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] ab = in.nextLine().split(" ");

        System.out.println(Integer.parseInt(ab[0])*(Integer.parseInt(ab[1])+1));
    }
}
