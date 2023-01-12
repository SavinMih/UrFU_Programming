package lr7.Example5;

public class SuperClass {
    protected String stringField;

    public SuperClass(String stringField) {
        this.stringField = stringField;
    }

    public void logSelf() {
        System.out.println(getClass().getName() + "{ stringField = " + this.stringField + " }");
    }
}
