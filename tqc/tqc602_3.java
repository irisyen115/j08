class AllPC {
    public static boolean isExpensive(Note15 n, PC p) {
        return n.getPrice() > p.getPrice();
    }
}

public class tqc602_3 {
    public static void main(String[] args) {
        Note15 note15 = new Note15();
        PC pc = new PC();
        if (AllPC.isExpensive(note15, pc)) {
            System.out.println("Note15 is more expensive than PC");
        } else {
            System.out.println("PC is more expensive than Note15");
        }
    }
}
