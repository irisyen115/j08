package class08;

class CWin {
    public static int cnt = 0;
    public String color;
    public int width;
    public int height;

    // (a)
    public static void count() {
        System.out.println(cnt);
    }

    // (b)
    CWin(String str, int w, int h) {
        cnt++;
        color = str;
        width = w;
        height = h;
    }

    // (c)
    CWin() {
        cnt++;
        color = "red";
        width = 2;
        height = 2;
    }

    // (d)
    public static void setZero() {
        cnt = 0;
    }

    // (e)
    public static void setValue(int n) {
        cnt = n;
    }
}

public class class08 {
    public static void main(String[] args) {
        CWin win1 = new CWin();
        System.out.println("color=" + win1.color + " " + "width=" + win1.width + " " + "height=" + win1.height);
        CWin win2 = new CWin("bull", 5, 10);
        System.out.println("color=" + win2.color + " " + "width=" + win2.width + " " + "height=" + win2.height);
        CWin.count();
        CWin.setZero();
        CWin.count();
        CWin.setValue(10);
        CWin.count();
    }
}

// (f) 類別變數，static是直接屬於class的行為或資料，而物件本身又是由class所生產，想要直接知道所有的cnt就需要static
// cnt以知曉class本身有多少cnt
// (g) 都可以，static method可以不用初始化物件，instance method要先初始化物件
