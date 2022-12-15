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
        CTest[] tests = {
                new CTest("Hello"),
                new CTest("Good bye"),
                new CTest("Good morning"),
                new CTest("Good night")
        };

        for (int i = 0; i < tests.length; i++) {
            tests[i].start();
            try {
                tests[i].join();
            } catch (InterruptedException e) {
            }
        }

        //
        System.out.println("All Threads are finished");
    }
}
