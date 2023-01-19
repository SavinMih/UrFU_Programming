package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        int[][] matrix = new int[num][num];

        int number = 1;

        for (int iterator = 0; iterator < num*2; iterator++){
            for (int i = 0; i < iterator; i++) {
                int index = num - iterator + i;
                if (index >= 0 && index < num && i >= 0 && i < num) {
                    matrix[i][index] = number;
                    number++;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < num; j++) {
                line.append(matrix[i][j]).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}
