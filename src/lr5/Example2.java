package lr5;

public class Example2 {
    public void main(String[] args) {
        int smallerCode = 0;
        int biggerCode = 0;
        if ((int)firstValue <= (int)secondValue) {
            smallerCode = (int)firstValue;
        } else {
            biggerCode = (int)secondValue;
        }

        for (int iterator = smallerCode; iterator <= biggerCode; iterator++) {
            System.out.println((char)iterator);
        }
    }
    private char firstValue = 'A';
    private char secondValue = 'Z';
}
