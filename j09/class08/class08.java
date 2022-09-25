// 全錯，cnt 應為 static
class CWin {
    public static int cnt = 0;
    public static String color;
    public static int width;
    public static int height;

    // (a)
    public static void count() {
        cnt++;
    }

    // (b)
    CWin(String str, int w, int h) {
        color = str;
        width = w;
        height = h;
    }

    // (c)
    CWin() {
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
        CWin.count();
        System.out.println(CWin.cnt);
        CWin.setZero();
        System.out.println(CWin.cnt);
        CWin.setValue(10);
        System.out.println(CWin.cnt);
    }
}
