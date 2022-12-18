package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] rectangle = new int[20][10];
        for (int iterator = 0; iterator < 20; iterator++) {
            for (int j = 0; j < 10; j++) {
                rectangle[iterator][j] = random.nextInt(0, 10);
            }
        }

        int[][] rectangleCopy = new int[10][20];
        for (int j = 0; j < 10; j++) {
            for (int iterator = 0; iterator < 20; iterator++) {
                rectangleCopy[j][iterator] = rectangle[iterator][j];
            }
        }

        for (int j = 0; j < 10; j++) {
            StringBuilder line = new StringBuilder();
            for (int iterator = 0; iterator < 20; iterator++) {
                line.append(rectangle[iterator][j]+" ");
            }
            System.out.println(line);
        }

        System.out.println();

        for (int iterator = 0; iterator < 20; iterator++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 10; j++) {
                line.append(rectangleCopy[j][iterator]+" ");
            }
            System.out.println(line);
        }
    }
}
