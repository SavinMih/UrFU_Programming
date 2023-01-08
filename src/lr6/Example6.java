package lr6;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5)));
    }

    public static int[] cutArray(int[] array, int number) {
        if (number > array.length){
            number = array.length;
        }
        return Arrays.copyOf(array, number);
    }
}
