package lr7.Example4;

public class SuperClass {
    public char charField;

    public SuperClass(char charField) {
        this.charField = charField;
    }

    public SuperClass getCopy() {
        return new SuperClass(this.charField);
    }
}
