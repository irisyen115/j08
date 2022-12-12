package class09;

class CTest extends Thread {
    String id;
    int s;

    CTest(String str, int sc) {
        this.id = str;
        this.s = sc;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(s);
            } catch (InterruptedException e) {
            }
            System.out.println(id + " " + "is running");
        }
    }

}

public class class09 {
    public static void main(String[] args) {
        CTest t1 = new CTest("thread 1", 1000);
        CTest t2 = new CTest("thread 2", 2500);
        t1.start();
        t2.start();
    }
}
