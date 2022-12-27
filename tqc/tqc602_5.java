public class tqc602_5 {
    public static void main(String[] args) {
        Order order = new Order();
        MiniNote mNote = new MiniNote();
        Note15 note15 = new Note15();
        PC pc = new PC();
        order.o.add(mNote.getPrice() - mNote.getCost());
        order.o.add(note15.getPrice() - note15.getCost());
        order.o.add(pc.getPrice() - pc.getCost());
        if (order.revernue(order.o) > 2000) {
            System.out.println("This order exceeds 20000:" + order.revernue(order.o));
        }
    }
}
