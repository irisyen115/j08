class LCD {
    public static double ten = 2000;
    public static double fifteen = 2500;
    public static double seventeen = 3000;
}

class CPU {
    public static double slow166 = 6000;
    public static double midiun22 = 8000;
    public static double fast24 = 11000;
}

class HD {
    public static double twelve = 2400;
    public static double sixteen = 2800;
}

class MiniNote {
    public double mcost = LCD.ten + CPU.slow166 + HD.twelve;

    public double getCost() {
        return mcost * 1.4;
    }

    public double getPrice() {
        return mcost * 2.0;
    }
}

class Note15 {
    public double ncost = LCD.fifteen + CPU.midiun22 + HD.sixteen;

    public double getCost() {
        return ncost * 1.4;
    }

    public double getPrice() {
        return ncost * 2.0;
    }
}

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

public class tqc602_1 {
    public static void main(String[] args) {
        MiniNote mNote = new MiniNote();
        Note15 note15 = new Note15();
        System.out.println("MiniNote cost:" + mNote.getCost() + ", price:" + mNote.getPrice());
        System.out.println("Note15 cost:" + note15.getCost() + ", price:" + note15.getPrice());
    }
}
