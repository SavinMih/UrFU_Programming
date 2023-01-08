package lr6;

public class Example3 {
    public static void main(String[] args) {
        maxValue(1, 2, 3, 4, 5);
        minValue(1, 2, 3, 4, 5);
        avgValue(1, 2, 3, 4, 5);
    }

    public static void maxValue(int ...numbers) {
        if (numbers.length > 0){
            int maxValue = numbers[0];

            for (int iterator = 1; iterator < numbers.length; iterator++) {
                maxValue = Math.max(maxValue, numbers[iterator]);
            }

            System.out.println(maxValue);
        } else {
            System.out.println(0);
        }
    }

    public static void minValue(int ...numbers) {
        if (numbers.length > 0){
            int minValue = numbers[0];

            for (int iterator = 1; iterator < numbers.length; iterator++) {
                minValue = Math.min(minValue, numbers[iterator]);
            }

            System.out.println(minValue);
        } else {
            System.out.println(0);
        }
    }

    public static void avgValue(int ...numbers) {
        int avgValue = 0;

        for (int iterator = 0; iterator < numbers.length; iterator++) {
            avgValue += numbers[iterator];
        }

        System.out.println(avgValue/numbers.length);
    }
}
