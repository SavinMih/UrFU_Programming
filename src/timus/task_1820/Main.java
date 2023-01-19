package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] ab = in.nextLine().split(" ");

        float i = Float.parseFloat(ab[0])*2;
        float j = Math.min(Float.parseFloat(ab[1]), Float.parseFloat(ab[0]));

        System.out.println((int)(Math.ceil(i/j)));
    }
}
