package class19;

class CRectangle {
    protected int length;
    protected int width;

    // (a)
    CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    public String toString() {
        return "length=" + length + " " + "width=" + width + " " + "area=" + length * width;
    }

}

public class class19 {
    public static void main(String[] args) {
        // (b)
        CRectangle rect = new CRectangle(2, 6);
        // (c)
        System.out.println(rect.toString());
    }
}
