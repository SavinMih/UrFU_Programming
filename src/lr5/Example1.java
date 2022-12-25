package lr5;

import java.util.Scanner;

public class Example1 {
    public void main(String[] args) {
        System.out.println("Введите символ: ");

        Scanner in = new Scanner(System.in);

        char newValue = in.nextLine().charAt(0);

        this.changeValue(newValue);
        this.printField();
    }
    private char closedField = 'A';
    public void changeValue(char newValue) {
        closedField = newValue;
    }
    public int getFieldCode() {
        return closedField;
    }
    public void printField() {
        System.out.println("Значение поля: " + closedField);
        System.out.println("Код поля: " + this.getFieldCode());
    }
}
