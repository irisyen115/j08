package class06;

import java.io.*;

public class class06 {
    public static void main(String[] args) {
        char data[] = new char[128];
        try {
            FileReader fr = new FileReader(".\\txt\\train.txt");

            int num = fr.read(data);
            String str = new String(data, 0, num);
            System.out.println("Characters read= " + num);
            System.out.println(str);

            fr.close();
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
