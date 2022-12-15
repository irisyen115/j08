package class07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class class07 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./txt/donkey.txt");
        BufferedReader bfr = new BufferedReader(fr);
        String str;
        int count = 0;
        while ((str = bfr.readLine()) != null) {
            if (count == 1) {
                bfr.skip(14);
            }
            System.out.println(str);
            count++;
        }

        fr.close();

    }
}
