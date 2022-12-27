class LCD {
    double cost;

    LCD(int i) {
        if (i == 10) {
            cost = 2000;
        } else if (i == 15) {
            cost = 2500;
        } else {
            cost = 3000;
        }
    }
}

class CPU {
    double cost;

    CPU(double i) {
        if (i == 1.66) {
            cost = 6000;
        } else if (i == 2.2) {
            cost = 8000;
        } else {
            cost = 11000;
        }
    }
}

class HD {
    double cost;

    HD(int i) {
        if (i == 120) {
            cost = 2400;
        } else {
            cost = 2800;
        }
    }
}

class MiniNote {
    LCD lcd = new LCD(10);
    CPU cpu = new CPU(1.66);
    HD hd = new HD(120);
    public double mcost = lcd.cost + cpu.cost + hd.cost;

    public double getCost() {
        return mcost * 1.4;
    }

    public double getPrice() {
        return mcost * 2.0;
    }
}

class Note15 {
    LCD lcd = new LCD(15);
    CPU cpu = new CPU(2.2);
    HD hd = new HD(160);
    public double ncost = lcd.cost + cpu.cost + hd.cost;

    public double getCost() {
        return ncost * 1.4;
    }

    public double getPrice() {
        return ncost * 2.0;
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
