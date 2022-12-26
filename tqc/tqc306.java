import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tqc306 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] t;
        int m = 0;
        int n = 0;
        while (m >= 0) {
            System.out.println("Input:");
            int ans = 1;
            t = bf.readLine().split(" ");
            m = Integer.parseInt(t[0]);
            n = Integer.parseInt(t[1]);
            if (m == 999) {
                break;
            }
            for (int i = 0; i < n; i++) {
                ans *= m;
            }
            System.out.println(ans);
        }
    }
}
