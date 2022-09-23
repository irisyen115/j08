class CCircle {
    double pi = 3.14;

    double area(double r) {
        return Math.pow(r, 2) * pi;
    }

    float area(float r) {
        double a = (Math.pow(r, 2) * pi);
        float ans = (float) a;
        return ans;
    }

    int area(int r) {
        double a = (Math.pow(r, 2) * pi);
        int ans = (int) a;
        return ans;
    }
}

public class class13 {
    public static void main(String[] args) {
        CCircle circle1;
        circle1 = new CCircle();
        System.out.println(circle1.area(2));
        System.out.println(circle1.area(2.2f));
        System.out.println(circle1.area(2.2));
    }
}
