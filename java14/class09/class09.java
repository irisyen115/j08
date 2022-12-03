package class09;

import java.io.FileReader;
import java.io.IOException;

public class class09 {
    public static void main(String[] args) throws IOException {
        char[] data = new char[128];

        FileReader fr = new FileReader(".\\txt\\ccc.txt");

        int num = fr.read(data);
        String str = new String(data, 0, num);

        System.out.println(str);

        fr.close();
    }
}
