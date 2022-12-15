package class06;

class Add implements Runnable {
    private int n;
    private int sum = 0;

    public Add(int a) {
        n = a;
    }

    public void run() {
        sum += ((1 + n) * n) / 2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100000000; j++)
                ;
            System.out.println(sum + " is running");
        }
    }
}

public class class06 {
    public static void main(String[] args) {
        Add five = new Add(5);
        Add ten = new Add(10);
        Thread t1 = new Thread(five);
        Thread t2 = new Thread(ten);
        t1.start();
        t2.start();
    }
}
