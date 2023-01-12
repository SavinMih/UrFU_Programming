package lr7.Example1;

public class SubClass extends SuperClass {

    private String newField;

    public SubClass(String field) {
        super(field);
        this.newField = field;
    }

    public SubClass(String field, String newField) {
        super(field);
        this.newField = newField;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{ field = " + super.getField() + ", newField = " + this.newField + " }";
    }
}
