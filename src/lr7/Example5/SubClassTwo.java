package lr7.Example5;

public class SubClassTwo extends SuperClass{
    protected char charField;

    public SubClassTwo(String stringField, char charField) {
        super(stringField);
        this.charField = charField;
    }

    @Override
    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + ", charField = " + this.charField + " }");
    }
}
