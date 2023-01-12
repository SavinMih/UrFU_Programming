package lr7.Example3;

public class SubClass extends SuperClass{
    public char charField;

    public SubClass(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    public void setField(int intField, char charField) {
        super.setField(intField);
        this.charField = charField;
    }

    public String toString() {
        return getClass().getName() + "{ intField = " + this.intField + ", charField = " + this.charField + " }";
    }
}
