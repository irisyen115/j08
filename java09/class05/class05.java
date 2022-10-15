package class05;

class CCount {

    // (a)
    public static int cnt = 0;

    CCount() {
        cnt++;
    }

    // public void count() {
    // System.out.println(cnt);
    // }

    public static void count() {
        System.out.println(cnt);
    }

    // (b)

    public static void setZero() {
        cnt = 0;
    }

    // (c)

    public static void setValue(int n) {
        cnt = n;
    }
}

public class class05 {
    public static void main(String[] args) {
        CCount count1 = new CCount();
        count1.count();
        CCount.setZero();
        CCount.count();
        CCount.setValue(8);
        CCount.count();
    }
}
// (d) 類別變數，static是直接屬於class的行為或資料，而物件本身又是由class所生產，想要直接知道所有的cnt就需要static
// cnt以知曉class本身有多少cnt
// (e) 都可以，static method可以不用初始化物件，instance method要先初始化物件
