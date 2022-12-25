package lr5;

public class Example6 {
    private int min = 0;
    private int max = 0;

    public Example6(int value) {
        if (value > max) {
            max = value;
        } else {
            min = value;
        }
    }
    public Example6(int firstValue, int secondValue) {
        max = Math.max(firstValue, secondValue);
        min = Math.min(firstValue, secondValue);
    }

    public void changeValues(int value) {
        if (value > max) {
            max = value;
        } else {
            min = value;
        }
    }
    public void changeValues(int firstValue, int secondValue) {
        max = Math.max(firstValue, secondValue);
        min = Math.min(firstValue, secondValue);
    }

    public void printValues() {
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
