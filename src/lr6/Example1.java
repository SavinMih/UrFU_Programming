package lr6;

public class Example1 {
    int numField = 0;
    String stringField = "0";

    public void changeValue(int newValue) {
        numField = newValue;
    }
    public void changeValue(String newValue) {
        stringField = newValue;
    }
    public void changeValue(char[] newValue) {
        if (newValue.length > 0) {
            stringField = new String(newValue);
        }
    }
}
