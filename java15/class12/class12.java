package class12;

class CTest extends Thread {
    String id;

    CTest(String str) {
        this.id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(id + " is running..Priority=" + this.getPriority());
        }
    }

}

public class class12 {
    public static void main(String[] args) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");

        hi.setPriority(Thread.MAX_PRIORITY);
        morning.setPriority(7);
        night.setPriority(3);
        bye.setPriority(Thread.MIN_PRIORITY);

        hi.start();
        bye.start();
        morning.start();
        night.start();
    }
}
