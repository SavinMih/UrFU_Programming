package Example11;

import java.io.*;
import java.util.ArrayList;

public class Functions {
    static <T> void FileWrite(String path, boolean append, T ...collection) throws IOException {
        FileWriteArray(path, append, collection);
    }
    static <T> void FileWriteArray(String path, boolean append, T[] collection) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path, append));
            for (int i = 0; i < collection.length; i++)
                bw.write(String.valueOf(collection[i]) + '\n');
        } finally {
            bw.close();
        }
    }
    static ArrayList<String> FileReadArray(String path) throws IOException {
        var fileInfo = new ArrayList<String>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null)
                fileInfo.add(line);
        } finally {
            br.close();
        }
        return fileInfo;
    }
}
