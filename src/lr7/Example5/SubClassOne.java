package lr7.Example5;

public class SubClassOne extends SuperClass {
    protected int intField;

    public SubClassOne(String stringField, int intField) {
        super(stringField);
        this.intField = intField;
    }
    @Override
    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + ", intField = " + this.intField + " }");
    }
}
