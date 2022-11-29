package class10;

class RadiusIsToolarge extends Exception {

}

class RadiusIsNegative extends Exception {

}

class CCircle {
    private double radius;

    public void setRadios(double r) throws RadiusIsToolarge, RadiusIsNegative {
        if (r < 0) {
            throw new RadiusIsNegative();
        } else if (r > 100) {
            throw new RadiusIsToolarge();
        } else {
            radius = r;
        }
    }

    public void show() {
        System.out.println("area=" + 3.14 * radius * radius);
    }
}

public class class10 {
    public static void main(String[] args) {
        CCircle cir = new CCircle();
        try {
            cir.setRadios(2);
            cir.show();
        } catch (RadiusIsNegative e) {
            System.out.println(e + "throwed");
        } catch (RadiusIsToolarge e) {
            System.out.println(e + "throwed");
        }

    }
}
