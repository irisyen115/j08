class PC {
    CPU cpu = new CPU(2.4);
    HD hd = new HD(160);
    public double pcost = cpu.cost + hd.cost;

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

    CPU cpu = new CPU(2.4);
    HD hd = new HD(160);

    Multipc(double c, double h) {
        cn = c;
        hn = h;
    }

    public double getCost() {
        return (cn * cpu.cost) + (hn * hd.cost) * 1.2;
    }

    public double getPrice() {
        return (cn * cpu.cost) + (hn * hd.cost) * 1.8;
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
