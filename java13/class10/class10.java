package class10;

class RadiusIsToolarge extends Exception {

}

class RadiusIsNegative extends Exception {

}

class CCircle {
    private double triedRadius;
    private double radius;

    public void setRadios(double r) throws RadiusIsToolarge, RadiusIsNegative {
        triedRadius = r;
        if (r < 0) {
            throw new RadiusIsNegative();
        } else if (r > 100) {
            throw new RadiusIsToolarge();
        } else {
            radius = r;
        }
    }

    public void show() {
        if (triedRadius < 0) {
            System.out.println("請輸入正整數");
        } else if (triedRadius > 100) {
            System.out.println("請輸入小於一百的正整數");
        } else {
            System.out.println("area=" + 3.14 * radius * radius);
        }
    }
}

public class class10 {
    public static void main(String[] args) {
        CCircle cir = new CCircle();
        try {
            cir.setRadios(1000);
        } catch (RadiusIsNegative e) {
            System.out.println(e + "throwed");
        } catch (RadiusIsToolarge e) {
            System.out.println(e + "throwed");
        }
        cir.show();
    }
}
