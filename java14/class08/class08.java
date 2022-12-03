package class08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class class08 {
    public static void main(String[] args) throws IOException {
        char[] data1 = new char[128];
        char[] data2 = new char[128];
        FileWriter fw = new FileWriter(".\\txt\\ccc.txt");
        FileReader fr1 = new FileReader(".\\txt\\aaa.txt");
        FileReader fr2 = new FileReader(".\\txt\\bbb.txt");

        int num1 = fr1.read(data1);
        int num2 = fr2.read(data2);
        String str1 = new String(data1, 0, num1);
        String str2 = new String(data2, 0, num2);
        fw.write(str1);
        fw.write(str2);

        fw.close();
        fr1.close();
        fr2.close();
    }
}
