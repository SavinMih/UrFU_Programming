package lr3;

import java.util.Arrays;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        int arrayLength = 10;

        char[] letterArray = new char[arrayLength];
        String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] array = new String[]{"A", "E", "I", "O", "U", "Y"};

        int adjustment = 0;

        for (int iterator = 0; iterator < arrayLength; iterator++) {
            if (!(Arrays.asList(array).contains(Character.toString(alphabetString.charAt(iterator))))) {
                letterArray[iterator-adjustment] = alphabetString.charAt(iterator);
            } else {
                arrayLength++;
                adjustment++;
            }
        }
        System.out.println(letterArray);
    }
}
