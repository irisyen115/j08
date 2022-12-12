package class10;

class CTest extends Thread {
    String id;

    CTest(String str) {
        this.id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep((int) (2000 * Math.random()));
            } catch (InterruptedException e) {
            }
            System.out.println(id + " " + i);
        }
    }

}

public class class10 {
    public static void main(String[] args) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");
        hi.start();
        bye.start();
        morning.start();
        night.start();
    }
}
