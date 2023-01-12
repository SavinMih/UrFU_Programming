package lr7.Example4;

public class SubClass extends SuperClass {
    public String stringField;

    public SubClass(char charField, String stringField) {
        super(charField);
        this.stringField = stringField;
    }

    @Override
    public SubClass getCopy() {
        return new SubClass(charField, stringField);
    }
}
