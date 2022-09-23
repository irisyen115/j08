package class12;

class CWin {
    int width;
    int height;
    String name;

    // (a)
    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    // (b)
    void setWindow(int w, int h) {
        width = w;
        height = h;
    }

    // (c)
    void setWindows(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }

    public void show() {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }
}

public class class12 {
    public static void main(String args[]) {
        CWin cw = new CWin();
        cw.setName("My Windows");
        cw.setW(5);
        cw.setH(3);
        cw.setWindow(5, 3);
        cw.setWindows(5, 3, "My windows");
        cw.show();
    }
}
