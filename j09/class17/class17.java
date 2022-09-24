class Namecard {
    private String name;
    private String address;
    private Phone data;

    // (a)
    class Phone {
        public String company;
        public String cell;

        // (b)
        Phone(String s1, String s2) {
            company = s1;
            cell = s2;
        }

        void show_phone() {
            System.out.println("公司電話:" + company);
            System.out.println("手機電話:" + cell);
        }
    }

    Namecard(String n, String a, String dco, String dce) {
        name = n;
        address = a;
        data = new Phone(dco, dce);
    }

    // (c)
    void show() {
        System.out.println("好友姓名:" + name);
        System.out.println("聯絡地址:" + address);
        data.show_phone();
    }
}

public class class17 {
    public static void main(String[] args) {
        // (d)
        Namecard first = new Namecard("Andy", "123City", "2345-6789", "0911-336600");
        first.show();
    }
}
