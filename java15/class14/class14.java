package class14;

class PrePaid extends Thread {
    private static int sum = 200;

    public synchronized static void talk(int n) {
        sum -= n;
        try {
            Thread.sleep((int) (1000 * Math.random()));
        } catch (InterruptedException e) {
        }
        System.out.println("sum= " + sum);
    }

    public void run() {
        int fee = (int) ((Math.random()) * 99);
        if (sum >= 10) {
            talk(fee);
        }
    }
}

public class class14 {
    public static void main(String[] args) {
        PrePaid card1 = new PrePaid();
        PrePaid card2 = new PrePaid();
        PrePaid card3 = new PrePaid();
        card1.start();
        card2.start();
        card3.start();
    }
}
