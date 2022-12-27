public class tqc508 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 3, 5, 7, 6, 9, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            for (int v : a) {
                System.out.print(v + " ");
            }
            System.out.println("");
        }
    }
}
