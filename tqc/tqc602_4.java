import java.util.LinkedList;

class Order {
    public LinkedList<Double> o = new LinkedList<Double>();

    public double revernue(LinkedList<Double> o) {
        double sum = 0;
        for (int i = 0; i < o.size(); i++) {
            sum += o.get(i);
        }
        return sum;
    }
}

public class tqc602_4 {
    public static void main(String[] args) {
        Order order = new Order();
        MiniNote mNote = new MiniNote();
        Note15 note15 = new Note15();
        PC pc = new PC();
        order.o.add(mNote.getPrice());
        order.o.add(note15.getPrice());
        order.o.add(pc.getPrice());
        System.out.println(order.revernue(order.o));
    }
}
