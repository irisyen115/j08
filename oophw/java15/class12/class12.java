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
            System.out.println(id + " is running...");
        }
    }

}

public class class12 {
    public static void main(String[] args) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        CTest night = new CTest("Good night");

        hi.start();
        try {
            hi.join();
            morning.start();
            morning.join();
            night.start();
            night.join();
            bye.start();
            bye.join();
        } catch (InterruptedException e) {
        }
        System.out.println("All Threads are finished");
    }
}
