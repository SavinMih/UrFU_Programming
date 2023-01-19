package timus.task_1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nab = in.nextLine().split(" ");

        System.out.println(Integer.parseInt(nab[0])+Integer.parseInt(nab[1]));
    }
}
