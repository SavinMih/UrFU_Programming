package lr6;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(recurringMethod(6));
        System.out.println(notRecurringMethod(6));
    }

    public static int recurringMethod(int number) {
        if (number >= 0) {
            if (number == 0) {
                return number;
            } else {
                return number*number + recurringMethod(number - 1);
            }
        } else {
            System.out.println("Неверное значение");
            return number;
        }
    }

    public static int notRecurringMethod(int number) {
        if (number >= 0) {
            int result = 0;
            for (int iterator = number; iterator >= 0; iterator --) {
                result += iterator*iterator;
            }
            return result;
        } else {
            System.out.println("Неверное значение");
            return number;
        }
    }
}
