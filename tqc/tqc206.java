import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tqc206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            System.out.print("Input Chinese score:");
            int cs = Integer.parseInt(bf.readLine());
            System.out.print("Input English score:");
            int es = Integer.parseInt(bf.readLine());
            System.out.print("Input Math score:");
            int ms = Integer.parseInt(bf.readLine());
            if (cs >= 60 && es >= 60 && ms >= 60) {
                System.out.println("All pass.");
            } else {
                if (cs < 60) {
                    System.out.println("Chinese failed.");
                }
                if (es < 60) {
                    System.out.println("English failed.");
                }
                if (ms < 60) {
                    System.out.println("Math failed.");
                }
            }
        }

    }
}
