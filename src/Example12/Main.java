package Example12;

import java.io.File;
import java.util.ArrayList;

import static java.lang.System.out;

public class Main {
    private final static char[] ruChars = "бвгджзйклмнпрстфхцчшщ".toCharArray();

    public static void main(String[] args) {
        try {
            var fileInfo = Functions.FileReadCollection("C:\\tmp\\f1.txt");
            var file = new File("C:\\tmp\\f2.txt");
            file.delete();
            file.createNewFile();
            for (int i = 0; i < fileInfo.size(); i++) {
                var line = fileInfo.get(i);
                var wordsToLine = line.split(",| ");
                var wordsToFile = new ArrayList<String>();
                if (wordsToLine.length != 0) {
                    for (String word : wordsToLine)
                        if (word.length() != 0 && isCharConsonant(word.charAt(0)))
                            wordsToFile.add(word);
                }
                Functions.FileWrite("C:\\tmp\\f2.txt", true, String.format("%d - ", i + 1));
                Functions.FileWriteCollection("C:\\tmp\\f2.txt", true, wordsToFile, ", ");
                Functions.FileWrite("C:\\tmp\\f2.txt", true, String.format(" (%d слов(а))\n", wordsToFile.size()));
            }
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
    private static boolean isCharConsonant(char character) {
        for (char consonant: ruChars)
            if(Character.toLowerCase(character) == Character.toLowerCase(consonant))
                return true;
        return false;
    }
}
