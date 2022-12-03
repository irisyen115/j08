package class05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c:\\Users\\iris\\xd\\oophw\\java14\\txt\\donkey.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String str;
        bfr.skip(9);
        while ((str = bfr.readLine()) != null) {
            System.out.println(str);
        }

        fr.close();
    }
}
