package lr7.Example3;

public class SubSubClass extends SubClass{
    public String stringField;

    public SubSubClass(int intField, char charField, String stringField) {
        super(intField, charField);
        this.stringField = stringField;
    }

    public void setField(int intField, char charField, String stringField) {
        super.setField(intField, charField);
        this.stringField = stringField;
    }

    public String toString() {
        return getClass().getName() + "{ intField = " + this.intField + ", charField = " + this.charField + ", stringField = " + this.stringField + " }";
    }
}
