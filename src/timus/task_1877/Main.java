package timus.task_1877;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] ab1 = in.nextLine().split(" ");
        String[] ab2 = in.nextLine().split(" ");
        String[] ab3 = in.nextLine().split(" ");

        int firstNumber = Integer.parseInt(ab1[0]) - Integer.parseInt(ab3[0]);
        int secondNumber = Integer.parseInt(ab1[1]) - Integer.parseInt(ab2[1]);

        System.out.println(firstNumber + " " + secondNumber);
    }
}
