package lr7.Example2;

public class SuperClass {
    private String field;

    public SuperClass(String field) {
        this.field = field;
    }

    public String getField() {
        return this.field;
    }

    public int getFieldLength() {
        if (this.field == null) {
            return 0;
        } else {
            return this.field.length();
        }
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setField() {
        this.field = null;
    }
}
