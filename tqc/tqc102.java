import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 102
 */
public class tqc102 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input: ");
        String text1 = bf.readLine();
        double i1 = Double.parseDouble(text1);
        String k = String.format("%.6f", i1);
        String p = String.format("%.6f", (i1 * 2.20462));
        System.out.print(k + " kg  = " + p + " ponds ");
        bf.close();
    }
}