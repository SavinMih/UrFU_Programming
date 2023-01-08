package lr6;

public class Example2 {
    private static int currentValue = 0;

    public static void showCurrentValue() {
        System.out.println(currentValue);
        currentValue ++;
    }

    public static void main(String[] args) {
        showCurrentValue();
        showCurrentValue();
        showCurrentValue();
    }
}
