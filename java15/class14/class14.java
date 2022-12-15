package class14;

class PrePaid {
    public int sum = 200;

    public void talk(int n) {
        int tmp = sum;
        try {
            Thread.sleep((int) (1000 * Math.random()));
        } catch (InterruptedException e) {
        }
        sum = tmp - n;
        show(n);
    }
    // 這樣子第二個電話亭不會等第一個電話亭扣款完之後就行動，第三個電話亭不會等第二個電話亭扣款完之後就行動，以此類推，所以餘額一定會出現錯誤

    public synchronized void show(int n) {
        if (sum > 10) {
            System.out.println("通話費:" + n);
            System.out.println("sum= " + sum);
        }
    }
    // 因為show有synchronized，所以執行緒可以排隊一個一個印出來
}

class Phone extends Thread {
    PrePaid card;

    Phone(PrePaid _card) {
        card = _card;
    }

    int fee = (int) ((Math.random()) * 100);

    public void run() {
        while (card.sum > 10) {
            card.talk(fee);
        }
    }
}

public class class14 {
    public static void main(String[] args) {
        PrePaid card = new PrePaid();
        Phone[] phones = new Phone[3];
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Phone(card);
        }
        for (int i = 0; i < phones.length; i++) {
            phones[i].start();
        }

    }
}