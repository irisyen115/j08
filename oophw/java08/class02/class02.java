package class02;

class Cbbb {
    double x;
    double y;
}

public class class02 {
    public static void main(String[] args) {

        // (a)
        Cbbb obj1 = new Cbbb();
        Cbbb obj2 = new Cbbb();
        Cbbb avg = new Cbbb();

        // (b)
        obj1.x = 5.2;
        obj1.y = 3.9;

        // (c)
        obj2.x = 6.5;
        obj2.y = 4.6;

        // (d)
        avg.x = (obj1.x + obj2.x) / 2;

        // (e)
        avg.y = (obj1.y + obj2.y) / 2;

        // (f)
        System.out.println("obj1.x=" + obj1.x + "," + "obj1.y=" + obj1.y);
        System.out.println("obj2.x=" + obj2.x + "," + "obj2.y=" + obj2.y);
        System.out.println("avg.x=" + avg.x + "," + "avg.y=" + avg.y);
    }
}