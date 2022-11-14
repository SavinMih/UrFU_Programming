package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();

        int n1 = x-1;
        int n2 = x;
        int n3 = x+1;
        int n4 = (n1+n2+n3)*(n1+n2+n3);

        System.out.println(String.format("x-1=%d\nx=%d\nx+1=%d\n(x-1+x+x+1)^2=%d", n1, n2, n3, n4));
    }
}
