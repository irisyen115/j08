package class10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class class10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\Users\\iris\\xd\\oophw\\java14\\txt\\rand.txt");
        BufferedWriter bfw = new BufferedWriter(fw);

        for (int i = 0; i < 1000; i++) {
            bfw.write((int) ((Math.random()) * 100000));
            bfw.newLine();
        }

        bfw.flush();
        fw.close();

        FileReader fr = new FileReader("c:\\Users\\iris\\xd\\oophw\\java14\\txt\\rand.txt");
        BufferedReader bfr = new BufferedReader(fr);
        int[] data = new int[1000];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(bfr.readLine());
            System.out.println(data[i]);
        }

        fr.close();
    }
}
