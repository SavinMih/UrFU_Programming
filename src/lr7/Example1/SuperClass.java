package lr7.Example1;

public class SuperClass {
    private String field;

    public SuperClass(String field) {
        this.field = field;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{ field = " + this.field + "}";
    }
}
