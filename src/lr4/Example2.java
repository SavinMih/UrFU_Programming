package lr4;

public class Example2 {
    public static void main(String[] args) {
        int length = 15;

        for (int iterator = 0; iterator < length; iterator++) {
            System.out.println("|"+"_".repeat(length-(length-iterator))+"\\");
        }
    }
}
