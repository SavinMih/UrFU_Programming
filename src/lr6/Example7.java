package lr6;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCodes(new char[]{'a', 'b', 'c', 'd', 'e', 'f'})));
    }

    public static int[] getCodes(char[] charArray) {
        int[] codeArray = new int[charArray.length];
        for (int iterator = 0; iterator < charArray.length; iterator++) {
            codeArray[iterator] = charArray[iterator];
        }
        return codeArray;
    }
}
