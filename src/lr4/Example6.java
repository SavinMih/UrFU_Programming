package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] rectangle = new int[15][15];
        for (int iterator = 0; iterator < 15; iterator++) {
            for (int j = 0; j < 15; j++) {
                rectangle[iterator][j] = random.nextInt(0,10);
            }
        }

        for (int iterator = 0; iterator < 15; iterator++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 15; j++) {
                line.append(rectangle[iterator][j]+" ");
            }
            System.out.println(line);
        }

        int undesirableLine =   random.nextInt(0,15);
        int undesirableColumn = random.nextInt(0,15);

        int[][] rectangleCopy = new int[14][14];

        for (int iterator = 0; iterator < 15; iterator++) {
            for (int j = 0; j < 15; j++) {
                boolean columnSkipped = false;
                boolean lineSkipped =   false;
                if (iterator >= undesirableColumn) {
                    columnSkipped = true;
                }
                if (j >= undesirableLine) {
                    lineSkipped = true;
                }
                if (iterator != undesirableColumn && j != undesirableLine) {
                    rectangleCopy[columnSkipped ? iterator-1 : iterator][lineSkipped ? j-1 : j] = rectangle[iterator][j];
                }
            }
        }

        System.out.println();

        for (int iterator = 0; iterator < 14; iterator++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 14; j++) {
                line.append(rectangleCopy[iterator][j]).append(" ");
            }
            System.out.println(line);
        }
    }
}
