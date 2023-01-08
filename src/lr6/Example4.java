package lr6;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(recurringMethod(6));
        System.out.println(notRecurringMethod(6));
    }

    public static int recurringMethod(int number) {
        if (number > 0) {
            if (number <= 2) {
                return number;
            } else {
                return number * recurringMethod(number - 2);
            }
        } else {
            System.out.println("Неверное значение");
            return number;
        }
    }

    public static int notRecurringMethod(int number) {
        if (number > 0) {
            int result = 1;
            for (int iterator = number; iterator >= 2; iterator -= 2) {
                result *= iterator;
            }
            return result;
        } else {
            System.out.println("Неверное значение");
            return number;
        }
    }
}
