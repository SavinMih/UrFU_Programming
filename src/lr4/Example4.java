package lr4;

public class Example4 {
    public static void main(String[] args) {
        String[][] rectangle = new String[15][15];
        for (int iterator = 0; iterator < 15; iterator++) {
            for (int j = 0; j < 15; j++) {
                if (iterator == 0) {
                    rectangle[iterator][j] = "|";
                } else if (iterator == j) {
                    rectangle[iterator][j] = "\\";
                } else if (iterator > j) {
                    rectangle[iterator][j] = "";
                } else {
                    rectangle[iterator][j] = "_";
                }
            }
        }

        for (int j = 0; j < 15; j++) {
            StringBuilder line = new StringBuilder();
            for (int iterator = 0; iterator < 15; iterator++) {
                line.append(rectangle[iterator][j]);
            }
            System.out.println(line);
        }
    }
}
