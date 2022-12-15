package class04;

import java.io.FileReader;
import java.io.IOException;

public class class04 {
    public static void main(String[] args) throws IOException {
        char[] data = new char[128];
        FileReader fr = new FileReader("./txt/donkey.txt");

        int num = fr.read(data);
        String str = new String(data, 0, num);
        // (a)
        System.out.println("Characters read= " + num);
        System.out.println(str);

        fr.close();
    }
}
// (b) 不一樣，因為多了換行兩個/r/n，詳情請見class04-(b).jpg