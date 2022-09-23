class CWin {
    public static int cnt = 0;
    public static String color;
    public static int width;
    public static int height;

    public static void count() {
        cnt++;
    }

    public static void CWin(String str, int w, int h) {
        color = str;
        width = w;
        height = h;
    }

    public static void setZero() {
        cnt = 0;
    }

    public static void setValue(int n) {
        cnt = n;
    }
}

public class class08 {
    public static void main(String[] args) {
        CWin.count();
        CWin.count();
        System.out.println(CWin.cnt);
        CWin.setZero();
        System.out.println(CWin.cnt);
        CWin.setValue(8);
        System.out.println(CWin.cnt);
    }
}
