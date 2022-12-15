// OK
package class20;

class CRectangle {
    protected int length;
    protected int width;

    CRectangle(int l, int w) {
        length = l;
        width = w;
    }

    public String toString(int a, int b) {
        if (a < b) {
            return "Argument Error";
        }
        return toString();
    }
}

public class class20 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(6, 5);
        System.out.println(rect.toString());
        System.out.println(rect.toString(4, 5));
        System.out.println(rect.toString(6, 5));
    }
}
// (c)用了overloading (多載)