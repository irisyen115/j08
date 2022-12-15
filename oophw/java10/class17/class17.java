package class17;

class Car {
    protected String owner;
    protected String id;

    // (a)
    Car(String own, String s) {
        owner = own;
        id = s;
    }

    void show() {
        System.out.println("owner: " + owner);
        System.out.println("id: " + id);
    }
}

// (b)
class CColor extends Car {
    private String color;

    // (c)
    CColor(String own, String s, String col) {
        super(own, s);
        color = col;
    }

    // (d)
    void show() {
        System.out.println("owner: " + owner);
        System.out.println("id: " + id);
        System.out.println("color: " + color);
    }
}

public class class17 {
    public static void main(String[] args) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.show();
    }
}
// (e)加入final會終止繼承，把final去掉就可以正常執行