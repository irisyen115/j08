package class09;

import java.io.FileReader;
import java.io.IOException;

public class class09 {
    public static void main(String[] args) throws IOException {
        char[] data = new char[128];
        char[] data1 = new char[128];
        char[] data2 = new char[128];

        FileReader fr = new FileReader("./txt/ccc.txt");
        FileReader fr1 = new FileReader("./txt/aaa.txt");
        FileReader fr2 = new FileReader("./txt/bbb.txt");

        int num1 = fr1.read(data1);
        int num2 = fr2.read(data2);
        String str1 = new String(data1, 0, num1);
        String str2 = new String(data2, 0, num2);

        int num = fr.read(data);
        String str = new String(data, 0, num);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str);

        fr1.close();
        fr2.close();
        fr.close();
    }
}
