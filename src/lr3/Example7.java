package lr3;

public class Example7 {
    public static void main(String[] args) {
        int arrayLength = 10;

        char[] letterArray = new char[arrayLength];
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        for (int iterator = 0; iterator < arrayLength*2; iterator += 2) {
            letterArray[iterator/2] = alphabetString.charAt(iterator);
        }
        System.out.println(letterArray);

        char[] reverseArray = new char[arrayLength];

        for (int iterator = 0; iterator < arrayLength; iterator++) {
            reverseArray[iterator] = letterArray[arrayLength-1-iterator];
        }
        System.out.println(reverseArray);
    }
}
