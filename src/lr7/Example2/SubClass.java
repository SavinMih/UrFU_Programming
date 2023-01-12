package lr7.Example2;

public class SubClass extends SuperClass{
    public int newField;

    public SubClass(String field, int newField) {
        super(field);
        this.newField = newField;
    }

    @Override
    public void setField() {
        super.setField();
        newField = 0;
    }

    @Override
    public void setField(String field) {
        super.setField(field);
        newField = 0;
    }

    public void setField(int newField) {
        this.newField = newField;
    }

    public void setField(String field, int newField) {
        super.setField(field);
        this.newField = newField;
    }
}
