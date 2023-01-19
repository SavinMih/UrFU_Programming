package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = in.nextLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = str[1].length();

        int modulo = n%k;

        int factorial = n;

        int ck = k;

        while (n-ck > modulo) {
            factorial *= n-ck;
//            System.out.println(n-ck);
            ck += k;
        }

        if (modulo > 0) {
            factorial *= modulo;
        }

        System.out.println(factorial);
    }
}
