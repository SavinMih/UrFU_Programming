package lr7.Example5;

public class Main {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass("sup");
        sup.logSelf();
        SubClassOne sub1 = new SubClassOne("sub1", 1);
        sub1.logSelf();
        SubClassTwo sub2 = new SubClassTwo("sub2", '2');
        sub2.logSelf();
    }
}
