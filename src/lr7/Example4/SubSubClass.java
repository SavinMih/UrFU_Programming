package lr7.Example4;

public class SubSubClass extends SubClass{
    public int intField;

    public SubSubClass(char charField, String stringField, int intField) {
        super(charField, stringField);
        this.intField = intField;
    }

    @Override
    public SubSubClass getCopy() {
        return new SubSubClass(charField, stringField, intField);
    }
}
