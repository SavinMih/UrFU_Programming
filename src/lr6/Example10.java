package lr6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    public static int[] minMax(int ...array) {
        int minValue = array[0];
        int maxValue = array[0];
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return new int[] {maxValue, minValue};
    }
}
