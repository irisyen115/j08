package class05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./txt/donkey.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String str;
        bfr.readLine();
        while ((str = bfr.readLine()) != null) {
            System.out.println(str);
        }

        fr.close();
    }
}
