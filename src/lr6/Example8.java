package lr6;

public class Example8 {
    public static void main(String[] args) {
        System.out.println(avgValue(1, 2, 3, 4, 5, 6, 7));
    }

    public static float avgValue(int ...numbers) {
        int avgValue = 0;

        for (int number : numbers) {
            avgValue += number;
        }

        return (avgValue/numbers.length);
    }
}
