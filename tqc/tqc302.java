public class tqc302 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                count += 3;
            }
            count += 3;
        }
        System.out.println("count = " + count);
    }
}