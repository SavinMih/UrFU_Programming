package lr6;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapArray('a', 'b', 'c', 'd', 'e', 'f', 'g')));
    }

    public static char[] swapArray(char ...array) {
        if (array.length > 1) {
            for (int iterator = 0; iterator < array.length/2; iterator++) {
                char buffer = array[iterator];
                array[iterator] = array[array.length - 1 - iterator];
                array[array.length - 1 - iterator] = buffer;
            }
        }
        return array;
    }
}
