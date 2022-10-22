package class08;

class CWin {
    public static int cnt = 0;
    private String color;
    private int width;
    private int height;

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
        color = "Red";
        width = 2;
        height = 2;
    }

    void show() {
        System.out.println("color=" + color + " " + "width=" + width + " " + "height=" + height);
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
        win1.show();
        CWin win2 = new CWin("Bule", 5, 10);
        win2.show();
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
