package class10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class class10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./txt/rand.txt");
        BufferedWriter bfw = new BufferedWriter(fw);

        for (int i = 0; i < 1000; i++) {
            String r = String.valueOf((int) (Math.random() * 100000) + 1);
            bfw.write(r);
            bfw.newLine();
        }

        bfw.flush();
        fw.close();

        FileReader fr = new FileReader("./txt/rand.txt");
        BufferedReader bfr = new BufferedReader(fr);
        int[] data = new int[1000];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(bfr.readLine());
        }

        Arrays.sort(data);
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        // (b)
        System.out.println("min=" + data[0]);
        System.out.println("max=" + data[data.length - 1]);
        System.out.println("avg=" + sum / (data.length));

        // (c)
        FileWriter fw2 = new FileWriter("./txt/rand2.txt");
        BufferedWriter bfw2 = new BufferedWriter(fw2);

        for (int i = 0; i < data.length; i++) {
            String r2 = String.valueOf(data[i]);
            bfw2.write(r2);
            bfw2.newLine();
        }

        bfw2.flush();
        fw2.close();
        fr.close();
    }
}
