package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String message = in.nextLine();
        char[] messageArray = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            messageArray[i] = message.charAt(i);
        }

        String ones = "adgjmpsvy._ ";
        String twos = "behknqtwz,";
        String tres = "cfilorux!";

        int messageSum = 0;

        for (char i : messageArray) {
            if (ones.contains(Character.toString(i))) {
                messageSum += 1;
            } else if (twos.contains(Character.toString(i))) {
                messageSum += 2;
            } else if (tres.contains(Character.toString(i))) {
                messageSum += 3;
            }
        }

        System.out.println(messageSum);
    }
}
