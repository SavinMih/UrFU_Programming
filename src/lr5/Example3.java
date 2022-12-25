package lr5;

public class Example3 {
    private int firstValue;
    private int secondValue;

    public Example3() {
        this.firstValue = 0;
        this.secondValue = 0;
    }
    public Example3(int value) {
        this.firstValue = value;
        this.secondValue = value;
    }
    public Example3(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void printValues() {
        System.out.println("Первое значение " + firstValue);
        System.out.println("Второе значение " + secondValue);
    }
}
