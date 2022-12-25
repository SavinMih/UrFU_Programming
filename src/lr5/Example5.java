package lr5;

public class Example5 {
    private int value;

    public Example5() {
        this.value = 0;
    }
    public Example5(int newValue) {
        this.value = newValue;
    }

    public void changeValue() {
        this.value = 0;
    }
    public void changeValue(int newValue) {
        this.value = Math.min(newValue, 100);
    }

    public void printValue() {
        System.out.println(this.value);
    }
}
