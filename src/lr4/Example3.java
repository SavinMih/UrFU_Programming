package lr4;

public class Example3 {
    public static void main(String[] args) {
        int[][] rectangle = new int[20][10];
        for (int iterator = 0; iterator < 20; iterator++) {
            for (int j = 0; j < 10; j++) {
                rectangle[iterator][j] = 2;
            }
        }

        for (int j = 0; j < 10; j++) {
            StringBuilder line = new StringBuilder();
            for (int iterator = 0; iterator < 20; iterator++) {
                line.append(rectangle[iterator][j]);
            }
            System.out.println(line);
        }
    }
}
