package class11;

import java.io.FileInputStream;
import java.io.IOException;

public class class11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("c:\\Users\\iris\\xd\\oophw\\java14\\txt\\number.txt");
        byte[] ba = new byte[fi.available()];

        fi.read(ba);
        System.out.println(new String(ba));
        fi.close();
    }
}
