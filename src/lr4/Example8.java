package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = id.nextLine();
        System.out.println("Введите ключ");
        int key = id.nextInt();

        String encrypted = getEncryptString(string, key, true);

        System.out.println("Зашифрованная строка: " + encrypted);
        System.out.println("Разшифровать (Y/N):");
        String yn = id.next();
        System.out.println(yn.toLowerCase());
        if (yn.toLowerCase().equals("y")) {
            String decrypted = getEncryptString(encrypted, key, false);
            System.out.println(decrypted);
        }
    }
    public static String getEncryptString(String encryptString, int shift, boolean encrypt) {
        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        if (encrypt) {
            for (int i = 0; i < ArrayChar.length; i++) {
                ArrayInt[i] = ArrayChar[i] + shift;
                ArrayCharNew[i] = (char) ArrayInt[i];
            }
        } else {
            for (int i = 0; i < ArrayChar.length; i++) {
                ArrayInt[i] = ArrayChar[i] - shift;
                ArrayCharNew[i] = (char) ArrayInt[i];
            }
        }
        encryptString = new String(ArrayCharNew);
        return encryptString;
    }
}
