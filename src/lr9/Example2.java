package lr9;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
//            Недоступный кусок кода
//            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
