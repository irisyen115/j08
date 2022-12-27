class PC {
    public double pcost = CPU.fast24 + HD.sixteen;

    public double getCost() {
        return pcost + 500;
    }

    public double getPrice() {
        return pcost * 1.8;
    }
}

class Multipc {
    double cn;
    double hn;

    Multipc(double c, double h) {
        cn = c;
        hn = h;
    }

    public double getCost() {
        return (cn * CPU.fast24) + (hn * HD.sixteen) * 1.2;
    }

    public double getPrice() {
        return (cn * CPU.fast24) + (hn * HD.sixteen) * 1.8;
    }
}

public class tqc602_2 {
    public static void main(String[] args) {
        PC pc = new PC();
        Multipc mpc1 = new Multipc(2, 4);
        Multipc mpc2 = new Multipc(4, 8);
        System.out.println("PC cost:" + pc.getCost() + ", price:" + pc.getPrice());
        System.out.println("Multipc 2CPU, 4HD, cost:" + mpc1.getCost() + ", price:" + mpc1.getPrice());
        System.out.println("Multipc 4CPU, 8HD, cost:" + mpc2.getCost() + ", price:" + mpc2.getPrice());
    }
}
