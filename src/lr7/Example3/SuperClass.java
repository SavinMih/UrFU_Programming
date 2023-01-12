package lr7.Example3;

public class SuperClass {
    public int intField;

    public SuperClass(int intField) {
        this.intField = intField;
    }

    public void setField(int intField) {
        this.intField = intField;
    }

    public String toString() {
        return getClass().getName() + "{ intField = " + this.intField + " }";
    }
}
