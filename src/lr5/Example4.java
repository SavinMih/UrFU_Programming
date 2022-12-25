package lr5;

public class Example4 {
    private int firstValue;
    private char secondValue;

    public Example4(int firstValue, char secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public Example4(double combinedValue) {
        secondValue = (char)((int)combinedValue);
        firstValue = (((int)combinedValue)*100)%100;
    }
}
