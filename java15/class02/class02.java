package class02;

class CTest extends Thread {
    // (a)
    String id;

    CTest(String str) {
        this.id = str;
    }

    // (b)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(id + " " + i);
        }
    }

}

public class class02 {
    public static void main(String[] args) {
        // (c)
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        hi.run();
        bye.run();
    }
}
// (d) 詳情請見class02(d).jpg